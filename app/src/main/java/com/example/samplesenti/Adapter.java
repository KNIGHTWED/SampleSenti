package com.example.samplesenti;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {
    private ArrayList<String> arrayList;
    private String[] mDataset;


//    public Adapter() {
//        arrayList = new ArrayList<>();
//    }

//    Your API key is: 9b9fb4c643194220a435caa4c847bc03

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView TextView_title;
        public TextView TextView_content;
        public ImageView ImageView_title;
        public MyViewHolder(View v) {
            super(v);
            TextView_title = v.findViewById(R.id.TextView_title);
            TextView_content = v.findViewById(R.id.TextView_content);
            ImageView_title = v.findViewById(R.id.ImageView_title);
        }
    }

    public Adapter(String[] myDataset){
        mDataset = myDataset;
    }

    @Override public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LinearLayout v = (LinearLayout) LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);

        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.TextView_title.setText(mDataset[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }

    // 데이터를 입력
//    public void setArrayData(String strData) {
//        arrayList.add(strData);
//    }

}