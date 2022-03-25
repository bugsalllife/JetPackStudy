package com.example.jetpackstudy.data.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ActivityLifeModel: ViewModel() {

    var lifeData: MutableLiveData<MutableList<String>> = MutableLiveData()

}