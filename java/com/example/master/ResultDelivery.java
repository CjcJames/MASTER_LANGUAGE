package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class ResultDelivery extends AppCompatActivity {

    ImageButton btn_Back;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_delivery);
        result();
        btn_Back = (ImageButton) findViewById(R.id.btnBack);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
//                Toast.makeText(WordConstruction1.this,"balik",Toast.LENGTH_SHORT).show();
            }



        });
    }
    public void result(){
        Intent intent = getIntent();
        int num5 = intent.getIntExtra("q5", 0);
        int time5 = intent.getIntExtra("time5", 0);
        TextView rescore = findViewById(R.id.totalScore);
        TextView retime = findViewById(R.id.timeresult);
        rescore.setText(""+num5);
        retime.setText(""+time5/10+" S");

    }
    public void goBack(){
        Intent geti = getIntent();
        int num1 = geti.getIntExtra("q5", 0);
        int count = geti.getIntExtra("time5", 0);
        Intent intent = new Intent(this, Page2.class);
        intent.putExtra("scored1",num1);
        intent.putExtra("countd1", count);
        startActivity(intent);
    }
}