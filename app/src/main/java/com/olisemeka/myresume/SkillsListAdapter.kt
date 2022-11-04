package com.olisemeka.myresume

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class SkillsListAdapter(val skillsList: ArrayList<Skill>): RecyclerView.Adapter<SkillsListAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivItem: ImageView = itemView.findViewById(R.id.ivItem)
        val tvSkill: TextView = itemView.findViewById(R.id.tvSkill)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item_skill, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = skillsList[position]
        holder.ivItem.setImageResource(item.image)
        holder.tvSkill.text = item.skill
    }

    override fun getItemCount() = skillsList.size
}