package au.edu.swin.sdmd.w06_multiplessolutions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val factor1 = Random.nextInt(from = 1, until = 13)
        val factor2  = Random.nextInt(from = 1, until = 13)
        val tvFactor1 = findViewById<TextView>(R.id.factor1)
        val tvFactor2 = findViewById<TextView>(R.id.factor2)

        tvFactor1.text = factor1.toString()
        tvFactor2.text = factor2.toString()

        val multiply = findViewById<Button>(R.id.multiply)
        multiply.setOnClickListener {
            val i = Intent(this, ResultActivity::class.java).apply {
                putExtra("result", Result(factor1 * factor2))
            }
            startActivity(i)

        }
    }
}