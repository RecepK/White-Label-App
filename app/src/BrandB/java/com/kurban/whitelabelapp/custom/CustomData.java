package com.kurban.whitelabelapp.custom;

import android.content.Context;

import androidx.annotation.NonNull;

import com.kurban.whitelabelapp.BuildConfig;
import com.kurban.whitelabelapp.R;

public class CustomData {

    private String TAG = "Custom Feature: Brand B";

    public String getAppName(@NonNull Context context) {
        return TAG + context.getString(R.string.app_name);
    }

    public String getTextValue() {
        return TAG + BuildConfig.CUSTOM_VALUE;
    }
}
