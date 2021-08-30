package au.edu.swin.sdmd.w06_multiplessolutions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val factor1 = Random.nextInt(from = 1, until = 13)
        val factor2  = Random.nextInt(from = 1, until = 13)
        val tvFactorLayout = findViewById<TextInputLayout>(R.id.tilFactor1)
        val tvFactor1 = findViewById<TextInputEditText>(R.id.factor1)
        val tvFactor2 = findViewById<TextView>(R.id.factor2)

       //tvFactor1.text = factor1.toString()
        tvFactor2.text = factor2.toString()

        val multiply = findViewById<Button>(R.id.multiply)
        /*multiply.setOnClickListener {
            val factor1 = tvFactor1.text.toString().toInt()
            if (factor1 in 1..12) {
                val i = Intent(this, ResultActivity::class.java).apply {
                    putExtra("result", Result(factor1 * factor2))
                }
                startActivity(i)
            } else {
                tvFactor1.error = "Value must be between 1-12"
            }

        }*/

        multiply.setOnClickListener {
            val factor1 = tvFactor1.text.toString().toInt()
            if (factor1 in 1..12) {
                val fragment = ResultFragment.newInstance(factor1 * factor2)
                supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.result_container, fragment)
                    .commit()
            } else {
                tvFactor1.error = "Value must be between 1-12"
            }
        }
    }
}