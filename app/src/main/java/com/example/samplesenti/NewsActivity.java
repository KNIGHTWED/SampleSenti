package com.example.samplesenti;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.textfield.TextInputEditText;

public class NewsActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private String[] myDataset = {"1","2"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        mRecyclerView = findViewById(R.id.recycler_view);

        // 이러한 세팅을 사용해라 (고정된 사이즈 등등)
        mRecyclerView.setHasFixedSize(true);

        // 리니어 레이아웃 메니저를 사용해라
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // 어댑터를 특정하라
        mAdapter = new Adapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

    }
}