package com.example.myapplicationa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class PhotoAdapter(private val androidPhoto : List<Photo>) :RecyclerView.Adapter<PhotoAdapter.photoViewHolder>() {
    class photoViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val imageView : ImageView = itemView.findViewById(R.id.pictureOne)
    }

    override fun onCreateViewHolder(parent : ViewGroup , viewType : Int) : PhotoAdapter.photoViewHolder {
        val ph = LayoutInflater.from(parent.context).inflate(R.layout.photo_item , parent , false)
        return photoViewHolder(ph)
    }

    override fun onBindViewHolder(holder : PhotoAdapter.photoViewHolder , position : Int) {
        val ph = androidPhoto(position)
        Glide.with(holder.imageView.context)
            .load(ph?.url)
            .placeholder(R.drawable.ic_launcher_background)
            .centerCrop()
            .into(holder.imageView)


    }

    override fun getItemCount() : Int {
        TODO("Not yet implemented")
    }
}
