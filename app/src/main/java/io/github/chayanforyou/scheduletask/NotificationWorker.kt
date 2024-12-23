package io.github.chayanforyou.scheduletask

import android.content.Context
import androidx.work.Worker
import androidx.work.WorkerParameters
import io.github.chayanforyou.scheduletask.utils.NotificationManager

class NotificationWorker(appContext: Context, workerParams: WorkerParameters) : Worker(appContext, workerParams) {

    override fun doWork(): Result {
        NotificationManager.showNotification(applicationContext)
        return Result.success()
    }
}
