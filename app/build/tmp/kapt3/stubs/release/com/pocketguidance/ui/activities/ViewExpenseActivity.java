package com.pocketguidance.ui.activities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0012\u0010\u0013\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0017H\u0002J\b\u0010\u001a\u001a\u00020\u0012H\u0002J\b\u0010\u001b\u001a\u00020\u0012H\u0002J\b\u0010\u001c\u001a\u00020\u0012H\u0002J\b\u0010\u001d\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001e"}, d2 = {"Lcom/pocketguidance/ui/activities/ViewExpenseActivity;", "Lcom/pocketguidance/ui/activities/BaseActivity;", "()V", "TAG", "", "adapter", "Lcom/pocketguidance/ui/adapters/TransactionAdapter;", "binding", "Lcom/pocketguidance/databinding/ActivityViewExpensesBinding;", "currency", "currentTransactions", "", "Lcom/pocketguidance/data/db/entities/TransactionEntity;", "endDate", "observeJob", "Lkotlinx/coroutines/Job;", "startDate", "observeTransactions", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "pickDate", "isStart", "setupDateFilters", "setupExportButton", "setupFilterButton", "setupRecyclerView", "app_release"})
public final class ViewExpenseActivity extends com.pocketguidance.ui.activities.BaseActivity {
    private com.pocketguidance.databinding.ActivityViewExpensesBinding binding;
    private com.pocketguidance.ui.adapters.TransactionAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "ViewExpensesActivity";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String startDate;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String endDate;
    @org.jetbrains.annotations.Nullable()
    private kotlinx.coroutines.Job observeJob;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currency = "R";
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.pocketguidance.data.db.entities.TransactionEntity> currentTransactions;
    
    public ViewExpenseActivity() {
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
    
    private final void setupDateFilters() {
    }
    
    private final void setupFilterButton() {
    }
    
    private final void setupExportButton() {
    }
    
    private final void pickDate(boolean isStart) {
    }
    
    private final void observeTransactions() {
    }
}