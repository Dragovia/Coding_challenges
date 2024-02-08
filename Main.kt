


// MainActivity.kt

package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find the TextView defined in the layout file using its ID
        val textView = findViewById<TextView>(R.id.textView)

        // Set the text of the TextView to "Hello, World!"
        textView.text = "Hello, World!"
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun factorial(n: Int): Int{
    if(n == 0 || n == 1){
        return 1
    }
    else{
        var result = 1
        for(i in 2..n){
            result *= i
        }
        return result

    }
}


fun main() {
    val name = "Kotlin"
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }


    val number = 5
    val result = factorial(number)
    println("Factorial of $number is $result")
}

