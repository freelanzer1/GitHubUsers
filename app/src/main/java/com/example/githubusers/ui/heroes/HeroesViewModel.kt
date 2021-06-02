package com.example.githubusers.ui.heroes

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class HeroesViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is heroes Fragment"
    }
    val text: LiveData<String> = _text
}