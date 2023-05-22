package com.example.master;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class activity2 extends AppCompatActivity {
    ImageButton btn_Back;
    ProgressBar time;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        prog();
        btn_Back = (ImageButton) findViewById(R.id.btnBack);
        TextView textView = findViewById(R.id.question);
        String text ="He took the the easy way out";
        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                gonext();
                Toast.makeText(activity2.this,"one",Toast.LENGTH_SHORT).show();

            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLACK);
                ds.setUnderlineText(false);
            }
        };
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                gonext();
                Toast.makeText(activity2.this,"two",Toast.LENGTH_SHORT).show();
                correct();
            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLACK);
                ds.setUnderlineText(false);
            }
        };
        ClickableSpan clickableSpan3 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                gonext();
                Toast.makeText(activity2.this,"three",Toast.LENGTH_SHORT).show();

            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLACK);
                ds.setUnderlineText(false);
            }
        };
        ss.setSpan(clickableSpan1, 0,7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan2, 8,15,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss.setSpan(clickableSpan3, 16,28,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
//                Toast.makeText(WordConstruction1.this,"balik",Toast.LENGTH_SHORT).show();
            }



        });

    }
    public void correct(){
        Intent get = getIntent();
        int num1 = get.getIntExtra("q1",0);
        int num2 = get.getIntExtra("time1", 0);
        Intent intent = new Intent(this, WordConstruction3.class);
        intent.putExtra("q2",1+num1);
        intent.putExtra("time2", count+num2);
        startActivity(intent);
    }
    public void gonext(){
        Intent get = getIntent();
        int num1 = get.getIntExtra("q1",0);
        int num2 = get.getIntExtra("time1", 0);
        Intent intent = new Intent(this, WordConstruction3.class);
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