package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {


    ImageButton btn_Pronun,btn_Phrase,btn_Stats,btn_WD1,btn_WC1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        btn_Pronun = (ImageButton) findViewById(R.id.btnPronun);
        btn_Phrase = (ImageButton) findViewById(R.id.btnPhrase);
        btn_Stats = (ImageButton) findViewById(R.id.btnStats);
        btn_WD1 = (ImageButton) findViewById(R.id.btnWDlvl1);
        btn_WC1 = (ImageButton) findViewById(R.id.btnWClvl1);

        btn_Pronun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPronun();
//                Toast.makeText(Page2.this, "next", Toast.LENGTH_SHORT).show();
            }
        });

        btn_Phrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goPhrase();
//                Toast.makeText(Page2.this, "next", Toast.LENGTH_SHORT).show();
            }
        });

        btn_Stats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goStats();
//                Toast.makeText(Page2.this, "next", Toast.LENGTH_SHORT).show();


            }
        });

        btn_WD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goWD1();
//                Toast.makeText(Page2.this, "next", Toast.LENGTH_SHORT).show();
            }
        });

        btn_WC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goWC1();
//                Toast.makeText(Page2.this, "next", Toast.LENGTH_SHORT).show();
            }
        });
    }
        public void goPronun(){
            Intent intent = new Intent(this, Pronun.class);
            startActivity(intent);
    }
        public void goPhrase(){
            Intent intent = new Intent(this, Phrase.class);
            startActivity(intent);
        }
        public void goStats(){
            Intent get = getIntent();
            int num1 = get.getIntExtra("score1",0);
            int num2 = get.getIntExtra("count1",0);
            int num3 = get.getIntExtra("scored1",0);
            int num4 = get.getIntExtra("countd1",0);
            Intent intent = new Intent(this, Stats.class);
            intent.putExtra("score1", num1);
            intent.putExtra("time1", num2);
            intent.putExtra("scored1", num3);
            intent.putExtra("timed1", num4);
            startActivity(intent);
        }
        public void goWD1(){
            Intent intent = new Intent(this, WordDelivery1.class);
            startActivity(intent);
        }
        public void goWC1(){
            Intent intent = new Intent(this, WordConstruction1.class);
            startActivity(intent);
        }
}