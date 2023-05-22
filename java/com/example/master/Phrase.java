package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Phrase extends AppCompatActivity {

    ImageButton btn_Back, btn_Easy1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase);

        btn_Back = (ImageButton) findViewById(R.id.btnBack);
        btn_Easy1 = (ImageButton)findViewById(R.id.btnEasy1);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
//                Toast.makeText(Phrase.this,"balik",Toast.LENGTH_SHORT).show();
            }
        });

        btn_Easy1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goEasy1();
//                Toast.makeText(Phrase.this,"lezgo Easy 1",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void goEasy1(){
        Intent intent2 = new Intent(this, PhraseEasy1.class);
        startActivity(intent2);
    }
    public void goBack(){
        Intent intent = new Intent(this, Page2.class);
        startActivity(intent);
    }
}