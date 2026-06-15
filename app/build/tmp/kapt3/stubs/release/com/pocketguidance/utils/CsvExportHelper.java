package com.pocketguidance.utils;

/**
 * Custom Feature 2: CSV Export
 * Writes a list of transactions to a .csv file in the app's external files
 * directory and returns a shareable content URI so the user can open it in
 * any spreadsheet app (Google Sheets, Excel, etc.).
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J2\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u00a8\u0006\u0010"}, d2 = {"Lcom/pocketguidance/utils/CsvExportHelper;", "", "()V", "buildShareIntent", "Landroid/content/Intent;", "uri", "Landroid/net/Uri;", "exportToCsv", "context", "Landroid/content/Context;", "transactions", "", "Lcom/pocketguidance/data/db/entities/TransactionEntity;", "currency", "", "fileName", "app_release"})
public final class CsvExportHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.pocketguidance.utils.CsvExportHelper INSTANCE = null;
    
    private CsvExportHelper() {
        super();
    }
    
    /**
     * Creates a CSV file and returns a content:// URI for sharing.
     * Returns null if writing fails.
     */
    @org.jetbrains.annotations.Nullable()
    public final android.net.Uri exportToCsv(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.pocketguidance.data.db.entities.TransactionEntity> transactions, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, @org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
    
    /**
     * Builds a share Intent from the URI returned by exportToCsv().
     */
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent buildShareIntent(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
}