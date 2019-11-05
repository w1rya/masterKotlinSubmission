package com.wiryawan.picodiploma.submission.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.wiryawan.picodiploma.submission.R
import com.wiryawan.picodiploma.submission.model.Mobo

class ListMoboAdapter(private val listMobo: ArrayList<Mobo>) : RecyclerView.Adapter<ListMoboAdapter.ListViewHolder>() {

    private var onItemClickCallback: OnItemClickCallback? = null

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    interface OnItemClickCallback {
        fun onItemClicked(mobo: Mobo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_mobo, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val mobo = listMobo[position]

        Glide.with(holder.itemView.context)
            .load(mobo.photo)
            .into(holder.imgPhoto)

        holder.tvName.text = mobo.name
        holder.tvDetail.text = mobo.detail

        holder.itemView.setOnClickListener { onItemClickCallback!!.onItemClicked(listMobo[holder.adapterPosition]) }
    }

    override fun getItemCount(): Int {
        return listMobo.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.tv_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.tv_photo)
    }

}
