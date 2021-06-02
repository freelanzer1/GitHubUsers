package com.example.githubusers.ui.heroes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import com.example.githubusers.R

class HeroesFragment : Fragment() {

    private lateinit var heroesViewModel: HeroesViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        heroesViewModel =
                ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(HeroesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_heroes, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        heroesViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}