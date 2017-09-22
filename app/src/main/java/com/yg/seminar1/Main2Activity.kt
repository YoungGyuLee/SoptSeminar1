package com.yg.seminar1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    private var backButton : Button? = null
    private var secondText : TextView? = null
    private var myImage : ImageView? = null
    private val TAG : String = "Main2"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        secondText = findViewById(R.id.main2_text) as TextView
        myImage = findViewById(R.id.main2_image) as ImageView

        val intent = Intent(applicationContext, MainActivity::class.java)

        secondText!!.text = getIntent().getStringExtra("mainText")

        backButton = findViewById(R.id.main2_back_button) as Button
        backButton!!.setOnClickListener {
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy")
    }
}
