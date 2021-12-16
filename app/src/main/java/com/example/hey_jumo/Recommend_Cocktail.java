package com.example.hey_jumo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Recommend_Cocktail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommend__cocktail);

        Button backbtn = (Button) findViewById(R.id.backBtn);

        ImageButton sojubtn = (ImageButton)findViewById(R.id.SojuBtn);
        ImageButton bearbtn = (ImageButton)findViewById(R.id.BearBtn);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        sojubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Recommend_Cocktail.this, Subselect1.class);
                startActivity(intent);
            }
        });
        bearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Recommend_Cocktail.this, Subselect2.class);
                startActivity(intent);
            }
        });

    }
}