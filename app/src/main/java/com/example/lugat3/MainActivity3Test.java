package com.example.lugat3;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.airbnb.lottie.LottieAnimationView;
import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity3Test extends AppCompatActivity {

    ArrayList<Game> arrayList;
    List<Game> gameList;
    TextView textView;
    Button button1,button2,button3,button4;
    CardView cardView1,cardView2,cardView3,cardView4;
    int a=0;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity3_test);
        arrayList=new ArrayList<>();

        lottieAnimationView=findViewById(R.id.animation_view);
        Window window=getWindow();
        // window.setStatusBarColor(Color.BLACK);
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        textView=findViewById(R.id.textviewtesttext);
        button1=findViewById(R.id.buttontest1);
        button2=findViewById(R.id.buttontest2);
        button3=findViewById(R.id.buttontest3);
        button4=findViewById(R.id.buttontest4);
        cardView1=findViewById(R.id.cardview1);
        cardView2=findViewById(R.id.cardview12);
        cardView3=findViewById(R.id.cardview13);
        cardView4=findViewById(R.id.cardview14);
        readfromdatabase();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a==0){
                    Log.d("Pr","Tog`ri");
                    button1.setBackground(getDrawable(R.drawable.btnbackgroundgreen));
                    button1.setTextColor(Color.WHITE);
                    YoYo.with(Techniques.RubberBand)
                            .duration(1400)
                            .repeat(1)
                            .playOn(cardView1);

                    lottieAnimationView.setAnimation(R.raw.donnewithstart);
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.loop(false);

                    Handler handler=new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            readfromdatabase();
                        }
                    },2000);
                }else {
                    lottieAnimationView.setAnimation(R.raw.wrongg);
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.loop(false);
                    button1.setBackground(getDrawable(R.drawable.btnbackgroundreddd));
//                    YoYo.with(Techniques.Tada)
//                            .duration(1400)
//                            .repeat(1)
//                            .playOn(button1);
                    YoYo.with(Techniques.Tada)
                            .duration(1400)
                            .repeat(1)
                            .playOn(cardView1);
                    button1.setTextColor(Color.WHITE);

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a==1){
                    lottieAnimationView.setAnimation(R.raw.donnewithstart);
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.loop(false);
                    Log.d("Pr","Tog`ri");
                    button2.setBackground(getDrawable(R.drawable.btnbackgroundgreen));
                    button2.setTextColor(Color.WHITE);
                    YoYo.with(Techniques.RubberBand)
                            .duration(1400)
                            .repeat(1)
                            .playOn(cardView2);
                    Handler handler=new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            readfromdatabase();
                        }
                    },2000);
                }else {
                    lottieAnimationView.setAnimation(R.raw.wrongg);
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.loop(false);
                    button2.setBackground(getDrawable(R.drawable.btnbackgroundreddd));
                    YoYo.with(Techniques.Tada)
                            .duration(1400)
                            .repeat(1)
                            .playOn(cardView2);
                    button2.setTextColor(Color.WHITE);
                }

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a==2){
                    lottieAnimationView.setAnimation(R.raw.donnewithstart);
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.loop(false);
                    Log.d("Pr","Tog`ri");
                    button3.setBackground(getDrawable(R.drawable.btnbackgroundgreen));
                    button3.setTextColor(Color.WHITE);
                    YoYo.with(Techniques.RubberBand)
                            .duration(1400)
                            .repeat(1)
                            .playOn(cardView3);
                    Handler handler=new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            readfromdatabase();
                        }
                    },2000);
                }else {
                    lottieAnimationView.setAnimation(R.raw.wrongg);
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.loop(false);
                    button3.setBackground(getDrawable(R.drawable.btnbackgroundreddd));
                    YoYo.with(Techniques.Tada)
                            .duration(1400)
                            .repeat(1)
                            .playOn(cardView3);
                    button3.setTextColor(Color.WHITE);
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a==3){
                    lottieAnimationView.setAnimation(R.raw.donnewithstart);
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.loop(false);
                    Log.d("Pr","Tog`ri");
                    button4.setBackground(getDrawable(R.drawable.btnbackgroundgreen));
                    button4.setTextColor(Color.WHITE);
                    YoYo.with(Techniques.RubberBand)
                            .duration(1400)
                            .repeat(1)
                            .playOn(cardView4);
                    Handler handler=new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            readfromdatabase();
                        }
                    },2000);
                }else {
                    lottieAnimationView.setAnimation(R.raw.wrongg);
                    lottieAnimationView.playAnimation();
                    lottieAnimationView.loop(false);
                    button4.setBackground(getDrawable(R.drawable.btnbackgroundreddd));
                    YoYo.with(Techniques.Tada)
                            .duration(1400)
                            .repeat(1)
                            .playOn(cardView4);
                    button4.setTextColor(Color.WHITE);
                }
            }
        });

    }


    public void readfromdatabase(){
        if (a==0){
            lottieAnimationView.setAnimation(R.raw.spaceship);
            lottieAnimationView.playAnimation();
            lottieAnimationView.loop(true);
        }
        if (a==1){
            lottieAnimationView.setAnimation(R.raw.astronaut);
            lottieAnimationView.playAnimation();
            lottieAnimationView.loop(true);
        }
        if (a==2){
            lottieAnimationView.setAnimation(R.raw.spacemann);
            lottieAnimationView.playAnimation();
            lottieAnimationView.loop(true);
        }
        if (a==3){
            lottieAnimationView.setAnimation(R.raw.spaceearth);
            lottieAnimationView.playAnimation();
            lottieAnimationView.loop(true);
        }
       button1.setBackground(getDrawable(R.drawable.btntestbackground));
        button1.setTextColor(Color.BLACK);

        button2.setBackground(getDrawable(R.drawable.btntestbackground));
        button2.setTextColor(Color.BLACK);

        button3.setBackground(getDrawable(R.drawable.btntestbackground));
        button3.setTextColor(Color.BLACK);

        button4.setBackground(getDrawable(R.drawable.btntestbackground));
        button4.setTextColor(Color.BLACK);

        gameList = Game.listAll(Game.class);
        Collections.shuffle(gameList);
        a=new Random().nextInt(4);
        if (gameList.size()>4){
            button1.setText(gameList.get(0).getUzbek());
            button2.setText(gameList.get(1).getUzbek());
            button3.setText(gameList.get(2).getUzbek());
            button4.setText(gameList.get(3).getUzbek());
            textView.setText(gameList.get(a).getEglish());

        }
    }
}