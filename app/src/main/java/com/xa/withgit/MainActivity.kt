package com.xa.withgit

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val plus = findViewById<Button>(R.id.plus)
        val minus = findViewById<Button>(R.id.minus)
        val btn_reset = findViewById<Button>(R.id.btn_reset)
        val count = findViewById<TextView>(R.id.count)
        val next = findViewById<ImageView>(R.id.next)

        var num = 0
        btn_reset.setOnClickListener {
            num = 0
            count.text = num.toString()
        }
        plus.setOnClickListener {
            while (num < 100) {
                num++
                count.text = num.toString()
                break
            }
        }
        minus.setOnClickListener {
            while (num > 0) {
                num--
                count.text = num.toString()
                break
            }
        }

        next.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
        }


    }




}