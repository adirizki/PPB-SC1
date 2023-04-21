package com.example.latihanrecyclerview

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import com.example.latihanrecyclerview.databinding.MyContactItemBinding

class MyContactAdapter(private val listStudent : ArrayList<MyContact>) : RecyclerView.Adapter<MyContactAdapter.ViewHolder>(){
    class ViewHolder(val binding : MyContactItemBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = MyContactItemBinding.inflate(LayoutInflater.from(parent.context), parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listStudent.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvNim.text = listStudent[position].nim
        holder.binding.tvNama.text = listStudent[position].nama
        holder.binding.tvNomorTelepon.text = listStudent[position].nomorTelepon
    }
}