package com.pocketguidance.ui.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0018B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u0005H\u0016J\u001c\u0010\u000f\u001a\u00020\u00062\n\u0010\u0010\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u001c\u0010\u0012\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0016J-\u0010\u0016\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0017R\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\t\u00a8\u0006\u0019"}, d2 = {"Lcom/pocketguidance/ui/adapters/QuizAnswerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/pocketguidance/ui/adapters/QuizAnswerAdapter$ViewHolder;", "onSelect", "Lkotlin/Function1;", "", "", "(Lkotlin/jvm/functions/Function1;)V", "correctIndex", "Ljava/lang/Integer;", "options", "", "", "selectedAnswer", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setAnswers", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Integer;)V", "ViewHolder", "app_release"})
public final class QuizAnswerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.pocketguidance.ui.adapters.QuizAnswerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> onSelect = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> options;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedAnswer;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer correctIndex;
    
    public QuizAnswerAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> onSelect) {
        super();
    }
    
    public final void setAnswers(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> options, @org.jetbrains.annotations.Nullable()
    java.lang.Integer selectedAnswer, @org.jetbrains.annotations.Nullable()
    java.lang.Integer correctIndex) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.pocketguidance.ui.adapters.QuizAnswerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.pocketguidance.ui.adapters.QuizAnswerAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/pocketguidance/ui/adapters/QuizAnswerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "b", "Lcom/pocketguidance/databinding/ItemQuizAnswerBinding;", "(Lcom/pocketguidance/ui/adapters/QuizAnswerAdapter;Lcom/pocketguidance/databinding/ItemQuizAnswerBinding;)V", "bind", "", "index", "", "text", "", "app_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.pocketguidance.databinding.ItemQuizAnswerBinding b = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.pocketguidance.databinding.ItemQuizAnswerBinding b) {
            super(null);
        }
        
        public final void bind(int index, @org.jetbrains.annotations.NotNull()
        java.lang.String text) {
        }
    }
}