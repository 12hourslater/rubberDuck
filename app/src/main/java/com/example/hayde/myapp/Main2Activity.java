package com.example.hayde.myapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d(TAG, "onCreate: started.");
        ImageView firstImage = (ImageView) findViewById(R.id.firstImage);

        int imageResource = getResources().getIdentifier("@drawable/sunglasses", null, this.getPackageName());
        firstImage.setImageResource(imageResource);
    }
}
