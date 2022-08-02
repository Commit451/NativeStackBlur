package com.commit451.nativestackblur.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import coil.load

class MainActivity : AppCompatActivity() {

    companion object {
        private const val ImageUrl =
            "https://pbs.twimg.com/profile_images/1164525925242986497/N5_DCXYQ_400x400.jpg"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.image)
        val blurredImage = findViewById<ImageView>(R.id.blurredImage)
        image.load(ImageUrl)
        blurredImage.load(ImageUrl) {
            transformations(BlurTransformation())
        }
    }
}