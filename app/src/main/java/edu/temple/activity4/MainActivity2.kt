package edu.temple.activity4

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var newIntent = Intent(this, MainActivity2::class.java)
        intent.getFloatExtra("key", 5f)
        var text = findViewById<TextView>(R.id.textView)

    }
}