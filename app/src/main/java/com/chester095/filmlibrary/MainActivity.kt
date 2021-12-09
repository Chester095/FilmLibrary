package com.chester095.filmlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

class Films(var movieId: Int, var movieTitle: String, var movieCreationDate: Date, var movieProducerCountry: String)