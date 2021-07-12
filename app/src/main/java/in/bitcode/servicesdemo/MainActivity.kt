package `in`.bitcode.servicesdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var edtPath : EditText
    private lateinit var btnStart : Button
    private lateinit var btnStop : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        btnStart.setOnClickListener {
            var intent = Intent(it.context, MediaService::class.java)
            intent.putExtra("path", edtPath.text.toString())
            startService(intent)

        }

        btnStop.setOnClickListener {
            var intent = Intent(it.context, MediaService::class.java)
            stopService(intent)
        }
    }

    private fun init() {
        edtPath = findViewById(R.id.edtPath)
        btnStart = findViewById(R.id.btnStart)
        btnStop = findViewById(R.id.btnStop)
    }
}