package com.example.datepicker_kotlin

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract
import android.widget.Button
import android.widget.CalendarView
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialize the necessary views
        val pickdateButton = findViewById<Button>(R.id.pickDateButton)
        val dateTextView = findViewById<TextView>(R.id.textViewDate)

        //for the calender specifications
       val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c .get(Calendar.DAY_OF_MONTH)



        //set Onclick Listener to button to execute DatePickerDialog
        pickdateButton.setOnClickListener {

            val datePickerDialog = DatePickerDialog(this,DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                //set the selected date on the textView
                dateTextView.setText(" " + dayOfMonth + " " + month + " " + year)
            },year,month,day)
            datePickerDialog.show()
        }





    }
}
