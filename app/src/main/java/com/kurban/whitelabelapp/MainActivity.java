package com.kurban.whitelabelapp;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.kurban.whitelabelapp.custom.CustomData;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);


        // Data
        Data data = new Data();

        String msg = String.format("App Name:%s" + "\n" + "Text Value:%s ",
                data.getAppName(getApplicationContext()), data.getTextValue());

        textView.setText(msg);


        // CustomData
        CustomData customFeature = new CustomData();

        String featureData = String.format("Feature Data:" + "\n" + "App Name:%s" + "\n" + "Text Value:%s ",
                customFeature.getAppName(getApplicationContext()), customFeature.getTextValue());

        Toast.makeText(getApplicationContext(), featureData, Toast.LENGTH_SHORT).show();
    }
}
