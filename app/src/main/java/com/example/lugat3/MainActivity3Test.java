package com.example.lugat3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

import java.util.ArrayList;
import java.util.List;

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

    }
}