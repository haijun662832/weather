package com.bstw.weather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * 为了避免用到 context 对象时候方便获取  Context 对象. MyApplication.context
 */
class MyApplication : Application() {
    companion object {
        /**
         * 此处不用担心内存泄漏 因为只要app一直存活 Application对象一直在.
         */
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}