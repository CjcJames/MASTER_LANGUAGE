package com.example.master;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    ImageButton startg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startg = (ImageButton) findViewById(R.id.btn_start);

        startg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                next();
//                Toast.makeText(MainActivity.this,"gumana", Toast.LENGTH_LONG).show();
            }
        });
    }
    public void next(){
        Intent intent = new Intent(this, Page2.class);
        this.startActivity(intent);
    }
}