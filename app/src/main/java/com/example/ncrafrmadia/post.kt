package com.example.ncrafrmadia

class Post(
    val author: String,
    val address: String,//  адреесс
    val location:Pair,  //координаты
    val content: String,
    val created: String,  //data
    val likedByMe: Boolean = false
)