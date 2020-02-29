package com.example.dokkaebiappattempt;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class Coaches extends AppCompatActivity {
    private Button Coach1;
    private Button Coach2;
    private Button Coach3;
    private Button Coach4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coaches);
        Coach1 = findViewById(R.id.coach1);

        Coach1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Coaches.this, Steph.class);

                startActivity(intent);
            }


        });
    }
}
