package com.example.ncrafrmadia

import android.view.View

class Post(
    val id: Long,
    val author: String,
    val content: String,
    val created: String,  //data
    val likedByMe: Boolean = false
)
    fun countMe (view: View) {
        // Get the value of the text view.
    //    val countString = post.text.toString()

}