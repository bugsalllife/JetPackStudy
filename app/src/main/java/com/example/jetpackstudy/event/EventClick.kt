package com.example.jetpackstudy.event

import android.content.Intent
import android.view.View
import com.example.jetpackstudy.LifecycleLearnActivity

class EventClick {

    fun startLifecycleLearn(view: View) {
        view.context.startActivity(Intent(
            view.context, LifecycleLearnActivity::class.java
        ))
    }

}