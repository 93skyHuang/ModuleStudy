package com.sky.modulestudy.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sky.modulestudy.R

/**
 *
 * @Description:    []
 * @Author:         skyHuang
 * @CreateDate:     2021/5/19 9:53
 */
class FirstAdapter(l: List<String>) : RecyclerView.Adapter<FirstAdapter.ViewHolder>() {
    var list = l


    class ViewHolder(deviceView: View) : RecyclerView.ViewHolder(deviceView) {
        var tv: TextView = deviceView.findViewById(R.id.tv)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view: View = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_item1, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tv.text = list[position]
        holder.tv.textSize = 18f
    }
}