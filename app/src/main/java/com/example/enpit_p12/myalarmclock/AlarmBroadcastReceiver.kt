package com.example.enpit_p12.myalarmclock

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import org.jetbrains.anko.intentFor
import org.jetbrains.anko.newTask

class AlarmBroadcastReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        /*javaでの記述
        val intent = Intent(context,MainActivity::class.java)
                .putExtra("onReceive",true)
                .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context?.startActivity(intent)
        */

        //ankoでの記述方法
        context?.run{
            startActivity(
                intentFor<MainActivity>("onReceive" to true).newTask())
        }
    }
}