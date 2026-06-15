package com.pocketguidance.ui.activities

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.pocketguidance.utils.SessionManager


@SuppressLint("CustomSplashScreen")
class SplashActivity : BaseActivity() {

    private val TAG = "SplashActivity"

    override fun onCreate(savedInstanceState: Bundle?) {

        //Must be called before super.onCreate
        val splashScreen = installSplashScreen()

        super.onCreate(savedInstanceState)
        // No setContentView — splash screen IS the UI at this point

        Log.d(TAG, "SplashActivity created — checking session")

        // Session check is synchronous (SharedPreferences), so we don't need
        // to hold the splash on screen — let it dismiss immediately.
        splashScreen.setKeepOnScreenCondition { false }

        // Decide destination
        if (SessionManager.isLoggedIn(this)) {
            Log.i(TAG, "Session found → Dashboard")
            navigateTo(DashboardActivity::class.java, finish = true)
        } else {
            Log.i(TAG, "No session → Login")
            navigateTo(LoginActivity::class.java, finish = true)
        }
    }
}
