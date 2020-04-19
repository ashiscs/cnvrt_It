package com.example.firstcourseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        Log.i("Info","Button Pressed !!");
    }

    public void clickIt(View view) {

        Log.i("Info","Amazing, you clicked it !!");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
