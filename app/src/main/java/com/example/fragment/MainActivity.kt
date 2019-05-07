package com.example.fragment

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO Move ti 'B' Activity
        btn1.setOnClickListener {
            startActivity(Intent(this@MainActivity, AActivty::class.java))
        }

        // TODO Move to 'A' Fragment
        btn2.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment, AFragment())
                .commit()
            btn2.setBackgroundColor(56463)

        }
        btn3.setOnClickListener {
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment, AFragment())
                .commit()
            btn3.setBackgroundColor(424242)
        }

    }
}