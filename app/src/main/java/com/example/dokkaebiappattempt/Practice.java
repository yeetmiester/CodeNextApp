package com.example.dokkaebiappattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Practice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practice);

        Bundle bundle = getIntent().getExtras();
    }
}
