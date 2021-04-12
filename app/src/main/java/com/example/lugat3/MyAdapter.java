package com.example.lugat3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


    Context context;
    ArrayList<Game> gameArrayList;

    public MyAdapter(Context context, ArrayList<Game> gameArrayList) {
        this.context = context;
        this.gameArrayList = gameArrayList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.enguzbitemlayout, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Game game = gameArrayList.get(position);
        holder.textView.setText(game.getUzbek());
        holder.textView2.setText(game.getEglish());
        YoYo.with(Techniques.ZoomIn)
                .duration(300)
                .repeat(0)
                .playOn(holder.itemView);
    }

    @Override
    public int getItemCount() {
        return gameArrayList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView textView, textView2, textView3;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.textviewuzb);
            textView2 = itemView.findViewById(R.id.textvieweng);
            textView3 = itemView.findViewById(R.id.textviewrus);
        }
    }

    public void qidiruvfunksiya(ArrayList<Game> gameArrayListqidiruv) {
        gameArrayList = gameArrayListqidiruv;
        notifyDataSetChanged();
    }
}
