package com.pocketguidance.ui.activities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0004J\b\u0010\u0019\u001a\u00020\u0014H\u0004R\u0014\u0010\u0003\u001a\u00020\u00048DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\f8DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u001a"}, d2 = {"Lcom/pocketguidance/ui/activities/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "app", "Lcom/pocketguidance/PocketGuidanceApp;", "getApp", "()Lcom/pocketguidance/PocketGuidanceApp;", "authRepo", "Lcom/pocketguidance/data/repository/AuthRepository;", "getAuthRepo", "()Lcom/pocketguidance/data/repository/AuthRepository;", "financeRepo", "Lcom/pocketguidance/data/repository/FinanceRepository;", "getFinanceRepo", "()Lcom/pocketguidance/data/repository/FinanceRepository;", "userId", "", "getUserId", "()J", "navigateTo", "", "cls", "Ljava/lang/Class;", "finish", "", "requireLogin", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.pocketguidance.PocketGuidanceApp getApp() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.pocketguidance.data.repository.FinanceRepository getFinanceRepo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.pocketguidance.data.repository.AuthRepository getAuthRepo() {
        return null;
    }
    
    protected final long getUserId() {
        return 0L;
    }
    
    protected final void navigateTo(@org.jetbrains.annotations.NotNull()
    java.lang.Class<?> cls, boolean finish) {
    }
    
    protected final void requireLogin() {
    }
}