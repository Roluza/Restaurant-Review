package com.dicoding.restaurantreview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReviewAdapter (private val listReview: List<String>) : RecyclerView.Adapter<ReviewAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvItem: TextView = view.findViewById(R.id.tvItem)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_review, parent, false))

    override fun getItemCount() = listReview.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.tvItem.text = listReview[position]
    }
}