package com.example.instagram_recycle

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.instagram_recycle.databinding.InstaProfileBinding

class InstaInnerAdapter:RecyclerView.Adapter<InstaInnerAdapter.ProfilesViewHolder>() {

    inner class ProfilesViewHolder(private val binding: InstaProfileBinding):ViewHolder(binding.root){

        fun bind (instaProfile: InstaProfile){

            binding.profile.setImageResource(instaProfile.profile)
            binding.name.text = instaProfile.name

            binding.root.setOnClickListener {
                    onInnerItemClick.invoke(instaProfile.id)
            }
        }
    }
    var models = listOf<InstaProfile>()

    @SuppressLint("NotifyDataSetChanged")
    set(value) {
        field =value

        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfilesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.insta_profile,parent,false)
        val binding =InstaProfileBinding.bind(view)

      return  ProfilesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfilesViewHolder, position: Int) {
        holder.bind(models[position])
    }
    private var onInnerItemClick:(id:Int) ->Unit = {}
     fun setOnInnerItemClickListener(onInnerItemClick:(id:Int) -> Unit){
        this.onInnerItemClick =onInnerItemClick
    }
}