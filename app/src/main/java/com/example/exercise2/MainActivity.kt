package com.example.exercise2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var  textView: TextView
    lateinit var  textView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView = findViewById(R.id.disney_image)
        textView = findViewById(R.id.disney_bio_text)
        textView2 = findViewById(R.id.top_text)
    }

    fun randomBio(view: View){
        val randomInt: Int = (1..10).random()
        val image:Int = when (randomInt){
            1 -> R.drawable.char_1
            2 -> R.drawable.char_2
            3 -> R.drawable.char_3
            4 -> R.drawable.char_4
            5 -> R.drawable.char_5
            6 -> R.drawable.char_6
            7 -> R.drawable.char_7
            8 -> R.drawable.char_8
            9 -> R.drawable.char_9
            else -> R.drawable.char_10
        }

        val text:Int = when (randomInt){
            1 -> R.string.char_1
            2 -> R.string.char_2
            3 -> R.string.char_3
            4 -> R.string.char_4
            5 -> R.string.char_5
            6 -> R.string.char_6
            7 -> R.string.char_7
            8 -> R.string.char_8
            9 -> R.string.char_9
            else -> R.string.char_10
        }

        imageView.setImageResource(image)
        textView.setText(text)
        textView2.setText(R.string.top_change)
    }

    fun retryBio(view: View){
        imageView.setImageResource(R.drawable.disney_logo)
        textView.setText(R.string.disney_bio_text)
        textView2.setText(R.string.top_text)
    }
}
