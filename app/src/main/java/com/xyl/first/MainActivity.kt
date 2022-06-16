package com.xyl.first

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.xyl.first.doc.lettersCount

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnTest = findViewById<Button>(R.id.btn_test)
        btnTest.setOnClickListener {
            startActivity(Intent(this, FirstActivity::class.java))
            val count = "ABC123%$!*@".lettersCount()
        }
    }
}