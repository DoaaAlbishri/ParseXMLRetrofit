package com.example.parsexmlretrofit

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_row.view.*


class RecyclerViewAdapter(private val entries: ArrayList<String> , private val a : ArrayList<ArrayList<String>>)
    : RecyclerView.Adapter<RecyclerViewAdapter.ItemViewHolder>(){

    class ItemViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView)

    var ctx: Context? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        ctx=parent.getContext();
        return ItemViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_row, parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val entry=entries[position]
        holder.itemView.apply{
            tv.text= entry
        }

        holder.itemView.setOnClickListener {
            val intent = Intent(ctx, MainActivity2::class.java)
            intent.putExtra("authors", a)
            ctx!!.startActivity(intent)
        }
    }

    override fun getItemCount(): Int =entries.size

}