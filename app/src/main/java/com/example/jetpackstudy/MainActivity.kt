package com.example.jetpackstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.jetpackstudy.data.vm.FirstPageViewModel
import com.example.jetpackstudy.databinding.ActivityMainBinding
import com.example.jetpackstudy.event.EventClick

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mainLayout: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        initButtonText(mainLayout)
    }

    private fun initButtonText(mainLayout: ActivityMainBinding) {
        val btTextModel = FirstPageViewModel()
        btTextModel.buttonText.value = mutableListOf("生命周期探索", "JetPack学习")
        mainLayout.fvm = btTextModel
        mainLayout.eventClick = EventClick()
    }
}