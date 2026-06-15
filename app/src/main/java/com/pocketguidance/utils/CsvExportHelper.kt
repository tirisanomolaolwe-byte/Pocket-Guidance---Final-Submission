package com.pocketguidance.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.core.content.FileProvider
import com.pocketguidance.data.db.entities.TransactionEntity
import java.io.File
import java.io.FileWriter

/**
 * Custom Feature 2: CSV Export
 * Writes a list of transactions to a .csv file in the app's external files
 * directory and returns a shareable content URI so the user can open it in
 * any spreadsheet app (Google Sheets, Excel, etc.).
 */
object CsvExportHelper {

    /**
     * Creates a CSV file and returns a content:// URI for sharing.
     * Returns null if writing fails.
     */
    fun exportToCsv(
        context: Context,
        transactions: List<TransactionEntity>,
        currency: String = "R",
        fileName: String = "pocket_guidance_export.csv"
    ): Uri? {
        return try {
            val dir  = context.getExternalFilesDir("exports") ?: context.filesDir
            val file = File(dir, fileName)

            FileWriter(file).use { writer ->
                // Header row
                writer.appendLine("Date,Type,Category,Description,Amount ($currency),Receipt")

                transactions.forEach { tx ->
                    val hasReceipt = if (tx.receiptPhotoPath != null) "Yes" else "No"
                    // Wrap description in quotes to handle commas inside text
                    val safDesc = "\"${tx.description.replace("\"", "\"\"")}\""
                    writer.appendLine(
                        "${tx.date},${tx.type},${tx.category},$safDesc," +
                                "${"%.2f".format(tx.amount)},$hasReceipt"
                    )
                }
            }

            // Return a FileProvider URI so other apps can read the file
            FileProvider.getUriForFile(context, "${context.packageName}.provider", file)

        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

    /**
     * Builds a share Intent from the URI returned by exportToCsv().
     */
    fun buildShareIntent(uri: Uri): Intent {
        return Intent(Intent.ACTION_SEND).apply {
            type     = "text/csv"
            putExtra(Intent.EXTRA_STREAM, uri)
            putExtra(Intent.EXTRA_SUBJECT, "Pocket Guidance — Expense Export")
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
        }
    }
}