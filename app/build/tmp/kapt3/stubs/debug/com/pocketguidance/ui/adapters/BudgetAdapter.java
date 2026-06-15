package com.pocketguidance.ui.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00102\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0010\u0011B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u001c\u0010\f\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/pocketguidance/ui/adapters/BudgetAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/pocketguidance/data/db/entities/BudgetEntity;", "Lcom/pocketguidance/ui/adapters/BudgetAdapter$ViewHolder;", "currency", "", "(Ljava/lang/String;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Companion", "ViewHolder", "app_debug"})
public final class BudgetAdapter extends androidx.recyclerview.widget.ListAdapter<com.pocketguidance.data.db.entities.BudgetEntity, com.pocketguidance.ui.adapters.BudgetAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String currency = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.pocketguidance.data.db.entities.BudgetEntity> DIFF = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.pocketguidance.ui.adapters.BudgetAdapter.Companion Companion = null;
    
    public BudgetAdapter(@org.jetbrains.annotations.NotNull()
    java.lang.String currency) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.pocketguidance.ui.adapters.BudgetAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.ui.adapters.BudgetAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/pocketguidance/ui/adapters/BudgetAdapter$Companion;", "", "()V", "DIFF", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/pocketguidance/data/db/entities/BudgetEntity;", "getDIFF", "()Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.recyclerview.widget.DiffUtil.ItemCallback<com.pocketguidance.data.db.entities.BudgetEntity> getDIFF() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/pocketguidance/ui/adapters/BudgetAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "b", "Lcom/pocketguidance/databinding/ItemBudgetBinding;", "(Lcom/pocketguidance/ui/adapters/BudgetAdapter;Lcom/pocketguidance/databinding/ItemBudgetBinding;)V", "bind", "", "budget", "Lcom/pocketguidance/data/db/entities/BudgetEntity;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.pocketguidance.databinding.ItemBudgetBinding b = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.pocketguidance.databinding.ItemBudgetBinding b) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.pocketguidance.data.db.entities.BudgetEntity budget) {
        }
    }
}