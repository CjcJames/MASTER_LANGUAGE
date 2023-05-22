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
import android.widget.TextView;
import android.widget.Toast;

public class Pronun extends AppCompatActivity {

ImageButton btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronun);

        TextView tv1 = findViewById(R.id.tv1);
        TextView tv2 = findViewById(R.id.tv2);
        TextView tv3 = findViewById(R.id.tv3);
        TextView tv4 = findViewById(R.id.tv4);
        TextView tv5 = findViewById(R.id.tv5);
        TextView tv6 = findViewById(R.id.tv6);
        String text1 ="Star Fish";
        String text2 ="Sea Horse";
        String text3 ="Jelly Fish";
        String text4 ="Alimango";
        String text5 ="Pating";
        String text6 ="Balyena";
        SpannableString ss = new SpannableString(text1);
        SpannableString ss1 = new SpannableString(text2);
        SpannableString ss2 = new SpannableString(text3);
        SpannableString ss3 = new SpannableString(text4);
        SpannableString ss4 = new SpannableString(text5);
        SpannableString ss5 = new SpannableString(text6);

        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {

                Intent intent = new Intent(Pronun.this, PronounceET2.class);
                startActivity(intent);

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

                Intent intent = new Intent(Pronun.this, PronounceET3.class);
                startActivity(intent);

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
                Intent intent = new Intent(Pronun.this, PronounceET1.class);
                startActivity(intent);

            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLACK);
                ds.setUnderlineText(false);
            }
        };
        ClickableSpan clickableSpan4 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(Pronun.this, PronounceTT1.class);
                startActivity(intent);


            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLACK);
                ds.setUnderlineText(false);
            }
        };
        ClickableSpan clickableSpan5 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {

                Intent intent = new Intent(Pronun.this, PronounceTT2.class);
                startActivity(intent);

            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLACK);
                ds.setUnderlineText(false);
            }
        };
        ClickableSpan clickableSpan6 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Intent intent = new Intent(Pronun.this, PronounceTT3.class);
                startActivity(intent);


            }
            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLACK);
                ds.setUnderlineText(false);
            }
        };
        btn_Back = (ImageButton) findViewById(R.id.btnBack);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
//                Toast.makeText(Pronun.this,"balik",Toast.LENGTH_SHORT).show();
            }
        });
        ss.setSpan(clickableSpan1, 0,8, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(clickableSpan2, 0,8,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss2.setSpan(clickableSpan3, 0,9,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss3.setSpan(clickableSpan4, 0,7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss4.setSpan(clickableSpan5, 0,5,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss5.setSpan(clickableSpan6, 0,6,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        tv1.setText(ss);
        tv2.setText(ss1);
        tv3.setText(ss2);
        tv4.setText(ss3);
        tv5.setText(ss4);
        tv6.setText(ss5);
        tv1.setMovementMethod(LinkMovementMethod.getInstance());
        tv2.setMovementMethod(LinkMovementMethod.getInstance());
        tv3.setMovementMethod(LinkMovementMethod.getInstance());
        tv4.setMovementMethod(LinkMovementMethod.getInstance());
        tv5.setMovementMethod(LinkMovementMethod.getInstance());
        tv6.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void goBack(){
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }
}