package com.example.githubusers

import android.app.Application
import com.example.githubusers.di.component.AppComponent
import com.example.githubusers.di.component.DaggerAppComponent
import com.example.githubusers.di.module.AppModule

class ThisApp : Application(){

    lateinit var thisAppComponent: AppComponent

    private fun initDagger(app: ThisApp): AppComponent =
        DaggerAppComponent.builder()
            .appModule(AppModule(app))
            .build()

    override fun onCreate() {
        super.onCreate()
        thisAppComponent = initDagger(this)
    }
}