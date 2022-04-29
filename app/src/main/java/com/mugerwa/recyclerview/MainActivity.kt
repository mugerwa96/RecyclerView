package com.mugerwa.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //        getting recycle view by its id
        val recyclerView=findViewById<RecyclerView>(R.id.recycleview)
//        this creates a vertical layout manager
        recyclerView.layoutManager=LinearLayoutManager(this)
//        creating list of items viewMOdel
        val data= ArrayList<itemViewModel>()
//        this loop will create 20 views containing the image with count of view

        for( i in 1..20){
            data.add(itemViewModel(R.drawable.ic_android_black_24dp,"Item"))
        }


//        wll pass the arraylist to adapter
        val adapter=CustomAdapter(data)
        recyclerView.adapter=adapter
    }
}