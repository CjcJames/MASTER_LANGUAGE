package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class Stats extends AppCompatActivity {

    ImageButton btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stats);
        prog();
        btn_Back = (ImageButton) findViewById(R.id.btnBack);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
//                Toast.makeText(Stats.this,"balik",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void goBack(){
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }
    public void prog(){
       ProgressBar pbSd,pbSc,pbACd,pbACc;
       pbSd = findViewById(R.id.pbSdelivery);
       pbSc = findViewById(R.id.pbSconstruction);
       pbACc = findViewById(R.id.pbACconstruction);
       pbACd = findViewById(R.id.pbACdelivery);
       Intent get = getIntent();
       int num1 = get.getIntExtra("score1",0);
       int num2 = get.getIntExtra("time1", 0);
       int num1pb = (num1*100)/5;
        int num2pb =0;
        if (num2pb > 0) {
            num2pb  = 75-(num2/10);
        }

        pbSd.setProgress(num2pb);
        pbACd.setProgress(num1pb);
        pbSd.setMax(75);
        pbACd.setMax(100);
        int num3 = get.getIntExtra("scored1",0);
        int num4 = get.getIntExtra("timed1", 0);
        int num3pb = (num3*100)/5;
        int num4pb= 0;
        if (num4 > 0) {
            num4pb  = 75-(num4/10);
        }

        pbSc.setProgress(num4pb);
        pbACc.setProgress(num3pb);
        pbSc.setMax(75);
        pbACc.setMax(100);

    }
}