package com.pocketguidance.ui.activities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\nH\u0002J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/pocketguidance/ui/activities/CategoryActivity;", "Lcom/pocketguidance/ui/activities/BaseActivity;", "()V", "TAG", "", "adapter", "Lcom/pocketguidance/ui/adapters/CategoryAdapter;", "binding", "Lcom/pocketguidance/databinding/ActivityCategoryBinding;", "deleteCategory", "", "category", "Lcom/pocketguidance/data/db/entities/CategoryEntity;", "observeCategories", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setupAddButton", "setupRecyclerView", "app_debug"})
public final class CategoryActivity extends com.pocketguidance.ui.activities.BaseActivity {
    private com.pocketguidance.databinding.ActivityCategoryBinding binding;
    private com.pocketguidance.ui.adapters.CategoryAdapter adapter;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "CategoryActivity";
    
    public CategoryActivity() {
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
    
    private final void setupAddButton() {
    }
    
    private final void observeCategories() {
    }
    
    private final void deleteCategory(com.pocketguidance.data.db.entities.CategoryEntity category) {
    }
}