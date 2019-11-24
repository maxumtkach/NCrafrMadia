package com.example.ncrafrmadia

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var countLike: Int = 0     // счетчики
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

    fun locationByMe(view: View) {
        val intent = Intent().apply {
            //  data = Uri.parse("geo:$lat,$lng")
            action = Intent.ACTION_VIEW
            putExtra(
                Intent.EXTRA_TEXT, """
                ${post_text.text}(${netology_text.text})${data_text.text}
            """.trimIndent()
            )
            type = "text/plain"
        }
        startActivity(intent)

        //val myToast = Toast.makeText(this, "Hello Toast!", Toast.LENGTH_SHORT)
        // myToast.show()
    }

    private fun toColorDisactiv() {
        if (countLike == 0) {
            like_text.setTextColor(Color.rgb(255, 255, 255))
        }
    }

    private fun toColorActiv() {
        if (countLike != 0 || countChat != 0 || countShare != 0) {
            like_text.setTextColor(Color.rgb(255, 0, 0))
        }
    }

    fun likedByMe(view: View) {     // функция лайк дизлайк

        if (countLike != 0) {

            countLike--
            like_text.text = countLike.toString()

            btn_image_like.setImageResource(R.drawable.ic_favorite_inactive_24dp)
            toColorDisactiv()
        } else {


            btn_image_like.setImageResource(R.drawable.ic_favorite_red_24dp)
            countLike++
            like_text.text = countLike.toString()
            toColorActiv()
        }
    }

    fun chatClick(view: View) {

        btn_image_chat.setImageResource(R.drawable.ic_chat_bubble_24dp)
        countChat++
        chat_text.text = countChat.toString()
        toColorActiv()
        toColorDisactiv()
    }

    fun shareClick(view: View) {

        share_btn.setImageResource(R.drawable.ic_share_24dp)
        countShare++
        share_text.text = countShare.toString()
        toColorActiv()
        toColorDisactiv()
    }
}
