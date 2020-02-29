package com.example.dokkaebiappattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class About extends AppCompatActivity {
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        back = findViewById(R.id.aboutBack);

        back.setOnClickListener(new View.OnClickListener(){
                                     @Override
                                     public void onClick(View v) {
                                         Intent intent = new Intent(About.this, Main2Activity.class);
                                         intent.putExtra("name", "You Discovered An Easter Egg Good For you");

                                         startActivity(intent);
                                     }
                                 }
        );
    }
}
