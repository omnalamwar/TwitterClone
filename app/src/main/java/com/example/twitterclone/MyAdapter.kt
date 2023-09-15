package com.example.twitterclone

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val context: Activity, val arrayList: ArrayList<>)
    :RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        arrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = arrayList[position]

    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        init {

        }
    }
}