package com.example.ncrafrmadia

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var countLike: Int = 0
    private var countChat: Int = 0
    private var countShare: Int = 0

    @SuppressLint("ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val post = Post(
            "Netology", "First post in our network!",
            "20 august  2019", false
        )

        post_text.text = post.content
        netology_text.text = post.author
        data_text.text = post.created
    }

    private fun toColor() {
        if (countLike != 0 || countChat != 0 || countShare != 0) {
            post_text.setTextColor(Color.rgb(0, 0, 0))
        }
    }

    fun likedByMe(view: View) {

        btn_image_like.setImageResource(R.drawable.ic_favorite_24dp)
        countLike++
        like_text.text = countLike.toString()
        toColor()
    }

    fun chatClick(view: View) {

        btn_image_chat.setImageResource(R.drawable.ic_chat_bubble_24dp)
        countChat++
        chat_text.text = countChat.toString()
        toColor()
    }

    fun shareClick(view: View) {

        share_btn.setImageResource(R.drawable.ic_share_24dp)
        countShare++
        share_text.text = countShare.toString()
        toColor()
    }
}
