package com.example.azkarelmoslem

import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

 class Recycler_Adapter_Azkar( private var azkar :List<String>) : RecyclerView.Adapter<Recycler_Adapter_Azkar.ViewHolder>() {

     override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
         val v : View = LayoutInflater.from(parent.context).inflate(R.layout.rv_azkar , parent , false)
         return  ViewHolder(v)
     }

     override fun getItemCount(): Int {
      return azkar.size
     }

     override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      //   var zekr_item :  Azkar_details = azkar_sabah[position]
         holder.item_zekr_text.text = azkar[position]
      //   holder.item_num_zekr.text = zekr_item.numberOfZekr
     }

     inner class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
         val item_zekr_text : TextView = itemView.findViewById(R.id.tv_zekr)
        // var item_num_zekr : TextView = itemView.findViewById(R.id.tv_num_of_zekr)
     }
}