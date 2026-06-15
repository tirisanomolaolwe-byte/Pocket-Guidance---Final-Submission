package com.pocketguidance.ui.activities;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\rH\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\b\u0010\u000f\u001a\u00020\rH\u0002J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0014H\u0002J\b\u0010\u0017\u001a\u00020\rH\u0002J\u0010\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/pocketguidance/ui/activities/ForgotPasswordActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "authRepo", "Lcom/pocketguidance/data/repository/AuthRepository;", "binding", "Lcom/pocketguidance/databinding/ActivityForgotPasswordBinding;", "currentStep", "Lcom/pocketguidance/ui/activities/ForgotPasswordActivity$Step;", "verifiedEmail", "handleEmailStep", "", "handleNewPasswordStep", "handleSecurityQuestionStep", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSupportNavigateUp", "", "setLoading", "loading", "setupListeners", "showStep", "step", "Step", "app_debug"})
public final class ForgotPasswordActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.pocketguidance.databinding.ActivityForgotPasswordBinding binding;
    private com.pocketguidance.data.repository.AuthRepository authRepo;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG = "ForgotPasswordActivity";
    @org.jetbrains.annotations.NotNull()
    private com.pocketguidance.ui.activities.ForgotPasswordActivity.Step currentStep = com.pocketguidance.ui.activities.ForgotPasswordActivity.Step.EMAIL;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String verifiedEmail = "";
    
    public ForgotPasswordActivity() {
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
    
    private final void setupListeners() {
    }
    
    private final void handleEmailStep() {
    }
    
    private final void handleSecurityQuestionStep() {
    }
    
    private final void handleNewPasswordStep() {
    }
    
    private final void showStep(com.pocketguidance.ui.activities.ForgotPasswordActivity.Step step) {
    }
    
    private final void setLoading(boolean loading) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/pocketguidance/ui/activities/ForgotPasswordActivity$Step;", "", "(Ljava/lang/String;I)V", "EMAIL", "SECURITY_QUESTION", "NEW_PASSWORD", "app_debug"})
    static enum Step {
        /*public static final*/ EMAIL /* = new EMAIL() */,
        /*public static final*/ SECURITY_QUESTION /* = new SECURITY_QUESTION() */,
        /*public static final*/ NEW_PASSWORD /* = new NEW_PASSWORD() */;
        
        Step() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<com.pocketguidance.ui.activities.ForgotPasswordActivity.Step> getEntries() {
            return null;
        }
    }
}