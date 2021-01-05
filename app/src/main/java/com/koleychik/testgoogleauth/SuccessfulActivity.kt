package com.koleychik.testgoogleauth

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SuccessfulActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_successful)

        findViewById<TextView>(R.id.name).text = intent.extras!!.getString(Constants.NAME)
        findViewById<TextView>(R.id.email).text = intent.extras!!.getString(Constants.EMAIL)

    }
}