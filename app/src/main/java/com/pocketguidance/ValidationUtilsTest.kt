package com.pocketguidance

import com.pocketguidance.utils.ValidationUtils
import org.junit.Assert.*
import org.junit.Test

class ValidationUtilsTest {

    // ── Amount validation

    @Test
    fun validPositiveAmountReturnsTrue() {
        assertTrue(ValidationUtils.isValidAmount("150.50"))
    }

    @Test
    fun zeroAmountReturnsFalse() {
        assertFalse(ValidationUtils.isValidAmount("0"))
    }

    @Test
    fun negativeAmountReturnsFalse() {
        assertFalse(ValidationUtils.isValidAmount("-50"))
    }

    @Test
    fun blankAmountReturnsFalse() {
        assertFalse(ValidationUtils.isValidAmount(""))
    }

    @Test
    fun nonNumericAmountReturnsFalse() {
        assertFalse(ValidationUtils.isValidAmount("abc"))
    }

    // Description

    @Test
    fun nonBlankDescriptionReturnsTrue() {
        assertTrue(ValidationUtils.isValidDescription("Groceries at Woolworths"))
    }

    @Test
    fun blankDescriptionReturnsFalse() {
        assertFalse(ValidationUtils.isValidDescription("   "))
    }

    @Test
    fun emptyDescriptionReturnsFalse() {
        assertFalse(ValidationUtils.isValidDescription(""))
    }

    // Budget goal validation

    @Test
    fun minLessThanMaxIsValid() {
        assertTrue(ValidationUtils.isValidBudgetGoals(500.0, 2000.0))
    }

    @Test
    fun minEqualToMaxIsInvalid() {
        assertFalse(ValidationUtils.isValidBudgetGoals(1000.0, 1000.0))
    }

    @Test
    fun minGreaterThanMaxIsInvalid() {
        assertFalse(ValidationUtils.isValidBudgetGoals(3000.0, 1000.0))
    }

    @Test
    fun zeroMaxGoalIsInvalid() {
        assertFalse(ValidationUtils.isValidBudgetGoals(0.0, 0.0))
    }

    // Password validation

    @Test
    fun passwordOf6CharsIsValid() {
        assertTrue(ValidationUtils.isValidPassword("abc123"))
    }

    @Test
    fun passwordShorterThan6CharsIsInvalid() {
        assertFalse(ValidationUtils.isValidPassword("abc"))
    }

    @Test
    fun blankPasswordIsInvalid() {
        assertFalse(ValidationUtils.isValidPassword(""))
    }
}
