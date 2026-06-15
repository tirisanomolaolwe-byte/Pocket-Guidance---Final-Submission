package com.pocketguidance.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0002J&\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/pocketguidance/utils/SessionManager;", "", "()V", "KEY_EMAIL", "", "KEY_USERNAME", "KEY_USER_ID", "PREF_NAME", "clearSession", "", "context", "Landroid/content/Context;", "getEmail", "getUserId", "", "getUsername", "isLoggedIn", "", "prefs", "Landroid/content/SharedPreferences;", "saveSession", "userId", "username", "email", "app_release"})
public final class SessionManager {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREF_NAME = "pg_session";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_USER_ID = "userId";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_USERNAME = "username";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String KEY_EMAIL = "email";
    @org.jetbrains.annotations.NotNull()
    public static final com.pocketguidance.utils.SessionManager INSTANCE = null;
    
    private SessionManager() {
        super();
    }
    
    private final android.content.SharedPreferences prefs(android.content.Context context) {
        return null;
    }
    
    public final void saveSession(@org.jetbrains.annotations.NotNull()
    android.content.Context context, long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public final long getUserId(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    public final boolean isLoggedIn(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public final void clearSession(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
}