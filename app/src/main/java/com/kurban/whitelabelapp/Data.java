package com.kurban.whitelabelapp;

import android.content.Context;

import androidx.annotation.NonNull;

public class Data {

    public String getAppName(@NonNull Context context) {
        return context.getString(R.string.app_name);
    }

    public String getTextValue() {
        return BuildConfig.CUSTOM_VALUE;
    }
}
