package com.example.jetpackstudy.data.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstPageViewModel : ViewModel() {
    val buttonText: MutableLiveData<MutableList<String>> by lazy {
        MutableLiveData()
    }
}