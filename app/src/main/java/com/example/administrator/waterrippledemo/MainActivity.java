package com.example.administrator.waterrippledemo;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.waterrippledemo.view.CircleRelativeLayout;
import com.example.administrator.waterrippledemo.view.WaveButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        CircleRelativeLayout crlayout = (CircleRelativeLayout) findViewById(R.id.crlayout);
//        crlayout.setColor(getResources().getColor(R.color.colorAccent));
//        crlayout.setAlhpa(160);
        final WaveButton waveButton = (WaveButton) findViewById(R.id.wave_button);
        waveButton.setTextColor(Color.WHITE);
        waveButton.startAnimation();
        waveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,Main2Activity.class));
            }
        });

    }
}
