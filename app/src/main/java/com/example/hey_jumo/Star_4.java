package com.example.hey_jumo;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Star_4 extends AppCompatActivity {

    ImageButton btn1, btn2, btn3, btn4, btn5, btn6;
    ImageView iv1, iv2, iv3, iv4, iv5, iv6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star_4);

        Button backbtn = (Button) findViewById(R.id.backBtn);
        btn1 = (ImageButton) findViewById(R.id.button1);
        btn2 = (ImageButton) findViewById(R.id.button2);
        btn3 = (ImageButton) findViewById(R.id.button3);
        btn4 = (ImageButton) findViewById(R.id.button4);
        btn5 = (ImageButton) findViewById(R.id.button5);
        btn6 = (ImageButton) findViewById(R.id.button6);

        iv1 = (ImageView) findViewById(R.id.img1);
        iv2 = (ImageView) findViewById(R.id.img2);
        iv3 = (ImageView) findViewById(R.id.img3);
        iv4 = (ImageView) findViewById(R.id.img4);
        iv5 = (ImageView) findViewById(R.id.img5);
        iv6 = (ImageView) findViewById(R.id.img6);

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        iv1.setVisibility(View.GONE);   // 시작 시 imageView 제거
        iv2.setVisibility(View.GONE);
        iv3.setVisibility(View.GONE);
        iv4.setVisibility(View.GONE);
        iv5.setVisibility(View.GONE);
        iv6.setVisibility(View.GONE);

        btn1.setOnClickListener(new View.OnClickListener() {    // 첫번째 사진 클릭시 imageView 생성
            @Override
            public void onClick(View v) {
                iv1.setVisibility(View.VISIBLE);    // imageVIew 생성

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {    // 첫번째 사진 클릭시 imageView 생성
            @Override
            public void onClick(View v) {
                iv2.setVisibility(View.VISIBLE);    // imageVIew 생성

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {    // 첫번째 사진 클릭시 imageView 생성
            @Override
            public void onClick(View v) {
                iv3.setVisibility(View.VISIBLE);    // imageVIew 생성

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {    // 첫번째 사진 클릭시 imageView 생성
            @Override
            public void onClick(View v) {
                iv4.setVisibility(View.VISIBLE);    // imageVIew 생성

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {    // 첫번째 사진 클릭시 imageView 생성
            @Override
            public void onClick(View v) {
                iv5.setVisibility(View.VISIBLE);    // imageVIew 생성

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {    // 첫번째 사진 클릭시 imageView 생성
            @Override
            public void onClick(View v) {
                iv6.setVisibility(View.VISIBLE);    // imageVIew 생성

            }
        });

        iv1.setOnClickListener(new MyListener());   // 클래스 호출
        iv2.setOnClickListener(new MyListener());
        iv3.setOnClickListener(new MyListener());
        iv4.setOnClickListener(new MyListener());
        iv5.setOnClickListener(new MyListener());
        iv6.setOnClickListener(new MyListener());

    }

    class MyListener implements View.OnClickListener {  // 클래스 생성 imageView 클릭시 다시 제거
        public void onClick(View v) {
            iv1.setVisibility(View.GONE);
            iv2.setVisibility(View.GONE);
            iv3.setVisibility(View.GONE);
            iv4.setVisibility(View.GONE);
            iv5.setVisibility(View.GONE);
            iv6.setVisibility(View.GONE);
        }
    }


}