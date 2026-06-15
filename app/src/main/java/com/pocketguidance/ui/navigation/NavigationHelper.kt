package com.pocketguidance.ui.navigation

import android.app.Activity
import android.content.Intent
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pocketguidance.R
import com.pocketguidance.ui.activities.*

object NavigationHelper {

    fun setupBottomNavigation(
        activity: Activity,
        nav: BottomNavigationView,
        selectedItem: Int
    ) {

        nav.selectedItemId = selectedItem

        nav.setOnItemSelectedListener {

            when(it.itemId){

                R.id.nav_dashboard -> {
                    if(activity !is DashboardActivity){
                        activity.startActivity(
                            Intent(activity, DashboardActivity::class.java)
                        )
                    }
                    true
                }

                R.id.nav_expenses -> {
                    if(activity !is ViewExpenseActivity){
                        activity.startActivity(
                            Intent(activity, ViewExpenseActivity::class.java)
                        )
                    }
                    true
                }

                R.id.nav_budget -> {
                    if(activity !is BudgetsActivity){
                        activity.startActivity(
                            Intent(activity, BudgetsActivity::class.java)
                        )
                    }
                    true
                }

                R.id.nav_categories -> {
                    if(activity !is CategoryActivity){
                        activity.startActivity(
                            Intent(activity, CategoryActivity::class.java)
                        )
                    }
                    true
                }

                R.id.nav_rewards -> {
                    if(activity !is EarnActivity){
                        activity.startActivity(
                            Intent(activity, EarnActivity::class.java)
                        )
                    }
                    true
                }

                else -> false
            }
        }
    }
}