package com.example.githubusers.di.component

import com.example.githubusers.ThisApp
import dagger.Component


@Component
internal interface ThisAppComponent {
    fun injectInto(holder: ThisApp?)
}