package com.example.ncrafrmadia

class Post(
    val author: String,
    val address: String,
    val location:Pair,
    val content: String,
    val created: String,  //data
    val likedByMe: Boolean = false
)