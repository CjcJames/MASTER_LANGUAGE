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

public class PhraseEasy1 extends AppCompatActivity {

    ImageButton btn_Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrase_easy1);

        btn_Back = (ImageButton) findViewById(R.id.btnBack);

        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
//                Toast.makeText(PhraseEasy1.this,"bumalik",Toast.LENGTH_SHORT).show();
            }
        });
    }
        public void goBack(){
            Intent intent = new Intent(this, Phrase.class);
            startActivity(intent);

    }


}