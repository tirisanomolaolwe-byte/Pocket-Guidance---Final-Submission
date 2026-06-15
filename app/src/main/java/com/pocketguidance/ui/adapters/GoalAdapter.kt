package com.pocketguidance.ui.adapters

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.*
import androidx.recyclerview.widget.*
import com.pocketguidance.data.db.entities.GoalEntity
import com.pocketguidance.databinding.ItemGoalBinding
import com.pocketguidance.utils.FormatUtils

class GoalAdapter(
    private val currency: String,
    private val onContribute: (GoalEntity) -> Unit
) : ListAdapter<GoalEntity, GoalAdapter.VH>(DIFF) {

    inner class VH(private val b: ItemGoalBinding) : RecyclerView.ViewHolder(b.root) {
        fun bind(g: GoalEntity) {
            val pct = if (g.targetAmount > 0)
                ((g.currentAmount / g.targetAmount) * 100).toInt().coerceAtMost(100) else 0

            b.tvGoalName.text   = g.name
            b.tvProgress.text   = "${FormatUtils.formatCurrency(g.currentAmount, currency)} / ${FormatUtils.formatCurrency(g.targetAmount, currency)}"
            b.tvPercent.text    = "$pct%"
            b.tvDeadline.text   = "Due: ${FormatUtils.formatDisplayDate(g.deadline)} (${g.frequency})"
            b.progressBar.progress = pct

            val tint = Color.parseColor(if (g.completed) "#22C55E" else "#4F46E5")
            b.progressBar.progressTintList = ColorStateList.valueOf(tint)

            // Text instead of emoji for completed state
            b.tvStatus.text = if (g.completed) "Completed!" else ""
            b.tvStatus.setTextColor(Color.parseColor("#22C55E"))

            b.btnContribute.isEnabled = !g.completed
            b.btnContribute.text      = if (g.completed) "Done" else "Contribute"
            if (!g.completed) b.btnContribute.setOnClickListener { onContribute(g) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        VH(ItemGoalBinding.inflate(LayoutInflater.from(parent.context), parent, false))

    override fun onBindViewHolder(holder: VH, position: Int) = holder.bind(getItem(position))

    companion object {
        val DIFF = object : DiffUtil.ItemCallback<GoalEntity>() {
            override fun areItemsTheSame(a: GoalEntity, b: GoalEntity) = a.id == b.id
            override fun areContentsTheSame(a: GoalEntity, b: GoalEntity) = a == b
        }
    }
}
