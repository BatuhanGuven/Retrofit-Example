package com.example.retrofitexample
import kotlinx.serialization.Serializable

@Serializable
data class PhotoData (
    val id:String="",
    val img_src: String,
    var selected: Boolean=false
)