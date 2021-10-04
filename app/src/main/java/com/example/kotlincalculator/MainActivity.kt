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
    var sum = 0
    var operation = ""
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
       btn9.setOnClickListener{
           txt = result.text.toString()
           result.text = txt + get9().toString()
       }
       btn8.setOnClickListener{
            txt = result.text.toString()
           result.text = txt + get8().toString()
       }
       btn6.setOnClickListener{
           txt = result.text.toString()
           result.text = txt + get6().toString()
       }
       btn5.setOnClickListener{
           txt = result.text.toString()
           result.text = txt + get5().toString()
       }
       btn4.setOnClickListener{
           txt = result.text.toString()
           result.text = txt + get4().toString()
       }
       btn3.setOnClickListener{
           txt = result.text.toString()
           result.text = txt + get3().toString()
       }
       btn2.setOnClickListener{
           txt = result.text.toString()
           result.text = txt + get2().toString()
       }
       btn1.setOnClickListener{
           txt = result.text.toString()
           result.text = txt + get1().toString()
       }
       btn0.setOnClickListener{
           txt = result.text.toString()
           result.text = txt + get0().toString()
       }
       btnPlus.setOnClickListener{
           operation = "+"
            txt = result.text.toString()
           num1 = txt.toInt()
           result.text = ""
       }
       btnDiv.setOnClickListener{

       }
       btnMinus.setOnClickListener{
           operation = "-"
           var min = result.text.toString()
               num1 = min.toInt()
           result.text = ""
       }
       btnEqual.setOnClickListener{
           txt = result.text.toString()
           num2 = txt.toInt()
           if (operation== "+"){
               var sum = num1 + num2
               result.text = sum.toString()
           }else if (operation== "-"){
               var numeStr = result.text.toString()
               num2 = numeStr.toInt()
               var sub = num1 - num2

               result.text = sub.toString()
           }
       }
    }
   private fun get7(): Int{
      return 7
    }
    private fun get8(): Int{
        return 8
    }
    private fun get9(): Int{
        return 9
    }
    private fun get6(): Int{
        return 6
    }
    private fun get5(): Int{
        return 5
    }
    private fun get4(): Int{
        return 4
    }
    private fun get3(): Int{
        return 3
    }
    private fun get2(): Int{
        return 2
    }
    private fun get1(): Int{
        return 1
    }
    private fun get0(): Int{
        return 0
    }

    private fun getPlus(): String{
        return "+"
    }
    private fun getDiv(): String{
        return "/"
    }
    private fun getMinus(): String{
        return "-"
    }
    private fun equal(): String{
        return "="
    }
}