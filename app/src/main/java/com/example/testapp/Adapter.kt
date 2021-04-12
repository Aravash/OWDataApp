package com.example.testapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.card_item.view.*

class Adapter(
        private val CardList: List<CardItem>,
        private val listener: OnItemClickListener) : RecyclerView.Adapter<Adapter.ViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_item,
                                                                     parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, pos: Int) {
        val currentItem = CardList[pos]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView.text = currentItem.title
    }

    override fun getItemCount() = CardList.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener
    {
        val imageView: ImageView = itemView.image_view
        val textView: TextView = itemView.text_view

        init
        {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = bindingAdapterPosition
            listener.onItemClick(position)
        }
    }

    interface OnItemClickListener
    {
        fun onItemClick(position: Int)
    }
}