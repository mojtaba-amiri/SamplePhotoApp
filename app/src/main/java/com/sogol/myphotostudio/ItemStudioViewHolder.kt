package com.sogol.myphotostudio

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sogol.myphotostudio.model.ItemStudio
import kotlinx.android.synthetic.main.item_studio.view.*

class ItemStudioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    private var type: TextView = itemView.phoneView


    fun setUpViewHolder(data: ItemStudio){
        type.text = data.name
    }

    //3
    init {
        itemView.setOnClickListener(this)
    }

    //4
    override fun onClick(v: View) {
//        Log.d("RecyclerView", "CLICK!")
    }

}