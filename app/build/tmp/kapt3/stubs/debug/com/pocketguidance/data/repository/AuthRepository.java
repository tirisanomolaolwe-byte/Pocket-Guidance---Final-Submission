package com.pocketguidance.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00a2\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006H\u0002J<\u0010\u0017\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\b\b\u0002\u0010\u001a\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u001bJ\u001e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010 J&\u0010!\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010$J\u001e\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010 J\u001e\u0010&\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0006H\u0086@\u00a2\u0006\u0002\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/pocketguidance/data/repository/AuthRepository;", "", "db", "Lcom/pocketguidance/data/db/AppDatabase;", "(Lcom/pocketguidance/data/db/AppDatabase;)V", "TAG", "", "getSecurityQuestion", "email", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserById", "Lcom/pocketguidance/data/db/entities/UserEntity;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "login", "password", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resetPassword", "", "newPassword", "sha256", "input", "signup", "username", "securityQuestion", "securityAnswer", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAvatar", "", "userId", "path", "(JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateSecurityQuestion", "question", "answer", "(JLjava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateUsername", "verifySecurityAnswer", "app_debug"})
public final class AuthRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.pocketguidance.data.db.AppDatabase db = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "AuthRepository";
    
    public AuthRepository(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.data.db.AppDatabase db) {
        super();
    }
    
    private final java.lang.String sha256(java.lang.String input) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object login(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object signup(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String securityQuestion, @org.jetbrains.annotations.NotNull()
    java.lang.String securityAnswer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Long> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getUserById(long id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.pocketguidance.data.db.entities.UserEntity> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getSecurityQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.String> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object verifySecurityAnswer(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String answer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object resetPassword(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.lang.String newPassword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateUsername(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateAvatar(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateSecurityQuestion(long userId, @org.jetbrains.annotations.NotNull()
    java.lang.String question, @org.jetbrains.annotations.NotNull()
    java.lang.String answer, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}