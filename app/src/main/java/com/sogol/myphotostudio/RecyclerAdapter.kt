package com.sogol.myphotostudio

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sogol.myphotostudio.model.ItemStudio


class RecyclerAdapter(val recyclerList: List<ItemStudio>) : RecyclerView.Adapter<ItemStudioViewHolder>(), View.OnClickListener  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemStudioViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_studio, parent, false)
        itemView.setOnClickListener(this)
        return ItemStudioViewHolder(itemView)
    }

    override fun getItemCount() = recyclerList.size


    override fun onBindViewHolder(holder: ItemStudioViewHolder, position: Int) {
        val currentItem = recyclerList[position]
        holder.setUpViewHolder(recyclerList[position])
    }

    override fun onClick(v: View) {
        Log.d("RecyclerView", "CLICK!")
    }
}


