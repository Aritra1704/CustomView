package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Log.d("lifecycle_test", "SecondActivity_onCreate");
    }

    public void onClicked(View view) {
        finish();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("lifecycle_test", "SecondActivity_onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle_test", "SecondActivity_onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle_test", "SecondActivity_onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("lifecycle_test", "SecondActivity_onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle_test", "SecondActivity_onDestroy");
    }
}
