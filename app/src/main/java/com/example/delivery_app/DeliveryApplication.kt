package com.example.delivery_app

import android.app.Application
import android.content.Context

class DeliveryApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this
    }

    override fun onTerminate() {
        super.onTerminate()
        appContext = null
    }
    companion object{  //끝날대 null 처리
        var appContext: Context? = null
        private set  //내부에서만 사용될것입니다.
    }
}