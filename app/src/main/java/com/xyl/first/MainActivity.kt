package com.xyl.first

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnTest = findViewById<Button>(R.id.btn_test)
        btnTest.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
        }
    }
}