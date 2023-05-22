package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class WordDelivery2 extends AppCompatActivity {

    ImageButton btn_Back,sound;
    Button c1,c2,c3,c4;
    ProgressBar time;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_delivery2);

        prog();
        btn_Back = (ImageButton) findViewById(R.id.btnBack);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
//                Toast.makeText(WordDelivery1.this,"balik",Toast.LENGTH_SHORT).show();
            }
        });
        sound = findViewById(R.id.sound);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.gold);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        c1 = findViewById(R.id.b1);
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gonext();

            }
        });
        c2 = findViewById(R.id.b2);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gonext();

            }
        });
        c3 = findViewById(R.id.b3);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gonext();
                correct();
            }
        });
        c4 = findViewById(R.id.b4);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gonext();
            }
        });
    }
    public void correct(){
        Intent get = getIntent();
        int num1 = get.getIntExtra("q1",0);
        int num2 = get.getIntExtra("time1", 0);
        Intent intent = new Intent(this, WordDelivery3.class);
        intent.putExtra("q2",1+num1);
        intent.putExtra("time2", count+num2);
        startActivity(intent);
    }
    public void gonext(){
        Intent get = getIntent();
        int num1 = get.getIntExtra("q1",0);
        int num2 = get.getIntExtra("time1", 0);
        Intent intent = new Intent(this, WordDelivery3.class);
        intent.putExtra("q2",0+num1);
        intent.putExtra("time2", count+num2);
        startActivity(intent);
    }
    public void goBack(){
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }
    public void prog(){
        time = (ProgressBar) findViewById(R.id.timer1);
        Timer t = new Timer();
        TimerTask tt =  new TimerTask(){

            @Override
            public void run() {
                count++;
                time.setProgress(count);
                if (count == 150){
                    t.cancel();
                }
            }
        };
        t.schedule(tt,0,150);
    }
}