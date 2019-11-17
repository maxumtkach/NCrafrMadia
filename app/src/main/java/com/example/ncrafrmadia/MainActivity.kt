package com.example.ncrafrmadia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val post= Post(1,"Netology","First post in our network!","20 august  2019", true)

        post_text.text=post.content

        netology_text.text=post.author
        data_text.text=post.created
       // btn_image_like.setImageResource(R.drawable.ic_favorite_inactive_24dp)



        if (post.likedByMe){
            btn_image_like.setImageResource(R.drawable.ic_favorite_24dp)
        }
    }
}
