package com.sogol.myphotostudio

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.sogol.myphotostudio.model.ItemStudio
import kotlinx.android.synthetic.main.item_studio.view.*

class ItemStudioViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {

    private var phoneValue: TextView = itemView.phoneView
    private var titleValue: TextView = itemView.titleView
    private var typeValue: TextView = itemView.studioTypeView
    private var priceValue: TextView = itemView.priceView


    fun setUpViewHolder(data: ItemStudio){
        phoneValue.text = data.phone
//        titleValue.text = data.title
        typeValue.text = data.type
        priceValue.text = data.price.toString()
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