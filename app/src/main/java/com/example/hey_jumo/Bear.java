package com.example.hey_jumo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Bear extends AppCompatActivity {

    public  static  boolean redcall = false;
    public  static  boolean suncall = false;
    public  static  boolean blackcall = false;
    public  static  boolean Bongcall = false;
    public  static  boolean Gocall = false;
    public  static  boolean Socall = false;
    public  static  boolean Sojucall = false;

    public int cnt = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bear);

        Button btn = (Button)findViewById(R.id.NextSo);

        TextView redtext = (TextView)findViewById(R.id.RedEyeText);
        TextView redtext2 = (TextView)findViewById(R.id.RedEyeText2);
        TextView redtext3 = (TextView)findViewById(R.id.RedEyeText3);

        TextView suntext = (TextView)findViewById(R.id.SunText);
        TextView suntext2 = (TextView)findViewById(R.id.SunText2);
        TextView suntext3 = (TextView)findViewById(R.id.SunText3);

        TextView blacktext = (TextView)findViewById(R.id.blackText);
        TextView blacktext2 = (TextView)findViewById(R.id.blackText2);
        TextView blacktext3 = (TextView)findViewById(R.id.blackText3);

        TextView Bongtext = (TextView)findViewById(R.id.BongText);
        TextView Bongtext2 = (TextView)findViewById(R.id.BongText2);
        TextView Bongtext3 = (TextView)findViewById(R.id.BongText3);

        final TextView Gotext = (TextView)findViewById(R.id.GoText);
        final TextView Gotext2 = (TextView)findViewById(R.id.GoText2);
        final TextView Gotext3 = (TextView)findViewById(R.id.GoText3);

        TextView Sotext = (TextView)findViewById(R.id.SoText);
        TextView Sotext2 = (TextView)findViewById(R.id.SoText2);
        TextView Sotext3 = (TextView)findViewById(R.id.SoText3);

        ImageView redimage = (ImageView)findViewById(R.id.RedEyeView);
        ImageView sunimage = (ImageView)findViewById(R.id.SunView);
        ImageView blackimage = (ImageView)findViewById(R.id.blackView);
        ImageView Bongimage = (ImageView)findViewById(R.id.BongView);
        final ImageView Goimage = (ImageView)findViewById(R.id.GoView);
        ImageView Soimage = (ImageView)findViewById(R.id.SoView);

        btn.setEnabled(false);

        redimage.setEnabled(false);
        redtext.setEnabled(false);
        redtext2.setEnabled(false);
        redtext3.setEnabled(false);

        sunimage.setEnabled(false);
        suntext.setEnabled(false);
        suntext2.setEnabled(false);
        suntext3.setEnabled(false);

        blackimage.setEnabled(false);
        blacktext.setEnabled(false);
        blacktext2.setEnabled(false);
        blacktext3.setEnabled(false);

        Bongimage.setEnabled(false);
        Bongtext.setEnabled(false);
        Bongtext2.setEnabled(false);
        Bongtext3.setEnabled(false);

        Goimage.setEnabled(false);
        Gotext.setEnabled(false);
        Gotext2.setEnabled(false);
        Gotext3.setEnabled(false);

        Soimage.setEnabled(false);
        Sotext.setEnabled(false);
        Sotext2.setEnabled(false);
        Sotext3.setEnabled(false);

        if(redcall == true){
            redimage.setEnabled(true);
            redimage.setVisibility(View.VISIBLE);
            redtext.setEnabled(true);
            redtext.setVisibility(View.VISIBLE);
            redtext2.setEnabled(true);
            redtext2.setVisibility(View.VISIBLE);
            redtext3.setEnabled(true);
            redtext3.setVisibility(View.VISIBLE);
            redcall = false;
        }else if(suncall == true){
            sunimage.setEnabled(true);
            sunimage.setVisibility(View.VISIBLE);
            suntext.setEnabled(true);
            suntext.setVisibility(View.VISIBLE);
            suntext2.setEnabled(true);
            suntext2.setVisibility(View.VISIBLE);
            suntext3.setEnabled(true);
            suntext3.setVisibility(View.VISIBLE);
            suncall = false;
        }else if(blackcall == true){
            blackimage.setEnabled(true);
            blackimage.setVisibility(View.VISIBLE);
            blacktext.setEnabled(true);
            blacktext.setVisibility(View.VISIBLE);
            blacktext2.setEnabled(true);
            blacktext2.setVisibility(View.VISIBLE);
            blacktext3.setEnabled(true);
            blacktext3.setVisibility(View.VISIBLE);
            blackcall = false;
        }else if(Bongcall == true){
            Bongimage.setEnabled(true);
            Bongimage.setVisibility(View.VISIBLE);
            Bongtext.setEnabled(true);
            Bongtext.setVisibility(View.VISIBLE);
            Bongtext2.setEnabled(true);
            Bongtext2.setVisibility(View.VISIBLE);
            Bongtext3.setEnabled(true);
            Bongtext3.setVisibility(View.VISIBLE);
            Bongcall = false;
        }else if(Gocall == true){
            Goimage.setEnabled(true);
            Goimage.setVisibility(View.VISIBLE);
            Gotext.setEnabled(true);
            Gotext.setVisibility(View.VISIBLE);
            Gotext2.setEnabled(true);
            Gotext2.setVisibility(View.VISIBLE);
            Gotext3.setEnabled(true);
            Gotext3.setVisibility(View.VISIBLE);
            Gocall = false;
        }else if(Socall == true){
            Soimage.setEnabled(true);
            Soimage.setVisibility(View.VISIBLE);
            Sotext.setEnabled(true);
            Sotext.setVisibility(View.VISIBLE);
            Sotext2.setEnabled(true);
            Sotext2.setVisibility(View.VISIBLE);
            Sotext3.setEnabled(true);
            Sotext3.setVisibility(View.VISIBLE);
            Socall = false;
        }else if(Sojucall == true){
            btn.setEnabled(true);
            btn.setVisibility(View.VISIBLE);
            Socall = true;

        }

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cnt ++;
                if(cnt == 0){
                    Socall = false;
                    Gocall = true;
                }else if(cnt == 1){
                    Gocall = false;
                    Socall= true;
                }else if(cnt == 2){
                    Sojucall = false;
                }else {
                    Sojucall = false;
                }

            }
        });

    }
}
