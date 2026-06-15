package com.pocketguidance.utils;

/**
 * Custom Feature 1: Spending Insights
 * Generates plain-language tips by comparing this month's category spending
 * against last month's totals. Displayed on the Dashboard as a tips card.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JF\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f\u00a8\u0006\u000f"}, d2 = {"Lcom/pocketguidance/utils/SpendingInsightsHelper;", "", "()V", "generate", "", "Lcom/pocketguidance/utils/SpendingInsightsHelper$Insight;", "thisMonth", "Lcom/pocketguidance/data/db/dao/CategoryTotal;", "lastMonth", "currency", "", "maxGoal", "", "totalSpent", "Insight", "app_release"})
public final class SpendingInsightsHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.pocketguidance.utils.SpendingInsightsHelper INSTANCE = null;
    
    private SpendingInsightsHelper() {
        super();
    }
    
    /**
     * @param thisMonth  category totals for the current month
     * @param lastMonth  category totals for the previous month
     * @param currency   e.g. "R"
     * @param maxGoal    the user's max monthly spending goal (0 = not set)
     * @param totalSpent total spent this month across all categories
     */
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.pocketguidance.utils.SpendingInsightsHelper.Insight> generate(@org.jetbrains.annotations.NotNull()
    java.util.List<com.pocketguidance.data.db.dao.CategoryTotal> thisMonth, @org.jetbrains.annotations.NotNull()
    java.util.List<com.pocketguidance.data.db.dao.CategoryTotal> lastMonth, @org.jetbrains.annotations.NotNull()
    java.lang.String currency, double maxGoal, double totalSpent) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lcom/pocketguidance/utils/SpendingInsightsHelper$Insight;", "", "emoji", "", "message", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmoji", "()Ljava/lang/String;", "getMessage", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
    public static final class Insight {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String emoji = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        public Insight(@org.jetbrains.annotations.NotNull()
        java.lang.String emoji, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getEmoji() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.pocketguidance.utils.SpendingInsightsHelper.Insight copy(@org.jetbrains.annotations.NotNull()
        java.lang.String emoji, @org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}