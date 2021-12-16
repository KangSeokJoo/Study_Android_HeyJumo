package com.example.hey_jumo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Subselect1 extends AppCompatActivity {

    public int clickCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subselect1);


        Button backbtn = (Button) findViewById(R.id.backBtn);
        final Button nextBtn = (Button)findViewById(R.id.NextBtn);
        final Button nextBtn1 = (Button)findViewById(R.id.NextBtn1);
        final Button nextBtn2 = (Button)findViewById(R.id.NextBtn2);
        final Button nextBtn3 = (Button)findViewById(R.id.NextBtn3);
        final Button nextBtn4 = (Button)findViewById(R.id.NextBtn4);
        final Button nextBtn5 = (Button)findViewById(R.id.NextBtn5);


        final ImageButton img1 = (ImageButton) findViewById(R.id.beerbtn);
        final ImageButton img2 = (ImageButton) findViewById(R.id.applebtn);
        final ImageButton img3 = (ImageButton) findViewById(R.id.bita500btn);
        final ImageButton img4 = (ImageButton) findViewById(R.id.bluelemonbtn);
        final ImageButton img5 = (ImageButton) findViewById(R.id.bongbongbtn);
        final ImageButton img6 = (ImageButton) findViewById(R.id.chocobtn);
        final ImageButton img7 = (ImageButton) findViewById(R.id.ciderbtn);
        final ImageButton img8 = (ImageButton) findViewById(R.id.coffebtn);
        final ImageButton img9 = (ImageButton) findViewById(R.id.colabtn);
        final ImageButton img10 = (ImageButton) findViewById(R.id.denmarkbtn);
        final ImageButton img11 = (ImageButton) findViewById(R.id.honeybtn);
        final ImageButton img12 = (ImageButton) findViewById(R.id.hot6btn);
        final ImageButton img13 = (ImageButton) findViewById(R.id.iceteabtn);
        final ImageButton img14 = (ImageButton) findViewById(R.id.lemonbtn);
        final ImageButton img15 = (ImageButton) findViewById(R.id.makgurlibtn);
        final ImageButton img16 = (ImageButton) findViewById(R.id.mangobtn);
        final ImageButton img17 = (ImageButton) findViewById(R.id.melonabtn);
        final ImageButton img18 = (ImageButton) findViewById(R.id.milkisbtn);
        final ImageButton img19 = (ImageButton) findViewById(R.id.mohitobtn);
        final ImageButton img20 = (ImageButton) findViewById(R.id.poweradebtn);
        final ImageButton img21 = (ImageButton) findViewById(R.id.screwbtn);
        final ImageButton img22 = (ImageButton) findViewById(R.id.sparklebtn);
        final ImageButton img23 = (ImageButton) findViewById(R.id.sujungbtn);
        final ImageButton img24 = (ImageButton) findViewById(R.id.tankboybtn);
        final ImageButton img25 = (ImageButton) findViewById(R.id.tomatobtn);
        final ImageButton img26 = (ImageButton) findViewById(R.id.waterjellybtn);
        final ImageButton img27 = (ImageButton) findViewById(R.id.yogurtbtn);
        final ImageButton img28 = (ImageButton) findViewById(R.id.younyoubtn);


        nextBtn1.setEnabled(false);
        nextBtn1.setVisibility(View.GONE);
        nextBtn2.setEnabled(false);
        nextBtn2.setVisibility(View.GONE);
        nextBtn3.setEnabled(false);
        nextBtn3.setVisibility(View.GONE);
        nextBtn4.setEnabled(false);
        nextBtn4.setVisibility(View.GONE);
        nextBtn5.setEnabled(false);
        nextBtn5.setVisibility(View.GONE);

        img5.setEnabled(false);
        img5.setVisibility(View.GONE);
        img6.setEnabled(false);
        img6.setVisibility(View.GONE);
        img7.setEnabled(false);
        img7.setVisibility(View.GONE);
        img8.setEnabled(false);
        img8.setVisibility(View.GONE);
        img9.setEnabled(false);
        img9.setVisibility(View.GONE);
        img10.setEnabled(false);
        img10.setVisibility(View.GONE);
        img11.setEnabled(false);
        img11.setVisibility(View.GONE);
        img12.setEnabled(false);
        img12.setVisibility(View.GONE);
        img13.setEnabled(false);
        img13.setVisibility(View.GONE);
        img14.setEnabled(false);
        img14.setVisibility(View.GONE);
        img15.setEnabled(false);
        img15.setVisibility(View.GONE);
        img16.setEnabled(false);
        img16.setVisibility(View.GONE);
        img17.setEnabled(false);
        img17.setVisibility(View.GONE);
        img18.setEnabled(false);
        img18.setVisibility(View.GONE);
        img19.setEnabled(false);
        img19.setVisibility(View.GONE);
        img20.setEnabled(false);
        img20.setVisibility(View.GONE);
        img21.setVisibility(View.GONE);
        img21.setEnabled(false);
        img22.setVisibility(View.GONE);
        img22.setEnabled(false);
        img23.setVisibility(View.GONE);
        img23.setEnabled(false);
        img24.setVisibility(View.GONE);
        img24.setEnabled(false);
        img25.setVisibility(View.GONE);
        img25.setEnabled(false);
        img26.setVisibility(View.GONE);
        img26.setEnabled(false);
        img27.setVisibility(View.GONE);
        img27.setEnabled(false);
        img28.setVisibility(View.GONE);
        img28.setEnabled(false);

        nextBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                if(clickCount == 0) {
                    img1.setEnabled(false);
                    img2.setEnabled(false);
                    img3.setEnabled(false);
                    img4.setEnabled(false);
                    img1.setVisibility(View.GONE);
                    img2.setVisibility(View.GONE);
                    img3.setVisibility(View.GONE);
                    img4.setVisibility(View.GONE);

                    img5.setEnabled(true);
                    img6.setEnabled(true);
                    img7.setEnabled(true);
                    img8.setEnabled(true);
                    img5.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img8.setVisibility(View.VISIBLE);

                    nextBtn.setEnabled(false);
                    nextBtn.setVisibility(View.GONE);

                    nextBtn1.setEnabled(true);
                    nextBtn1.setVisibility(View.VISIBLE);

                    clickCount ++;

                }
            }
        });

        nextBtn1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if (clickCount == 1) {
                    img5.setEnabled(false);
                    img6.setEnabled(false);
                    img7.setEnabled(false);
                    img8.setEnabled(false);
                    img5.setVisibility(View.GONE);
                    img6.setVisibility(View.GONE);
                    img7.setVisibility(View.GONE);
                    img8.setVisibility(View.GONE);

                    img9.setEnabled(true);
                    img10.setEnabled(true);
                    img11.setEnabled(true);
                    img12.setEnabled(true);
                    img9.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);

                    nextBtn1.setEnabled(false);
                    nextBtn1.setVisibility(View.GONE);

                    nextBtn2.setEnabled(true);
                    nextBtn2.setVisibility(View.VISIBLE);
                    clickCount++;
                }
            }
        });

        nextBtn2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if (clickCount == 2) {
                    img9.setEnabled(false);
                    img10.setEnabled(false);
                    img11.setEnabled(false);
                    img12.setEnabled(false);
                    img9.setVisibility(View.GONE);
                    img10.setVisibility(View.GONE);
                    img11.setVisibility(View.GONE);
                    img12.setVisibility(View.GONE);

                    img13.setEnabled(true);
                    img14.setEnabled(true);
                    img15.setEnabled(true);
                    img16.setEnabled(true);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);

                    nextBtn2.setEnabled(false);
                    nextBtn2.setVisibility(View.GONE);

                    nextBtn3.setEnabled(true);
                    nextBtn3.setVisibility(View.VISIBLE);
                    clickCount++;
                }
            }
        });
        nextBtn3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if (clickCount == 3) {
                    img13.setEnabled(false);
                    img14.setEnabled(false);
                    img15.setEnabled(false);
                    img16.setEnabled(false);
                    img13.setVisibility(View.GONE);
                    img14.setVisibility(View.GONE);
                    img15.setVisibility(View.GONE);
                    img16.setVisibility(View.GONE);

                    img17.setEnabled(true);
                    img18.setEnabled(true);
                    img19.setEnabled(true);
                    img20.setEnabled(true);
                    img17.setVisibility(View.VISIBLE);
                    img18.setVisibility(View.VISIBLE);
                    img19.setVisibility(View.VISIBLE);
                    img20.setVisibility(View.VISIBLE);

                    nextBtn3.setEnabled(false);
                    nextBtn3.setVisibility(View.GONE);

                    nextBtn4.setEnabled(true);
                    nextBtn4.setVisibility(View.VISIBLE);

                    clickCount++;
                }
            }
        });
        nextBtn4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if (clickCount == 4) {
                    img17.setEnabled(false);
                    img18.setEnabled(false);
                    img19.setEnabled(false);
                    img20.setEnabled(false);
                    img17.setVisibility(View.GONE);
                    img18.setVisibility(View.GONE);
                    img19.setVisibility(View.GONE);
                    img20.setVisibility(View.GONE);

                    img21.setEnabled(true);
                    img22.setEnabled(true);
                    img23.setEnabled(true);
                    img24.setEnabled(true);
                    img21.setVisibility(View.VISIBLE);
                    img22.setVisibility(View.VISIBLE);
                    img23.setVisibility(View.VISIBLE);
                    img24.setVisibility(View.VISIBLE);

                    nextBtn4.setEnabled(false);
                    nextBtn4.setVisibility(View.GONE);

                    nextBtn5.setEnabled(true);
                    nextBtn5.setVisibility(View.VISIBLE);

                    clickCount++;
                }
            }
        });
        nextBtn5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                if (clickCount == 5) {
                    img21.setEnabled(false);
                    img22.setEnabled(false);
                    img23.setEnabled(false);
                    img24.setEnabled(false);
                    img21.setVisibility(View.GONE);
                    img22.setVisibility(View.GONE);
                    img23.setVisibility(View.GONE);
                    img24.setVisibility(View.GONE);

                    img25.setEnabled(true);
                    img26.setEnabled(true);
                    img27.setEnabled(true);
                    img28.setEnabled(true);
                    img25.setVisibility(View.VISIBLE);
                    img26.setVisibility(View.VISIBLE);
                    img27.setVisibility(View.VISIBLE);
                    img28.setVisibility(View.VISIBLE);

                    nextBtn5.setEnabled(false);
                    nextBtn5.setVisibility(View.GONE);

                    clickCount++;
                }
            }
        });

        backbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(clickCount == 0){
                    finish();
                }
                else if(clickCount == 1){
                    img1.setEnabled(true);
                    img2.setEnabled(true);
                    img3.setEnabled(true);
                    img4.setEnabled(true);
                    img1.setVisibility(View.VISIBLE);
                    img2.setVisibility(View.VISIBLE);
                    img3.setVisibility(View.VISIBLE);
                    img4.setVisibility(View.VISIBLE);

                    img5.setEnabled(false);
                    img6.setEnabled(false);
                    img7.setEnabled(false);
                    img8.setEnabled(false);
                    img5.setVisibility(View.GONE);
                    img6.setVisibility(View.GONE);
                    img7.setVisibility(View.GONE);
                    img8.setVisibility(View.GONE);

                    nextBtn1.setEnabled(false);
                    nextBtn1.setVisibility(View.GONE);

                    nextBtn.setEnabled(true);
                    nextBtn.setVisibility(View.VISIBLE);

                    clickCount--;

                }else if(clickCount == 2){
                    img5.setEnabled(true);
                    img6.setEnabled(true);
                    img7.setEnabled(true);
                    img8.setEnabled(true);
                    img5.setVisibility(View.VISIBLE);
                    img6.setVisibility(View.VISIBLE);
                    img7.setVisibility(View.VISIBLE);
                    img8.setVisibility(View.VISIBLE);

                    img9.setEnabled(false);
                    img10.setEnabled(false);
                    img11.setEnabled(false);
                    img12.setEnabled(false);
                    img9.setVisibility(View.GONE);
                    img10.setVisibility(View.GONE);
                    img11.setVisibility(View.GONE);
                    img12.setVisibility(View.GONE);

                    nextBtn2.setEnabled(false);
                    nextBtn2.setVisibility(View.GONE);

                    nextBtn1.setEnabled(true);
                    nextBtn1.setVisibility(View.VISIBLE);
                    clickCount--;
                }else if(clickCount == 3){
                    img9.setEnabled(true);
                    img10.setEnabled(true);
                    img11.setEnabled(true);
                    img12.setEnabled(true);
                    img9.setVisibility(View.VISIBLE);
                    img10.setVisibility(View.VISIBLE);
                    img11.setVisibility(View.VISIBLE);
                    img12.setVisibility(View.VISIBLE);

                    img13.setEnabled(false);
                    img14.setEnabled(false);
                    img15.setEnabled(false);
                    img16.setEnabled(false);
                    img13.setVisibility(View.GONE);
                    img14.setVisibility(View.GONE);
                    img15.setVisibility(View.GONE);
                    img16.setVisibility(View.GONE);

                    nextBtn3.setEnabled(false);
                    nextBtn3.setVisibility(View.GONE);

                    nextBtn2.setEnabled(true);
                    nextBtn2.setVisibility(View.VISIBLE);
                    clickCount--;
                }else if(clickCount == 4){
                    img13.setEnabled(true);
                    img14.setEnabled(true);
                    img15.setEnabled(true);
                    img16.setEnabled(true);
                    img13.setVisibility(View.VISIBLE);
                    img14.setVisibility(View.VISIBLE);
                    img15.setVisibility(View.VISIBLE);
                    img16.setVisibility(View.VISIBLE);

                    img17.setEnabled(false);
                    img18.setEnabled(false);
                    img19.setEnabled(false);
                    img20.setEnabled(false);
                    img17.setVisibility(View.GONE);
                    img18.setVisibility(View.GONE);
                    img19.setVisibility(View.GONE);
                    img20.setVisibility(View.GONE);

                    nextBtn4.setEnabled(false);
                    nextBtn4.setVisibility(View.GONE);

                    nextBtn3.setEnabled(true);
                    nextBtn3.setVisibility(View.VISIBLE);

                    clickCount--;
                }else if(clickCount == 5){
                    img17.setEnabled(true);
                    img18.setEnabled(true);
                    img19.setEnabled(true);
                    img20.setEnabled(true);
                    img17.setVisibility(View.VISIBLE);
                    img18.setVisibility(View.VISIBLE);
                    img19.setVisibility(View.VISIBLE);
                    img20.setVisibility(View.VISIBLE);

                    img21.setEnabled(false);
                    img22.setEnabled(false);
                    img23.setEnabled(false);
                    img24.setEnabled(false);
                    img21.setVisibility(View.GONE);
                    img22.setVisibility(View.GONE);
                    img23.setVisibility(View.GONE);
                    img24.setVisibility(View.GONE);

                    nextBtn5.setEnabled(false);
                    nextBtn5.setVisibility(View.GONE);

                    nextBtn4.setEnabled(true);
                    nextBtn4.setVisibility(View.VISIBLE);

                    clickCount--;
                }else if(clickCount == 6){
                    img21.setEnabled(true);
                    img22.setEnabled(true);
                    img23.setEnabled(true);
                    img24.setEnabled(true);
                    img21.setVisibility(View.VISIBLE);
                    img22.setVisibility(View.VISIBLE);
                    img23.setVisibility(View.VISIBLE);
                    img24.setVisibility(View.VISIBLE);

                    img25.setEnabled(false);
                    img26.setEnabled(false);
                    img27.setEnabled(false);
                    img28.setEnabled(false);
                    img25.setVisibility(View.GONE);
                    img26.setVisibility(View.GONE);
                    img27.setVisibility(View.GONE);
                    img28.setVisibility(View.GONE);

                    nextBtn5.setEnabled(true);
                    nextBtn5.setVisibility(View.VISIBLE);

                    clickCount--;
                }
            }
        });


    }
}