package com.example.podroz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val starcik = findViewById<Button>(R.id.starcik)
        val seeky = findViewById<SeekBar>(R.id.seekBar)

        starcik.setOnClickListener {

            //val valuable = 20;
            //valuable = seeky.getProgress();
            //Toast.makeText(this, "this sucks", Toast.LENGTH_SHORT).show()
            //Toast.makeText(this, valuable, Toast.LENGTH_SHORT).show()

            Toast.makeText(this@MainActivity,
                "Progress is: " + seeky.progress,
                Toast.LENGTH_SHORT).show()



    }
    }
}