package com.example.lugat3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity3 extends AppCompatActivity {

    FloatingActionButton floatingActionButton1;
    Game game;
    Button button;
    List<Game> games;
    RecyclerView recyclerViewadd;
    MyAdapter myAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        floatingActionButton1=findViewById(R.id.bazaadd);
        recyclerViewadd=findViewById(R.id.recyclerviewadd);
        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View view = LayoutInflater.from(com.example.lugat3.MainActivity3.this).inflate(R.layout.additem, null);
                Dialog dialog=new Dialog(com.example.lugat3.MainActivity3.this);
                dialog.setContentView(view);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                EditText editTextuzb = view.findViewById(R.id.edittextuzb);
                EditText editTexteng = view.findViewById(R.id.edittexteng);
                EditText editTextrus = view.findViewById(R.id.edittextrus);
                Button button=view.findViewById(R.id.buttonadd);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Game game =new Game();

                        game.setUzbek(editTextuzb.getText().toString());
                        game.setEglish(editTexteng.getText().toString());
                        game.setRuski(editTextrus.getText().toString());
                        game.save();

                        readfromdatabase();
                        Toast.makeText(MainActivity3.this, "Added", Toast.LENGTH_SHORT).show();
                        readfromdatabase();
                        dialog.cancel();

                    }
                });

                dialog.create();
                dialog.show();
                readfromdatabase();

            }
        });



    }

    public void readfromdatabase() {

        games = Game.listAll(Game.class);
        recyclerViewadd.setHasFixedSize(true);
        recyclerViewadd.setLayoutManager(new LinearLayoutManager(this));
        Collections.reverse(games);
        myAdapter = new MyAdapter(com.example.lugat3.MainActivity3.this, (ArrayList<Game>) games);
        recyclerViewadd.setAdapter(myAdapter);


    }
}