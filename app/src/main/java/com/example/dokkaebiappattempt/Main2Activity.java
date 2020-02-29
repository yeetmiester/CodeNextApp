package com.example.dokkaebiappattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.os.Vibrator;
import android.widget.ImageButton;

public class Main2Activity extends AppCompatActivity {
    private Button about;
    private Button projects;
    private Button sign;
    private ImageButton vibrate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        about = findViewById(R.id.aboutBack);
        sign = findViewById(R.id.sign);
        projects = findViewById(R.id.projects);
        vibrate = findViewById(R.id.secret);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, About.class);

                startActivity(intent);
            }


        });

        projects.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Projects.class);

                startActivity(intent);
            }


        });

        sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Main2Activity.this, Coaches.class);

                startActivity(intent);
            }


        });

        vibrate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Vibrator vibrate = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

                long[] pattern = {0, 1000, 100, 1000, 100, 1000, 1000};

                vibrate.vibrate(pattern, -1);

                System.out.println("Working");


            }


        });
    }
}
