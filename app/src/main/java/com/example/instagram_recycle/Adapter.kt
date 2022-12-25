package com.example.instagram_recycle


import android.annotation.SuppressLint
import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.instagram_recycle.databinding.RvInstaProfileBinding
import com.example.instagram_recycle.databinding.VerticalItemBinding

class Adapter : RecyclerView.Adapter<ViewHolder>() {
    companion object {
        const val INSTAPROFILES =0
        const val INSTAPUBLICATIONS =1
    }

    inner class RvVIewHolder(private val binding: RvInstaProfileBinding):ViewHolder(binding.root){

        fun bind (rvInstaProfiles: RvInstaProfiles){
            val instaInnerAdapter =InstaInnerAdapter()

            binding.adapterRecycle.adapter =instaInnerAdapter
            instaInnerAdapter.models =rvInstaProfiles.profiles


            instaInnerAdapter.setOnInnerItemClickListener {id->
                onInnerItemClick.invoke(id)
            }
        }
    }

    inner class VerticalItemViewHolder(private val binding: VerticalItemBinding):ViewHolder(binding.root){

        fun bind (instaPublikations: InstaPublikations){
            binding.apply {
                profile.setImageResource(instaPublikations.profile)
                name.text =instaPublikations.name
                location.text =instaPublikations.location
                dots.setImageResource(instaPublikations.dots)
                publikate.setImageResource(instaPublikations.publikate)
                heart.setImageResource(instaPublikations.heart)
                comment.setImageResource(instaPublikations.comment)
                send.setImageResource(instaPublikations.send)
                save.setImageResource(instaPublikations.save)
                theme.text =instaPublikations.theme
                comments.text =instaPublikations.comments
                smile.setImageResource(instaPublikations.smile)
                komment.text =instaPublikations.komment
                opublicate.text =instaPublikations.opublic
            }
        }
    }
    var models = listOf<Items>()
    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field =value

        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun getItemViewType(position: Int): Int {
        return if(models[position] is RvInstaProfiles){
            INSTAPROFILES
        }
        else{
            INSTAPUBLICATIONS
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return if(viewType == INSTAPROFILES ){
            val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_insta_profile,parent,false)
            val binding =RvInstaProfileBinding.bind(view)
            RvVIewHolder(binding)
        } else{
            val view = LayoutInflater.from(parent.context).inflate(R.layout.vertical_item,parent,false)
            val binding =VerticalItemBinding.bind(view)
            VerticalItemViewHolder(binding)


        }


}

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            INSTAPROFILES -> {
                (holder as RvVIewHolder).bind(models[position] as RvInstaProfiles )
            }
            INSTAPUBLICATIONS -> {
                (holder as VerticalItemViewHolder).bind(models[position] as InstaPublikations)
            }

        }
    }
    private var onInnerItemClick:(id:Int) ->Unit = {}
    fun setOnInnerItemClickListener(onInnerItemClick:(id:Int) -> Unit){
        this.onInnerItemClick =onInnerItemClick
    }


}