package com.example.kotlincalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btn7 : Button
    lateinit var btn8 : Button
    lateinit var btn9 : Button
    lateinit var btnDiv : Button
    lateinit var btn4 : Button
    lateinit var btn5 : Button
    lateinit var btn6 : Button
    lateinit var btnMult : Button
    lateinit var btn1 : Button
    lateinit var btn2 : Button
    lateinit var btn3 : Button
    lateinit var btnMinus : Button
    lateinit var btnNegPos : Button
    lateinit var btn0 : Button
    lateinit var btnDote : Button
    lateinit var btnPlus : Button
    lateinit var btnDel : Button
    lateinit var btnC : Button
    lateinit var btnEqual : Button
    lateinit var result : TextView
    var txt = ""
    var num1 = 0
    var num2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findIds()
        onClibkBtns()
    }
  private fun findIds(){
        btn7 = findViewById(R.id.onClick7)
        btn8 = findViewById(R.id.onClick8)
        btn9 = findViewById(R.id.onClick9)
        btnDiv = findViewById(R.id.onClickDiv)
        btn4 = findViewById(R.id.onClick4)
        btn5 = findViewById(R.id.onClick5)
        btn6 = findViewById(R.id.onClick6)
        btnMult = findViewById(R.id.onClickMul)
        btn1 = findViewById(R.id.onClick1)
        btn2 = findViewById(R.id.onClick2)
        btn3 = findViewById(R.id.onClick3)
        btnMinus = findViewById(R.id.onClickMinus)
        btnNegPos = findViewById(R.id.onClickNegPos)
        btn0 = findViewById(R.id.onClick0)
        btnDote = findViewById(R.id.onClickDote)
        btnPlus = findViewById(R.id.onClickPlus)
        btnDel = findViewById(R.id.onClickDelete)
        btnC = findViewById(R.id.onClickClean)
        btnEqual = findViewById(R.id.onClickEqual)
        result = findViewById(R.id.tvResult)

    }
   private fun onClibkBtns(){
        btn7.setOnClickListener{
            txt = result.text.toString()

            result.text = txt + get7().toString()
        }
       btn8.setOnClickListener{
            txt = result.text.toString()
           result.text = txt + get8().toString()
       }
       btnPlus.setOnClickListener{
            txt = result.text.toString()
           num1 = txt.toInt()
           result.text = ""
       }
       btnEqual.setOnClickListener{
           txt = result.text.toString()
           num2 = txt.toInt()
           if (getPlus() == "+"){
               var sum = num1 + num2
               result.text = sum.toString()
           }
       }
    }
   private fun get7(): Int{
      return 7
    }
    private fun get8(): Int{
        return 8
    }
    private fun getPlus(): String{
        return "+"
    }
    private fun equal(): String{
        return "="
    }
}