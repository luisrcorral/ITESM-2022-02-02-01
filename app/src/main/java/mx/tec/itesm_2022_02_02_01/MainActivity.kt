package mx.tec.itesm_2022_02_02_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

// My single line comment

/* My multiple
line comment */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton : Button = findViewById<Button>(R.id.button)
        val myEditText : EditText = findViewById<EditText>(R.id.EditText1)
        val myTextView : TextView = findViewById<TextView>(R.id.textView)

        var myString : String

        myButton.setOnClickListener {
            myString = myEditText.text.toString()

            if (myString == "") {

                myTextView.text = "Empty"
            } else {
                myTextView.text = myString
            }

        }






    }
}