package com.example.pixabay

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import coil.load
import com.example.pixabay.databinding.ItemImageBinding


class PixaAdapter(var list: ArrayList<ImageModel>) :
    RecyclerView.Adapter<PixaAdapter.PixaViewHolder>() {
    class PixaViewHolder(var binding: ItemImageBinding) : ViewHolder(binding.root) {
        fun onBind(imageModel: ImageModel) {
            binding.imagePicView.load(imageModel.largeImageURL)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PixaViewHolder {
        return PixaViewHolder(
            ItemImageBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: PixaViewHolder, position: Int) {
        holder.onBind(list[position])
    }


}