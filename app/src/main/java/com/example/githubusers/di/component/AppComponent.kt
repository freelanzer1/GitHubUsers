package com.example.githubusers.di.component

import com.example.githubusers.ui.MainActivity
import com.example.githubusers.di.module.AppModule
import com.example.githubusers.di.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class, NetworkModule::class])
interface AppComponent{

    fun inject(target: MainActivity)
}