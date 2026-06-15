package com.pocketguidance.ui.activities

import android.app.DatePickerDialog
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.core.graphics.toColorInt
import androidx.lifecycle.lifecycleScope
import com.github.mikephil.charting.components.LimitLine
import com.github.mikephil.charting.components.XAxis
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter
import com.github.mikephil.charting.formatter.ValueFormatter
import com.pocketguidance.R
import com.pocketguidance.databinding.ActivityReportsBinding
import com.pocketguidance.ui.navigation.NavigationHelper
import com.pocketguidance.utils.FormatUtils
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Calendar

class ReportsActivity : BaseActivity() {

    private lateinit var binding: ActivityReportsBinding
    private var currency: String = "R"

    // Date range for category bar chart filter
    private var catFromDate: String = FormatUtils.firstDayOfMonthIso()
    private var catToDate:   String = FormatUtils.todayIso()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityReportsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        requireLogin()

        NavigationHelper.setupBottomNavigation(
            this,
            binding.bottomNavigation,
            R.id.nav_dashboard
        )

        supportActionBar?.apply {
            title = "Reports"
            setDisplayHomeAsUpEnabled(true)
        }

        setupLineChart()
        setupBarChart()
        observeData()
        setupListeners()
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }

    //Existing line chart setup
    private fun setupLineChart() {
        binding.spendingLineChart.apply {
            description.isEnabled = false
            setTouchEnabled(true)
            isDragEnabled = true
            setScaleEnabled(true)
            setPinchZoom(true)
            xAxis.position = XAxis.XAxisPosition.BOTTOM
            xAxis.setDrawGridLines(false)
            axisRight.isEnabled = false
            animateX(1000)
        }
    }

    // Category bar chart setup
    private fun setupBarChart() {
        binding.categoryBarChart.apply {
            description.isEnabled   = false
            legend.isEnabled        = false
            setTouchEnabled(true)
            setScaleEnabled(true)
            setPinchZoom(false)
            setDrawGridBackground(false)
            axisRight.isEnabled     = false
            xAxis.position          = XAxis.XAxisPosition.BOTTOM
            xAxis.granularity       = 1f
            xAxis.setDrawGridLines(false)
            xAxis.labelRotationAngle = -40f
            axisLeft.axisMinimum    = 0f
        }
    }

    // Observe prefs + expenses
    private fun observeData() {
        lifecycleScope.launch {
            financeRepo.getUserPrefs(userId).collectLatest { prefs ->
                currency = prefs?.currency ?: "R"
                val min = prefs?.minMonthlySpendingGoal ?: 0.0
                val max = prefs?.maxMonthlySpendingGoal ?: 0.0

                binding.etMinGoal.setText(if (min > 0) min.toString() else "")
                binding.etMaxGoal.setText(if (max > 0) max.toString() else "")

                updateLineChartGoalLines(min, max)
                calculatePerformance(min, max)
                loadCategoryBarChart(min, max)
            }
        }

        lifecycleScope.launch {
            financeRepo.getExpenses(userId).collectLatest { expenses ->
                updateSpendingTrend(expenses)
            }
        }
    }

    // Line chart month trend
    private fun updateLineChartGoalLines(min: Double, max: Double) {
        val yAxis = binding.spendingLineChart.axisLeft
        yAxis.removeAllLimitLines()
        if (max > 0) {
            yAxis.addLimitLine(
                LimitLine(max.toFloat(), "Max Goal").apply {
                    lineColor = "#EF4444".toColorInt()
                    lineWidth = 2f
                    textColor = "#EF4444".toColorInt()
                    textSize = 10f
                }
            )
        }
        if (min > 0) {
            yAxis.addLimitLine(
                LimitLine(min.toFloat(), "Min Goal").apply {
                    lineColor = "#22C55E".toColorInt()
                    lineWidth = 2f
                    textColor = "#22C55E".toColorInt()
                    textSize = 10f
                }
            )
        }
        binding.spendingLineChart.invalidate()
    }

    private fun updateSpendingTrend(
        expenses: List<com.pocketguidance.data.db.entities.TransactionEntity>
    ) {
        val now = LocalDate.now()
        val last6 = (0..5).map { now.minusMonths(it.toLong()) }.reversed()
        val entries = mutableListOf<Entry>()
        val labels  = mutableListOf<String>()

        last6.forEachIndexed { i, date ->
            val m = date.format(DateTimeFormatter.ofPattern("yyyy-MM"))
            val total = expenses.asSequence()
                .filter { it.date.startsWith(m) }
                .sumOf { it.amount }
            entries.add(Entry(i.toFloat(), total.toFloat()))
            labels.add(date.format(DateTimeFormatter.ofPattern("MMM")))
        }

        val dataSet = LineDataSet(entries, "Monthly Spending").apply {
            color = "#4F46E5".toColorInt()
            setCircleColor("#4F46E5".toColorInt())
            lineWidth = 3f
            circleRadius = 5f
            setDrawCircleHole(true)
            valueTextSize = 9f
            setDrawFilled(true)
            fillColor = "#4F46E5".toColorInt()
            fillAlpha = 30
            mode = LineDataSet.Mode.CUBIC_BEZIER
        }

        binding.spendingLineChart.apply {
            data = LineData(dataSet)
            xAxis.valueFormatter = object : ValueFormatter() {
                override fun getFormattedValue(value: Float) =
                    labels.getOrNull(value.toInt()) ?: ""
            }
            invalidate()
        }
    }

    // Category bar chart with per-category LimitLines
    private fun loadCategoryBarChart(globalMin: Double, globalMax: Double) {
        lifecycleScope.launch {
            val catTotals = financeRepo.getCategoryBreakdownInRange(userId, catFromDate, catToDate)
            val budgets   = financeRepo.getBudgetsOnce(userId)

            if (catTotals.isEmpty()) {
                binding.categoryBarChart.clear()
                binding.categoryBarChart.setNoDataText("No expenses for this period")
                binding.categoryBarChart.invalidate()
                return@launch
            }

            val budgetMap = budgets.associateBy({ it.category }, { it.limitAmount })
            val labels    = catTotals.map { it.category }

            // Bar color: red if over per-category limit, otherwise brand indigo
            val barColors = catTotals.map { ct ->
                val limit = budgetMap[ct.category] ?: 0.0
                if (limit > 0.0 && ct.total > limit) "#EF4444".toColorInt()
                else "#4F46E5".toColorInt()
            }

            val entries = catTotals.mapIndexed { i, ct ->
                BarEntry(i.toFloat(), ct.total.toFloat())
            }

            val dataSet = BarDataSet(entries, "Category Spending").apply {
                colors = barColors
                valueTextSize = 9f
                valueFormatter = object : ValueFormatter() {
                    override fun getFormattedValue(value: Float) =
                        "$currency${"%.0f".format(value)}"
                }
            }

            // LimitLines on the Y axis
            val yAxis = binding.categoryBarChart.axisLeft
            yAxis.removeAllLimitLines()

            // Global max
            if (globalMax > 0.0) {
                yAxis.addLimitLine(
                    LimitLine(globalMax.toFloat(), "Max Budget").apply {
                        lineColor = "#EF4444".toColorInt()
                        lineWidth = 2f
                        textColor = "#EF4444".toColorInt()
                        textSize = 10f
                    }
                )
            }
            // Global min
            if (globalMin > 0.0) {
                yAxis.addLimitLine(
                    LimitLine(globalMin.toFloat(), "Min Goal").apply {
                        lineColor = "#22C55E".toColorInt()
                        lineWidth = 2f
                        textColor = "#22C55E".toColorInt()
                        textSize = 10f
                    }
                )
            }
            // Per-category limits
            budgetMap.values.asSequence().distinct().forEach { limit ->
                if (limit > 0.0) {
                    yAxis.addLimitLine(
                        LimitLine(limit.toFloat(), "").apply {
                            lineColor = "#EF9F27".toColorInt()
                            lineWidth = 1f
                            enableDashedLine(8f, 4f, 0f)
                        }
                    )
                }
            }

            binding.categoryBarChart.apply {
                xAxis.valueFormatter = IndexAxisValueFormatter(labels)
                xAxis.labelCount     = labels.size
                data = BarData(dataSet).apply { barWidth = 0.6f }
                setVisibleXRangeMaximum(6f)
                moveViewToX(0f)
                animateY(700)
                invalidate()
            }

            binding.tvCatFrom.text = getString(R.string.from_label, catFromDate)
            binding.tvCatTo.text   = getString(R.string.to_label, catToDate)
        }
    }

    // Performance progress bar
    private fun calculatePerformance(min: Double, max: Double) {
        lifecycleScope.launch {
            val currentMonth = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM"))
            financeRepo.getExpensesByDateRange(userId, "$currentMonth-01", "$currentMonth-31")
                .collectLatest { monthlyExpenses ->
                    val totalSpent = monthlyExpenses.sumOf { it.amount }

                    if (max == 0.0) {
                        binding.tvPerformanceStatus.text = "Set your spending goals to see performance."
                        binding.pbBudgetPerformance.progress = 0
                        return@collectLatest
                    }

                    val progress = ((totalSpent / max) * 100).toInt().coerceIn(0, 100)
                    binding.pbBudgetPerformance.progress = progress

                    val status = when {
                        totalSpent < min  -> "Below minimum goal. Good savings, but ensure necessities are covered!"
                        totalSpent <= max -> "Excellent! You are within your target spending range."
                        else              -> "Alert: You have exceeded your maximum spending goal."
                    }

                    binding.tvPerformanceStatus.text =
                        "Spent this month: ${FormatUtils.formatCurrency(totalSpent, currency)}\n$status"
                    binding.tvMinGoalLabel.text = "Min: ${FormatUtils.formatCurrency(min, currency)}"
                    binding.tvMaxGoalLabel.text = "Max: ${FormatUtils.formatCurrency(max, currency)}"
                }
        }
    }

    //Listeners
    private fun setupListeners() {
        // Existing: save goals
        binding.btnSaveGoals.setOnClickListener {
            val min = binding.etMinGoal.text.toString().toDoubleOrNull() ?: 0.0
            val max = binding.etMaxGoal.text.toString().toDoubleOrNull() ?: 0.0
            if (max > 0 && min >= max) {
                Toast.makeText(this, "Minimum goal should be less than maximum goal", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            lifecycleScope.launch {
                financeRepo.updateSpendingGoals(userId, min, max)
                Toast.makeText(this@ReportsActivity, "Goals updated successfully", Toast.LENGTH_SHORT).show()
            }
        }

        // Category chart date filter pickers
        binding.tvCatFrom.setOnClickListener { pickDate(isFrom = true) }
        binding.tvCatTo.setOnClickListener   { pickDate(isFrom = false) }

        binding.btnApplyCatFilter.setOnClickListener {
            if (catFromDate > catToDate) {
                Toast.makeText(this, "From date must be before To date", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            lifecycleScope.launch {
                val prefs = financeRepo.getUserPrefsOnce(userId)
                loadCategoryBarChart(
                    prefs?.minMonthlySpendingGoal ?: 0.0,
                    prefs?.maxMonthlySpendingGoal ?: 0.0
                )
            }
        }
    }

    private fun pickDate(isFrom: Boolean) {
        val cal = Calendar.getInstance()
        DatePickerDialog(this, { _, y, m, d ->
            val picked = "%04d-%02d-%02d".format(y, m + 1, d)
            if (isFrom) {
                catFromDate = picked
                binding.tvCatFrom.text = "From: $picked"
            } else {
                catToDate = picked
                binding.tvCatTo.text = "To: $picked"
            }
        }, cal.get(Calendar.YEAR), cal.get(Calendar.MONTH), cal.get(Calendar.DAY_OF_MONTH)).show()
    }
}
