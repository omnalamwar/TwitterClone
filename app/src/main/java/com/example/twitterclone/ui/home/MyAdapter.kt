package com.example.twitterclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.twitterclone.ui.home.Result


class MyAdapter(val arrayList: List<Result>)
    :RecyclerView.Adapter<MyAdapter.MyViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.eachitem,parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = arrayList[position]
        holder.userName.text = currentItem.user.name

    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val userName: TextView
        init {
            userName = itemView.findViewById<TextView>(R.id.userName)
        }
    }
}