package com.example.instagram_recycle



data class RvInstaProfiles(
    val id :Int,
    val profiles: MutableList<InstaProfile>
) :Items()
