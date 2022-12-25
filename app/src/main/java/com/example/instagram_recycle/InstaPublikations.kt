package com.example.instagram_recycle

import androidx.annotation.DrawableRes

data class InstaPublikations(
    val id:Int,
    @DrawableRes val profile:Int,
    val name:String,
    val location:String,
    @DrawableRes val dots:Int,
    @DrawableRes val publikate:Int,
    @DrawableRes val heart:Int,
    @DrawableRes val comment:Int,
    @DrawableRes val send:Int,
    @DrawableRes val save:Int,
    val theme:String,
    val comments:String,
    @DrawableRes val smile:Int,
    val komment:String,
    val opublic:String
    ) :Items()
