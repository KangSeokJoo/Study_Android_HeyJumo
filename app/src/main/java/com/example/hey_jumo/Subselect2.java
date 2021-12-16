package com.example.hey_jumo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Subselect2 extends AppCompatActivity {

    public int clickCount2 = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subselect2);

        Button backbtn = (Button) findViewById(R.id.backBtn);
        final Button nextBtn_ = (Button)findViewById(R.id.NextBtn_);
        final Button nextBtn_1 = (Button)findViewById(R.id.NextBtn_1);
        final Button nextBtn_2 = (Button)findViewById(R.id.NextBtn_2);



        final ImageButton img_1 = (ImageButton) findViewById(R.id.tomatobtn2);
        final ImageButton img_2 = (ImageButton) findViewById(R.id.jamongjuicebtn2);
        final ImageButton img_3 = (ImageButton) findViewById(R.id.blackbeerbtn2);
        final ImageButton img_4 = (ImageButton) findViewById(R.id.sojubtn2);
        final ImageButton img_5 = (ImageButton) findViewById(R.id.colabtn2);
        final ImageButton img_6 = (ImageButton) findViewById(R.id.bongbongbtn2);
        final ImageButton img_7 = (ImageButton) findViewById(R.id.sparklebtn2);
        final ImageButton img_8 = (ImageButton) findViewById(R.id.baeksaebtn2);
        final ImageButton img_9 = (ImageButton) findViewById(R.id.sansabtn2);
        final ImageButton img_10 = (ImageButton) findViewById(R.id.lemonbtn2);
        final ImageButton img_11 = (ImageButton) findViewById(R.id.ciderbtn2);
        final ImageButton img_12 = (ImageButton) findViewById(R.id.parkgasbtn2);
        final ImageButton img_13 = (ImageButton) findViewById(R.id.coffebtn2);



        nextBtn_1.setEnabled(false);
        nextBtn_1.setVisibility(View.GONE);
        nextBtn_2.setEnabled(false);
        nextBtn_2.setVisibility(View.GONE);

        img_5.setEnabled(false);
        img_5.setVisibility(View.GONE);
        img_6.setEnabled(false);
        img_6.setVisibility(View.GONE);
        img_7.setEnabled(false);
        img_7.setVisibility(View.GONE);
        img_8.setEnabled(false);
        img_8.setVisibility(View.GONE);
        img_9.setEnabled(false);
        img_9.setVisibility(View.GONE);
        img_10.setEnabled(false);
        img_10.setVisibility(View.GONE);
        img_11.setEnabled(false);
        img_11.setVisibility(View.GONE);
        img_12.setEnabled(false);
        img_12.setVisibility(View.GONE);
        img_13.setEnabled(false);
        img_13.setVisibility(View.GONE);

        img_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(Subselect2.this, Bear.class);
                startActivity(intent);
                Bear.redcall = true;
            }
        });
        img_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(Subselect2.this, Bear.class);
                startActivity(intent);
                Bear.suncall = true;
            }
        });
        img_3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(Subselect2.this, Bear.class);
                startActivity(intent);
                Bear.blackcall = true;
            }
        });
        img_6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(Subselect2.this, Bear.class);
                startActivity(intent);
                Bear.Bongcall = true;
            }
        });

        img_5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(Subselect2.this, Bear.class);
                startActivity(intent);
                Bear.Gocall = true;
            }
        });
        img_9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(Subselect2.this, Bear.class);
                startActivity(intent);
                Bear.Socall = true;
            }
        });
        img_4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                Intent intent = new Intent(Subselect2.this, Bear.class);
                startActivity(intent);
                Bear.Sojucall = true;
            }
        });

        nextBtn_.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(clickCount2 == 0) {
                    img_1.setEnabled(false);
                    img_2.setEnabled(false);
                    img_3.setEnabled(false);
                    img_4.setEnabled(false);
                    img_1.setVisibility(View.GONE);
                    img_2.setVisibility(View.GONE);
                    img_3.setVisibility(View.GONE);
                    img_4.setVisibility(View.GONE);

                    img_5.setEnabled(true);
                    img_6.setEnabled(true);
                    img_7.setEnabled(true);
                    img_8.setEnabled(true);
                    img_5.setVisibility(View.VISIBLE);
                    img_6.setVisibility(View.VISIBLE);
                    img_7.setVisibility(View.VISIBLE);
                    img_8.setVisibility(View.VISIBLE);

                    nextBtn_.setEnabled(false);
                    nextBtn_.setVisibility(View.GONE);

                    nextBtn_1.setEnabled(true);
                    nextBtn_1.setVisibility(View.VISIBLE);

                    clickCount2 ++;

                }
            }
        });

        nextBtn_1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if (clickCount2 == 1) {
                    img_5.setEnabled(false);
                    img_6.setEnabled(false);
                    img_7.setEnabled(false);
                    img_8.setEnabled(false);
                    img_5.setVisibility(View.GONE);
                    img_6.setVisibility(View.GONE);
                    img_7.setVisibility(View.GONE);
                    img_8.setVisibility(View.GONE);

                    img_9.setEnabled(true);
                    img_10.setEnabled(true);
                    img_11.setEnabled(true);
                    img_12.setEnabled(true);
                    img_9.setVisibility(View.VISIBLE);
                    img_10.setVisibility(View.VISIBLE);
                    img_11.setVisibility(View.VISIBLE);
                    img_12.setVisibility(View.VISIBLE);

                    nextBtn_1.setEnabled(false);
                    nextBtn_1.setVisibility(View.GONE);

                    nextBtn_2.setEnabled(true);
                    nextBtn_2.setVisibility(View.VISIBLE);
                    clickCount2++;
                }
            }
        });

        nextBtn_2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if (clickCount2 == 2) {
                    img_9.setEnabled(false);
                    img_10.setEnabled(false);
                    img_11.setEnabled(false);
                    img_12.setEnabled(false);
                    img_9.setVisibility(View.GONE);
                    img_10.setVisibility(View.GONE);
                    img_11.setVisibility(View.GONE);
                    img_12.setVisibility(View.GONE);

                    img_13.setEnabled(true);
                    img_13.setVisibility(View.VISIBLE);

                    nextBtn_2.setEnabled(false);
                    nextBtn_2.setVisibility(View.GONE);

                    clickCount2++;
                }
            }
        });


        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(clickCount2 == 0){
                    finish();
                }
                else if(clickCount2 == 1){
                    img_1.setEnabled(true);
                    img_2.setEnabled(true);
                    img_3.setEnabled(true);
                    img_4.setEnabled(true);
                    img_1.setVisibility(View.VISIBLE);
                    img_2.setVisibility(View.VISIBLE);
                    img_3.setVisibility(View.VISIBLE);
                    img_4.setVisibility(View.VISIBLE);

                    img_5.setEnabled(false);
                    img_6.setEnabled(false);
                    img_7.setEnabled(false);
                    img_8.setEnabled(false);
                    img_5.setVisibility(View.GONE);
                    img_6.setVisibility(View.GONE);
                    img_7.setVisibility(View.GONE);
                    img_8.setVisibility(View.GONE);

                    nextBtn_1.setEnabled(false);
                    nextBtn_1.setVisibility(View.GONE);

                    nextBtn_.setEnabled(true);
                    nextBtn_.setVisibility(View.VISIBLE);

                    clickCount2--;

                }else if(clickCount2 == 2){
                    img_5.setEnabled(true);
                    img_6.setEnabled(true);
                    img_7.setEnabled(true);
                    img_8.setEnabled(true);
                    img_5.setVisibility(View.VISIBLE);
                    img_6.setVisibility(View.VISIBLE);
                    img_7.setVisibility(View.VISIBLE);
                    img_8.setVisibility(View.VISIBLE);

                    img_9.setEnabled(false);
                    img_10.setEnabled(false);
                    img_11.setEnabled(false);
                    img_12.setEnabled(false);
                    img_9.setVisibility(View.GONE);
                    img_10.setVisibility(View.GONE);
                    img_11.setVisibility(View.GONE);
                    img_12.setVisibility(View.GONE);

                    nextBtn_2.setEnabled(false);
                    nextBtn_2.setVisibility(View.GONE);

                    nextBtn_1.setEnabled(true);
                    nextBtn_1.setVisibility(View.VISIBLE);
                    clickCount2--;
                }else if(clickCount2 == 3){
                    img_9.setEnabled(true);
                    img_10.setEnabled(true);
                    img_11.setEnabled(true);
                    img_12.setEnabled(true);
                    img_9.setVisibility(View.VISIBLE);
                    img_10.setVisibility(View.VISIBLE);
                    img_11.setVisibility(View.VISIBLE);
                    img_12.setVisibility(View.VISIBLE);

                    img_13.setEnabled(false);
                    img_13.setVisibility(View.GONE);

                    nextBtn_2.setEnabled(true);
                    nextBtn_2.setVisibility(View.VISIBLE);
                    clickCount2--;
                }
            }
        });


    }
}