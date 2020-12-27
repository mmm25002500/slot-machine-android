package com.tershi.slotmachine;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //宣告物件
    Button btnPlay;
    ImageView image1 ,image2 ,image3;
    TextView result;

    int [] resource = new int[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //getSupportActionBar().setDisplayShowTitleEnabled(false);
        //將標題列隱藏
        getSupportActionBar().setTitle("老虎餃子777機");
        //設定標題

        //將物件初始化,Activity開啟就載入物件
        btnPlay = (Button)(findViewById(R.id.btnPlay));
        image1 = (ImageView)(findViewById(R.id.image1));
        image2 = (ImageView)(findViewById(R.id.image2));
        image3 = (ImageView)(findViewById(R.id.image3));
        result = (TextView)(findViewById(R.id.result));

        image1.setImageResource(R.drawable.apple);
        image2.setImageResource(R.drawable.banana);
        image3.setImageResource(R.drawable.watermelon);
        //將物件的id給載入到原始物件中
        //將每個圖片放入陣列中
        resource[0] = R.drawable.apple;
        resource[1] = R.drawable.banana;
        resource[2] = R.drawable.watermelon;

        result.setText("我們一起玩遊戲吧！");
    }
    public void onClickPlay(View view){ //當按鈕被按下
        int r1 = (int)(Math.random()*3);
        int r2 = (int)(Math.random()*3);
        int r3 = (int)(Math.random()*3);

        image1.setImageResource(resource[r1]);
        image2.setImageResource(resource[r2]);
        image3.setImageResource(resource[r3]);
        if (resource[r1] == resource[r2] && resource[r2] == resource[r3]){
            result.setTextColor(-65536);
            if (resource[r1] == R.drawable.apple){
                result.setText("You Win!!!!!!!!!\nYou got Apples");
            } else if (resource[r1] == R.drawable.banana){
                result.setText("You Win!!!!!!!!!\nYou got Bananas");
            } else if (resource[r1] == R.drawable.watermelon){
                result.setText("You Win!!!!!!!!!\nYou got Watermelons");
            }
        } else{
            result.setText("You Lose");
            result.setTextColor(-16777216);
        }
    }
}