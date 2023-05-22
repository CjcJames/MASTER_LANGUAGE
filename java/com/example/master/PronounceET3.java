package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class PronounceET3 extends AppCompatActivity {

    ImageButton btn_Back,sound;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronounce_et3);
        btn_Back = findViewById(R.id.btnBack);
        sound = findViewById(R.id.sound);
        btn_Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goBack();
//                Toast.makeText(WordDelivery1.this,"balik",Toast.LENGTH_SHORT).show();
            }
        });
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.sea);
        sound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
    }
    public void goBack(){
        Intent intent = new Intent(this, Pronun.class);
        startActivity(intent);
    }
}