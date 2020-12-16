package com.sina.nazarsanjiproject

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class MyRecyclerViewAdapter(private val list:MutableList<String>): RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.question_item,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val tvTitle = holder.itemView.findViewById<TextView>(R.id.tv_question_title)
        tvTitle.text = list[position]
    }

    override fun getItemCount(): Int {
        return list.size
    }
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView)
}