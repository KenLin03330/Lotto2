package com.example.lotto2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var t: TextView = findViewById(R.id.txv)
        t.text = "0"

    }

    fun happy(v: View) {
        var txv: TextView = findViewById(R.id.txv)
        if (v.id == R.id.btn) {
            txv.text = (1..100).random().toString()

        } else {
            txv.text = "0"
        }
    }
}