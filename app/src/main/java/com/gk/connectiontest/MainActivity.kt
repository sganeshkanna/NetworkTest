package com.gk.connectiontest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.gk.reachability.Connection

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Thread {
            if(Connection.hasInternetConnected(this)){
                Log.i("TAG","Internet Connected")
            }else{
                Log.i("TAG","Not Connected")
            }
        }.start()

    }
}