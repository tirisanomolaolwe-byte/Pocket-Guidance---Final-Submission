package com.pocketguidance.utils

import com.pocketguidance.data.db.dao.CategoryTotal
import kotlin.math.abs

/**
 * Custom Feature 1: Spending Insights
 * Generates plain-language tips by comparing this month's category spending
 * against last month's totals. Displayed on the Dashboard as a tips card.
 */
object SpendingInsightsHelper {

    data class Insight(val emoji: String, val message: String)

    /**
     * @param thisMonth  category totals for the current month
     * @param lastMonth  category totals for the previous month
     * @param currency   e.g. "R"
     * @param maxGoal    the user's max monthly spending goal (0 = not set)
     * @param totalSpent total spent this month across all categories
     */
    fun generate(
        thisMonth:  List<CategoryTotal>,
        lastMonth:  List<CategoryTotal>,
        currency:   String  = "R",
        maxGoal:    Double  = 0.0,
        totalSpent: Double  = 0.0
    ): List<Insight> {
        val insights = mutableListOf<Insight>()

        val thisMap = thisMonth.associate { it.category to it.total }
        val lastMap = lastMonth.associate { it.category to it.total }

        // Compare each category this month vs last month
        thisMap.forEach { (cat, thisTotal) ->
            val lastTotal = lastMap[cat]
            if (lastTotal != null && lastTotal > 0) {
                val changePct = ((thisTotal - lastTotal) / lastTotal) * 100
                when {
                    changePct >= 50 ->
                        insights.add(Insight("",
                            "$cat spending is up ${changePct.toInt()}% vs last month " +
                                    "(${currency}${"%.0f".format(lastTotal)} → ${currency}${"%.0f".format(thisTotal)})"))
                    changePct >= 20 ->
                        insights.add(Insight("",
                            "$cat spending increased ${changePct.toInt()}% vs last month"))
                    changePct <= -20 ->
                        insights.add(Insight("",
                            "Great! $cat spending is down ${abs(changePct).toInt()}% vs last month"))
                }
            } else if (lastTotal == null) {
                // New category this month
                insights.add(Insight("", "New spending in $cat: ${currency}${"%.2f".format(thisTotal)}"))
            }
        }

        // Budget goal warning
        if (maxGoal > 0) {
            val pct = (totalSpent / maxGoal) * 100
            when {
                pct >= 100 ->
                    insights.add(Insight("",
                        "You've exceeded your monthly budget of ${currency}${"%.2f".format(maxGoal)}"))
                pct >= 80 ->
                    insights.add(Insight("",
                        "You've used ${pct.toInt()}% of your monthly budget — only " +
                                "${currency}${"%.2f".format(maxGoal - totalSpent)} remaining"))
                pct < 30 && totalSpent > 0 ->
                    insights.add(Insight("",
                        "Excellent pacing! You've only used ${pct.toInt()}% of your budget so far"))
            }
        }

        // Top spender tip
        val topCat = thisMap.maxByOrNull { it.value }
        if (topCat != null) {
            insights.add(Insight("",
                "Your biggest expense this month is ${topCat.key} at " +
                        "${currency}${"%.2f".format(topCat.value)}"))
        }

        return insights.take(4) // Show max 4 insights to keep the card concise
    }
}