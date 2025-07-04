package com.bussiness.ecommerce

import android.app.Application
import com.bussiness.ecommerce.app.di.initKoin
import org.koin.android.ext.koin.androidContext

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin{
            androidContext(this@MyApplication)
        }
    }
}