package com.example.findmyage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buGetAge.setOnClickListener {
            // code will be execute when get my age button click


            val userDOB=Integer.parseInt(Date_of_Bath.text.toString())  // this is the transfer process of string to int
           // val userDOB=Date_of_Bath.text.toString()            // this is a string type that's why not getting
            val cYear=Calendar.getInstance().get(Calendar.YEAR)
            val finalResult=cYear-userDOB
            show_age.text="Your age is $finalResult"
        }
    }


}



/* another way to print finalResult
  to create a function inside a function we have to do all activity
  and inside onclicklistner method just call this method

  buGetAge.setOnClickListener {

  buGetAgeclick()

  }

  fun buGetAgeclick(){
  val userDOB=Integer.parseInt(Date_of_Bath.text.toString())  // this is the transfer process of string to int
           // val userDOB=Date_of_Bath.text.toString()            // this is a string type that's why not getting
            val cYear=Calendar.getInstance().get(Calendar.YEAR)
            val finalResult=cYear-userDOB
            show_age.text="Your age is $finalResult"

  }


 */



