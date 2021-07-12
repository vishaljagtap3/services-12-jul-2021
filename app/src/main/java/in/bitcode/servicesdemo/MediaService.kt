package `in`.bitcode.servicesdemo

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import android.widget.Toast

class MediaService : Service() {

    override fun onCreate() {
        super.onCreate()
        mt("onCreate")
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        mt("onStartCommand ${startId} Song: ${intent?.getStringExtra("path")}")
        mt("flag : $flags")
        return super.onStartCommand(intent, flags, startId)
    }

    override fun onDestroy() {
        mt("onDestroy")
        super.onDestroy()
    }

    private fun mt(text : String) {
        Log.e("tag", text)
        Toast.makeText(this, text, Toast.LENGTH_LONG).show()
    }


    override fun onBind(intent: Intent?): IBinder? {
        return null
    }
}