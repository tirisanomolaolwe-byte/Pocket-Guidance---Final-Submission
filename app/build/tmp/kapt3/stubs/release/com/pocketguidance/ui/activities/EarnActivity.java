package com.pocketguidance.ui.activities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002J\u0012\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0002J\b\u0010\u001d\u001a\u00020\u0014H\u0002J\b\u0010\u001e\u001a\u00020\u0014H\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0012\u00a8\u0006 "}, d2 = {"Lcom/pocketguidance/ui/activities/EarnActivity;", "Lcom/pocketguidance/ui/activities/BaseActivity;", "()V", "TAG", "", "allCourses", "", "Lcom/pocketguidance/ui/activities/Course;", "answerAdapter", "Lcom/pocketguidance/ui/adapters/QuizAnswerAdapter;", "binding", "Lcom/pocketguidance/databinding/ActivityEarnBinding;", "currency", "currentCourse", "currentQuestionIndex", "", "score", "selectedAnswer", "Ljava/lang/Integer;", "advanceQuiz", "", "finishQuiz", "course", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setupAnswerRecyclerView", "showCourseList", "showQuestion", "startQuiz", "app_release"})
public final class EarnActivity extends com.pocketguidance.ui.activities.BaseActivity {
    private com.pocketguidance.databinding.ActivityEarnBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "EarnActivity";
    @org.jetbrains.annotations.Nullable()
    private com.pocketguidance.ui.activities.Course currentCourse;
    private int currentQuestionIndex = 0;
    private int score = 0;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer selectedAnswer;
    private com.pocketguidance.ui.adapters.QuizAnswerAdapter answerAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String currency = "R";
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.pocketguidance.ui.activities.Course> allCourses = null;
    
    public EarnActivity() {
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
    
    private final void showCourseList() {
    }
    
    private final void startQuiz(com.pocketguidance.ui.activities.Course course) {
    }
    
    private final void showQuestion() {
    }
    
    private final void setupAnswerRecyclerView() {
    }
    
    private final void advanceQuiz() {
    }
    
    private final void finishQuiz(com.pocketguidance.ui.activities.Course course) {
    }
}