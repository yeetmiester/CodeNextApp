package com.example.dokkaebiappattempt;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothA2dp;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import java.util.Timer;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton enter;
    private CountDownTimer timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        timer = new CountDownTimer(3000, 1000) {
//            @Override
//            public void onTick(long millisUntilFinished) {
//
//            }
//
//            @Override
//            public void onFinish() {
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//
//            };
//
//
//
//        };
//
//        timer.start();
    }
}
