package au.edu.swin.sdmd.w06_multiplessolutions

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val result = intent.getParcelableExtra<Result>("result")
        val tvResult = findViewById<TextView>(R.id.result)
        tvResult.text = result?.opResult.toString()
    }
}