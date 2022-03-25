package com.example.jetpackstudy

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.jetpackstudy.data.vm.ActivityLifeModel
import com.example.jetpackstudy.databinding.ActivityLifecycleLearnBinding

class LifecycleLearnActivity : AppCompatActivity() {

    private val activityLifeModel = ActivityLifeModel()

    private lateinit var binding: ActivityLifecycleLearnBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLifeModel.lifeData.value = mutableListOf("Activity: onCreate")
        binding = ActivityLifecycleLearnBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.life = activityLifeModel
        activityLifeModel.lifeData.observe(this
        ) {
            binding.lifeOfActivity.text = ButtonTextUtil.showLifecycle(activityLifeModel)
        }
    }

    override fun onStart() {
        super.onStart()
        postLife("onStart")
    }

    override fun onRestart() {
        super.onRestart()
        postLife("onRestart")
    }

    override fun onResume() {
        super.onResume()
        postLife("onResume")
    }

    override fun onPause() {
        super.onPause()
        postLife("onPause")
    }

    override fun onStop() {
        super.onStop()
        postLife("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        postLife("onDestroy")
    }

    private fun postLife(lifecycle: String) {
        activityLifeModel.lifeData.value?.add("Activity: $lifecycle")
        activityLifeModel.lifeData.postValue(activityLifeModel.lifeData.value)
    }
}