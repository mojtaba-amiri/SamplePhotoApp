package com.sogol.myphotostudio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.sogol.myphotostudio.model.ItemStudio
import kotlinx.android.synthetic.main.activity_main.*

private lateinit var adapter: RecyclerAdapter

class MainActivity : AppCompatActivity() {
    val itemList = ArrayList<ItemStudio>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvItems.adapter = RecyclerAdapter(itemList)
        rvItems.layoutManager = LinearLayoutManager(this)
        rvItems.setHasFixedSize(true)
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onResume() {
        //Reload Data
        // To Register broadcast Resever
        super.onResume()
        itemList.add(ItemStudio(type="test"))
        rvItems.adapter?.notifyItemChanged(1)
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        // To unRegister broadcast Resever
        super.onStop()
    }
}