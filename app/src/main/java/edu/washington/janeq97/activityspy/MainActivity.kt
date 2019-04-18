package edu.washington.janeq97.activityspy

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("OnCreate", "onCreate event fired")
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        Log.i("OnStart", "onStart event fired")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("OnRestart", "onRestart event fired")
    }

    override fun onResume() {
        super.onResume()
        Log.i("OnResume", "onResume event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("OnDestroy", "We're going down, Captain!")
    }
}
