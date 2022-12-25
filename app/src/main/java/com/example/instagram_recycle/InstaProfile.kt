package com.example.instagram_recycle

import androidx.annotation.DrawableRes

data class InstaProfile(
    val id :Int,
    @DrawableRes val profile:Int,
    val name:String
)
