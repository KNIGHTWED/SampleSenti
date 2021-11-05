//package com.example.samplesenti;
//
//import android.content.Context;
//import android.content.Intent;
//import android.os.Bundle;
//import android.text.Editable;
//import android.text.TextWatcher;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.RelativeLayout;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//import androidx.recyclerview.widget.RecyclerView;
//
//import com.google.android.material.textfield.TextInputEditText;
//
//public class ViewHolder extends RecyclerView.ViewHolder {
//    public TextView textView;
//    public Button button;
//    ViewHolder(Context context, View itemView) {
//        super(itemView);
//
//        textView = itemView.findViewById(R.id.textView);
//        button = itemView.findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override public void onClick(View v) {
//                String strText = textView.getText().toString();
//                Toast.makeText(context, strText, Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}