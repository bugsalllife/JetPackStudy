package com.example.jetpackstudy;

import androidx.lifecycle.MutableLiveData;

import com.example.jetpackstudy.data.vm.ActivityLifeModel;

import java.util.List;

public class ButtonTextUtil {

    public static String getShowText(String text) {
        if (text == null) {
            return "Default Button";
        }
        return text;
    }

    public static String showLifecycle(ActivityLifeModel model) {
        MutableLiveData<List<String>> lifeData = model.getLifeData();
        List<String> lifeList = lifeData.getValue();
        StringBuilder sb = new StringBuilder();
        if (lifeList == null) {
            return "NULL";
        }
        for (String item: lifeList) {
            sb.append(item).append(" ->\n");
        }
        return sb.toString();
    }

}
