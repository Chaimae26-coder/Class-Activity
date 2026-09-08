package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView : ImageView = findViewById(R.id.imageView)

        var id: Int = R.drawable.cat1

        findViewById<Button>(R.id.button).setOnClickListener{
            if (id == R.drawable.cat1) {
                imageView.setImageResource(R.drawable.cat1)
                id = R.drawable.cat2
            } else {
                imageView.setImageResource(R.drawable.cat2)
                id = R.drawable.cat2
            }
        }
    }
}