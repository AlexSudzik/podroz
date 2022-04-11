package com.example.podroz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val starcik = findViewById<Button>(R.id.starcik)
        val seeky = findViewById<SeekBar>(R.id.seekBar)
        val numeros = findViewById<EditText>(R.id.editTextNumber)
        val calendaros = findViewById<CalendarView>(R.id.calendarView)

        calendaros.setMinDate(System.currentTimeMillis());

        starcik.setOnClickListener {

            //val valuable = 20;
            //valuable = seeky.getProgress();
            //Toast.makeText(this, "this sucks", Toast.LENGTH_SHORT).show()
            //Toast.makeText(this, valuable, Toast.LENGTH_SHORT).show()

            Toast.makeText(this@MainActivity,
                "Progress is: " + seeky.progress,
                Toast.LENGTH_SHORT).show()


    }
        seeky.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {

                var progress1 = seeky.progress
                progress1.toFloat()
                progress1 = progress1/10

                //numeros.text = "Progress is : $progress%"
                //numeros.text = progress1.toEditable()
                (numeros as TextView).text = progress1.toString()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {

            }

            override fun onStopTrackingTouch(p0: SeekBar?) {

            }

        })




        /*seeky.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
    //seeky.OnSeekBarChangeListener {
    numeros.text = "text"
    //getString(seeky.progress)




    }*/


    }
}