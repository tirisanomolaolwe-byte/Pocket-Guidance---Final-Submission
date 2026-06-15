package com.pocketguidance.ui.activities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\u000bH\u0002J\u0012\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000bH\u0002J\b\u0010\u0013\u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/pocketguidance/ui/activities/BudgetsActivity;", "Lcom/pocketguidance/ui/activities/BaseActivity;", "()V", "TAG", "", "adapter", "Lcom/pocketguidance/ui/adapters/BudgetAdapter;", "binding", "Lcom/pocketguidance/databinding/ActivityBudgetsBinding;", "currency", "loadCategorySpinner", "", "observeBudgets", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setupAddButton", "setupRecyclerView", "app_release"})
public final class BudgetsActivity extends com.pocketguidance.ui.activities.BaseActivity {
    private com.pocketguidance.databinding.ActivityBudgetsBinding binding;
    private com.pocketguidance.ui.adapters.BudgetAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "BudgetsActivity";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currency = "R";
    
    public BudgetsActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void loadCategorySpinner() {
    }
    
    private final void setupAddButton() {
    }
    
    private final void observeBudgets() {
    }
}