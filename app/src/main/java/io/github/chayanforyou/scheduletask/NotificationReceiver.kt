package io.github.chayanforyou.scheduletask

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import io.github.chayanforyou.scheduletask.utils.NotificationManager

class NotificationReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent?) {
        NotificationManager.showNotification(context)
    }
}
