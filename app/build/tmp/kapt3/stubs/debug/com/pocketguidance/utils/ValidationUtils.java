package com.pocketguidance.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000e\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0006J\u0015\u0010\u0015\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0016\u00a8\u0006\u0017"}, d2 = {"Lcom/pocketguidance/utils/ValidationUtils;", "", "()V", "isValidAmount", "", "input", "", "isValidBudgetGoals", "min", "", "max", "isValidDate", "date", "isValidDescription", "desc", "isValidEmail", "email", "isValidPassword", "password", "isValidUsername", "username", "parseAmount", "(Ljava/lang/String;)Ljava/lang/Double;", "app_debug"})
public final class ValidationUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.pocketguidance.utils.ValidationUtils INSTANCE = null;
    
    private ValidationUtils() {
        super();
    }
    
    public final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    public final boolean isValidPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    public final boolean isValidUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return false;
    }
    
    public final boolean isValidAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return false;
    }
    
    public final boolean isValidDate(@org.jetbrains.annotations.NotNull()
    java.lang.String date) {
        return false;
    }
    
    public final boolean isValidDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String desc) {
        return false;
    }
    
    public final boolean isValidBudgetGoals(double min, double max) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double parseAmount(@org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
}