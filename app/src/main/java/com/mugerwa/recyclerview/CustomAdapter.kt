package com.mugerwa.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val myList:List<itemViewModel>):RecyclerView.Adapter<CustomAdapter.ViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.card_view_design,parent,false)
        return  ViewHolder(view)
    }

//    binds the list item to a view
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        val itemViewModel=myList[position]
//    sets the image to  the imageview from our item holder class
       holder.imageView.setImageResource(itemViewModel.image)
//    sets the text to the text view from our itemViewHolderClass
    holder.textView.text=itemViewModel.text
    }
 
//    retunr the item size from the list
    override fun getItemCount(): Int {
        return myList.size
    }

//    creating a class viewHolder
    class ViewHolder(ItemView:View):RecyclerView.ViewHolder(ItemView){
        val imageView:ImageView=itemView.findViewById(R.id.imageView)
        val textView:TextView=itemView.findViewById(R.id.textView)

    }
}