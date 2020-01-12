package com.example.e3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener {
            calculatePremium()
        }
    }

    fun calculatePremium() {
        val ageGroup = spinnerAge.selectedItemPosition.toString().toInt()
        val gender = findViewById<RadioButton>(radioGroupGender.checkedRadioButtonId).text
        val smoker = checkBoxSmoker.isChecked
        var premium = 0
        val textview = findViewById<TextView>(R.id.textViewPremium)
        val result :String

        when (ageGroup) {
            0 -> premium += 60
            1 -> premium += 70
            2 -> premium += 90
            3 -> premium += 120
            4 -> premium += 150
            5 -> premium += 150
        }

        if(ageGroup == 1)
        {
            if(gender != "Male" && smoker)
            {
                premium +=100
            }
            else if(smoker)
            {
                premium +=150
            }
            else if (gender == "Male")
            {
                premium += 50
            }

        }

        if(ageGroup == 2)
        {
            if(gender != "Male" && smoker)
            {
                premium +=150
            }
            else if(smoker)
            {
                premium +=250
            }
            else if (gender == "Male")
            {
                premium += 100
            }

        }

        if(ageGroup == 3)
        {
            if(gender != "Male" && smoker)
            {
                premium +=200
            }
            else if(smoker)
            {
                premium +=350
            }
            else if (gender == "Male")
            {
                premium += 150
            }

        }

        if(ageGroup == 4)
        {
            if(gender != "Male" && smoker)
            {
                premium +=250
            }
            else if(smoker)
            {
                premium +=450
            }
            else if (gender == "Male")
            {
                premium += 200
            }

        }

        if(ageGroup == 5)
        {
            if(gender != "Male" && smoker)
            {
                premium +=300
            }
            else if(smoker)
            {
                premium +=500
            }
            else if (gender == "Male")
            {
                premium += 200
            }

        }





        textview.text = premium.toString()


    }




}
