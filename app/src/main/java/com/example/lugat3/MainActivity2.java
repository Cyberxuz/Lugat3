package com.example.lugat3;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import it.xabaras.android.recyclerview.swipedecorator.RecyclerViewSwipeDecorator;

public class MainActivity2 extends AppCompatActivity {

    FloatingActionButton floatingActionButton;

    RecyclerView recyclerView;
    MyAdapter myAdapter;

    List<Game> games;

    EditText editTextsearch;

    Game game;

    Game farqiYoqforadddatabase;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Window window=getWindow();
        // window.setStatusBarColor(Color.BLACK);
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);


        floatingActionButton = findViewById(R.id.buttonaction);
        recyclerView = findViewById(R.id.recyclerview);

        editTextsearch = findViewById(R.id.edittextsearch);

        imageView=findViewById(R.id.imageviewround);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            startActivity(new Intent(com.example.lugat3.MainActivity2.this,MainActivity3Test.class));

            }
        });

        editTextsearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
            filters(s.toString());
            }
        });

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                View view = LayoutInflater.from(com.example.lugat3.MainActivity2.this).inflate(R.layout.additem, null);
                Dialog dialog=new Dialog(com.example.lugat3.MainActivity2.this);
                dialog.setContentView(view);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);

                EditText editTextuzb = view.findViewById(R.id.edittextuzb);
                EditText editTexteng = view.findViewById(R.id.edittexteng);
                EditText editTextrus = view.findViewById(R.id.edittextrus);
                Button button=view.findViewById(R.id.buttonadd);

//                button.setOnClickListener(new View.OnClickListener() {
//                    @Override
//                    public void onClick(View v) {
//
//                    Game game = new Game();
//
//                    game.setUzbek(editTextuzb.getText().toString());
//                    game.setEglish(editTexteng.getText().toString());
//                    game.setRuski(editTextrus.getText().toString());
//                    game.save();
////
//                    readfromdatabase();
//
//                    Toast.makeText(com.example.lugat3.MainActivity2.this, "Added", Toast.LENGTH_SHORT).show();
//                    readfromdatabase();
//                    dialog.cancel();
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Game game =new Game();

                        game.setUzbek(editTextuzb.getText().toString());
                        game.setEglish(editTexteng.getText().toString());
                        game.setRuski(editTextrus.getText().toString());
                        game.save();

                        readfromdatabase();
                        Toast.makeText(MainActivity2.this, "Added", Toast.LENGTH_SHORT).show();
                        readfromdatabase();
                        dialog.cancel();

                    }
                });


                dialog.create();
                dialog.show();
                readfromdatabase();




//
            }
        });
        readfromdatabase();

        if (games.size()==0){
            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Latitude");
//            game.setUzbek("Kenglik");
//            game.setRuski("Rustili");
//            game.save();
//            //endgame...............
//            game = new Game();
//            game.setEglish("Mariner");
//            game.setUzbek("Dengizchi");
//            game.save();
//            game = new Game();
//            game.setEglish("Multitude");
//            game.setUzbek("Juda ko`p");
//            game.save();
//            game = new Game();
//            game.setEglish("Nuisanse");
//            game.setUzbek("Noqulaylik");
//            game.save();
//            game = new Game();
//            game.setEglish("Permanence");
//            game.setUzbek("Doimiylik");
//            game.save();
//            game = new Game();
//            game.setEglish("Revolve");
//            game.setUzbek("Aylanmoq");
//            game.save();
//            game = new Game();
//            game.setEglish("Stranded");
//            game.setUzbek("Qamalgan");
//            game.save();
//            game = new Game();
//            game.setEglish("Volatile");
//            game.setUzbek("Uchuvchan");
//            game.save();
//            game = new Game();
//            game.setEglish("Arduous");
//            game.setUzbek("Qiyin");
//            game.save();
//            game = new Game();
//            game.setEglish("Attain");
//            game.setUzbek("Erishmoq");
//            game.save();
//            game = new Game();
//            game.setEglish("Coexist");
//            game.setUzbek("Birgalikda yashash");
//            game.save();
//
//
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Dubious");
//            game.setUzbek("Shubhali");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Endeavor");
//            game.setUzbek("Urinish");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Engrave");
//            game.setUzbek("O`yma");
//            game.save();
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Excavate");
//            game.setUzbek("Qazish");
//            game.save();
//            //endgame...............
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Jagged");
//            game.setUzbek("Jag`li");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Locale");
//            game.setUzbek("Mahalliy");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Mold");
//            game.setUzbek("Qolip");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Outright");
//            game.setUzbek("Aniq");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Periphery");
//            game.setUzbek("Atrof-muhit");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Plaster");
//            game.setUzbek("Gips");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Shovel");
//            game.setUzbek("Belkurak");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Skeletal");
//            game.setUzbek("Skelet");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Terrestrial");
//            game.setUzbek("Yerdagi");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Vicious");
//            game.setUzbek("Shafqatsiz");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Absurd");
//            game.setUzbek("Bemani");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Attire");
//            game.setUzbek("Kiyim");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Craze");
//            game.setUzbek("Aqldan ozmoq");
//            game.save();
//            //endgame...............
//            //buyerdan boshlab...........
//            game = new Game();
//            game.setEglish("Enlarge");
//            game.setUzbek("Kattalashtirish");
//            game.save();
//            //endgame...............
//            game = new Game();
//            game.setEglish("Improsive");
//            game.setUzbek("Tasirlanmaydigan");
//            game.save();
//            //sh uyerdaannn
//            //endgame...............
//            game = new Game();
//            game.setEglish("Delight");
//            game.setUzbek("zavqlanmoq");
//            game.save();
//            //sh uyerdaannn
//            //endgame...............
//            game = new Game();
//            game.setEglish("Destination");
//            game.setUzbek("maqsad");
//            game.save();
//            //sh uyerdaannn
//
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Dictate");
//            game.setUzbek("aytmoq");
//            game.save();
//            //sh uyerdaannn
//            //endgame...............
//            game = new Game();
//            game.setEglish("Edge");
//            game.setUzbek("Chekka");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Path");
//            game.setUzbek("yo`l");
//            game.save();
//            //sh uyerdaannn
//
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Resort");
//            game.setUzbek("Kurort");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Shadow");
//            game.setUzbek("Soya");
//            game.save();
//            //sh uyerdaannn
//            //endgame...............
//            game = new Game();
//            game.setEglish("Succed");
//            game.setUzbek("Muvaffaqqiyat");
//            game.save();
//            //sh uyerdaannn
//            //endgame...............
//            game = new Game();
//            game.setEglish("Suspect");
//            game.setUzbek("Shubhali");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Valley");
//            game.setUzbek("Vodiy");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Admire");
//            game.setUzbek("Qoyil");
//            game.save();
//            //sh uyerdaannn
//            //endgame...............
//            game = new Game();
//            game.setEglish("Invoker");
//            game.setUzbek("Ibodat qiluvchi");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Aid");
//            game.setUzbek("Yordam");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Attemp");
//            game.setUzbek("Urinish");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Authority");
//            game.setUzbek("Hokimyat");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Capital");
//            game.setUzbek("Poytaxt");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Cooperate");
//            game.setUzbek("Hamkorlik");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Defend");
//            game.setUzbek("Himoya");
//            game.save();
//            //sh uyerdaannn
//            //endgame...............
//            game = new Game();
//            game.setEglish("Destruction");
//            game.setUzbek("Yo`q qilish");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Disorder");
//            game.setUzbek("Tartibsizlik");
//            game.save();
//            //sh uyerdaannn
//            //endgame...............
//            game = new Game();
//            game.setEglish("Division");
//            game.setUzbek("Bo`linish");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Enable");
//            game.setUzbek("Yoqish");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Frustrate");
//            game.setUzbek("Xafa qilish");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Govern");
//            game.setUzbek("Boshqarmoq");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Relieve");
//            game.setUzbek("Yengillashtrish");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Reputation");
//            game.setUzbek("Obro'");
//            game.save();
//            //sh uyerdaannn
//            //endgame...............
//            game = new Game();
//            game.setEglish("Royal");
//            game.setUzbek("Qirollik");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Slave");
//            game.setUzbek("qul");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Struggle");
//            game.setUzbek("Kurash");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Stupid");
//            game.setUzbek("Ahmoq");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Citizen");
//            game.setUzbek("Fuqaro");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Council");
//            game.setUzbek("Kengash");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Declare");
//            game.setUzbek("Elon qilish");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Enormous");
//            game.setUzbek("Ulkan");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Fog");
//            game.setUzbek("Tuman");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Giant");
//            game.setUzbek("Ulkan");
//            game.save();
//            //sh uyerdaannn
//
//            //endgame...............
//            game = new Game();
//            game.setEglish("Impression");
//            game.setUzbek("Tassurot");
//            game.save();
//            //sh uyerdaannn
//            //endgame...............
//            game = new Game();
//            game.setEglish("Income");
//            game.setUzbek("Daromad");
//            game.save();
//            //sh uyerdaannn
//            game = new Game();
//            game.setEglish("Mad");
//            game.setUzbek("Telba");
//            game.save();
//            //sh uyerdaannn
//            game = new Game();
//            game.setEglish("Ought");
//            game.setUzbek("Kerak");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Resist");
//            game.setUzbek("Qarshilik");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Reveal");
//            game.setUzbek("Ochmoq");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Rid");
//            game.setUzbek("Qutilish");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Sword");
//            game.setUzbek("Qilich");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Tale");
//            game.setUzbek("Ertak");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Trap");
//            game.setUzbek("Tuzoq");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Trial");
//            game.setUzbek("Sinov");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Tiny");
//            game.setUzbek("Jajji");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Violent");
//            game.setUzbek("Zo`ravon");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Blame");
//            game.setUzbek("Ayblash");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Forecast");
//            game.setUzbek("Bashorat");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Gentle");
//            game.setUzbek("Yumshoq");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Row");
//            game.setUzbek("Qator");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Shelf");
//            game.setUzbek("Javon");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Spite");
//            game.setUzbek("Nafrat");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Wet");
//            game.setUzbek("nam");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Abuse");
//            game.setUzbek("Suiiste`mol");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Bake");
//            game.setUzbek("Pishirmoq");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Candle");
//            game.setUzbek("Sham");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Debt");
//            game.setUzbek("Qarz");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Fault");
//            game.setUzbek("Xato");
//            game.save();
//            //sh uyerdaannn
//
//            game = new Game();
//            game.setEglish("Fund");
//            game.setUzbek("Fond");
//            game.save();


            readfromdatabase();
        }


        ItemTouchHelper itemTouchHelper=new ItemTouchHelper(simpleCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }

    public void readfromdatabase() {

        games = Game.listAll(Game.class);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        Collections.reverse(games);
        myAdapter = new MyAdapter(com.example.lugat3.MainActivity2.this, (ArrayList<Game>) games);
        recyclerView.setAdapter(myAdapter);


    }

    ItemTouchHelper.SimpleCallback simpleCallback=new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT|ItemTouchHelper.END) {
        @Override
        public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
            return true;
        }

        @Override
        public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
            switch (direction){
                case ItemTouchHelper.LEFT:
                    YoYo.with(Techniques.Tada)
                            .duration(2000)
                            .repeat(0)
                            .playOn(viewHolder.itemView);
                    YoYo.with(Techniques.ZoomOutLeft)
                            .duration(2500)
                            .repeat(0)
                            .playOn(viewHolder.itemView);


                    Handler handler=new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            int position =viewHolder.getAdapterPosition();
                            Game farqiYoqdelete= Game.findById(Game.class, games.get(position).getId());
                            farqiYoqdelete.delete();
                            YoYo.with(Techniques.Tada)
                                    .duration(1400)
                                    .repeat(1)
                                    .playOn(viewHolder.itemView);

                          //  readfromdatabase();
                            myAdapter.notifyDataSetChanged();

                            //  Toast.makeText(MainActivity2.this, farqiYoqs.get(direction).getId().toString(), Toast.LENGTH_SHORT).show();


                            readfromdatabase();
                        }
                    },1500);
//                  myAdapter.notifyDataSetChanged();
//                    Toast.makeText(MainActivity2.this, "ishliidi axir", Toast.LENGTH_SHORT).show();
//                    myAdapter.notifyDataSetChanged();
                    break;

                case ItemTouchHelper.RIGHT:
                   // myAdapter.notifyDataSetChanged();
                   // Toast.makeText(MainActivity2.this, myAdapter.getItemId(direction)+"", Toast.LENGTH_SHORT).show();
                    myAdapter.notifyDataSetChanged();

                    break;

            }
        }

        @Override
        public void onChildDraw(@NonNull Canvas c, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, float dX, float dY, int actionState, boolean isCurrentlyActive) {
            super.onChildDraw(c, recyclerView, viewHolder, dX, dY, actionState, isCurrentlyActive);
            new RecyclerViewSwipeDecorator.Builder(c,recyclerView,viewHolder,dX,dY,actionState,isCurrentlyActive)
                    .addSwipeLeftBackgroundColor(Color.WHITE)
                    .addSwipeLeftActionIcon(R.drawable.ic_baseline_delete_24)

                    .addSwipeRightActionIcon(R.drawable.ic_baseline_archive_24)
                    .addSwipeRightBackgroundColor(Color.WHITE)

                    .create()
                    .decorate();
        }
    };

    public void filters(String text) {
        ArrayList<Game> gameArrayListqidiruv = new ArrayList<>();
        for (Game item : games) {
            if (item.getUzbek().toLowerCase().contains(text.toLowerCase()) || item.getEglish().toLowerCase().contains(text.toLowerCase())) {
                gameArrayListqidiruv.add(item);
            }
            myAdapter.qidiruvfunksiya(gameArrayListqidiruv);
        }

    }
}