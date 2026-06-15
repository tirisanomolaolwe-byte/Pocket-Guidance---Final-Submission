package com.pocketguidance

import com.pocketguidance.data.db.dao.CategoryTotal
import com.pocketguidance.utils.SpendingInsightsHelper
import org.junit.Assert.*
import org.junit.Test

class SpendingInsightsHelperTest {

    @Test
    fun noDataReturnsEmptyInsights() {
        val result = SpendingInsightsHelper.generate(
            thisMonth = emptyList(), lastMonth = emptyList()
        )
        assertTrue(result.isEmpty())
    }

    @Test
    fun newCategoryThisMonthTriggersNewSpendingInsight() {
        val thisMonth = listOf(CategoryTotal("Food", 500.0))
        val lastMonth = emptyList<CategoryTotal>()
        val result = SpendingInsightsHelper.generate(thisMonth, lastMonth)
        assertTrue(result.any { it.message.contains("Food") })
    }

    @Test
    fun spendingIncreaseOver50PercentShowsRedInsight() {
        val thisMonth = listOf(CategoryTotal("Transport", 900.0))
        val lastMonth = listOf(CategoryTotal("Transport", 500.0))
        val result = SpendingInsightsHelper.generate(thisMonth, lastMonth)
        assertTrue(result.any { it.emoji == "" })
    }

    @Test
    fun spendingDecreaseOver20PercentShowsGreenInsight() {
        val thisMonth = listOf(CategoryTotal("Food", 300.0))
        val lastMonth = listOf(CategoryTotal("Food", 500.0))
        val result = SpendingInsightsHelper.generate(thisMonth, lastMonth)
        assertTrue(result.any { it.emoji == "" })
    }

    @Test
    fun exceedingMaxBudgetShowsWarningInsight() {
        val result = SpendingInsightsHelper.generate(
            thisMonth  = listOf(CategoryTotal("Shopping", 2500.0)),
            lastMonth  = emptyList(),
            maxGoal    = 2000.0,
            totalSpent = 2500.0
        )
        assertTrue(result.any { it.emoji == "" })
    }

    @Test
    fun at80PercentOfBudgetShowsTimeWarning() {
        val result = SpendingInsightsHelper.generate(
            thisMonth  = emptyList(),
            lastMonth  = emptyList(),
            maxGoal    = 2000.0,
            totalSpent = 1700.0
        )
        assertTrue(result.any { it.emoji == "" })
    }

    @Test
    fun resultIsCappedAt4Insights() {
        val thisMonth = listOf(
            CategoryTotal("Food", 900.0),
            CategoryTotal("Transport", 900.0),
            CategoryTotal("Shopping", 900.0),
            CategoryTotal("Health", 900.0),
            CategoryTotal("Rent", 900.0)
        )
        val result = SpendingInsightsHelper.generate(thisMonth, emptyList(), maxGoal = 500.0, totalSpent = 4500.0)
        assertTrue(result.size <= 4)
    }
}
