package com.example.listsproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickList(View view) {
        Intent intent = new Intent(this, ListViewWithoutAdapterActivity.class);
        startActivity(intent);
    }

    public void onClickListAdapter(View view) {
        Intent intent = new Intent(this, ListViewWithAdapterActivity.class);
        startActivity(intent);
    }

    public void onClickSpinner(View view) {
        Intent intent = new Intent(this, SpinnerActivity.class);
        startActivity(intent);
    }

    public void onClickRecyclerView(View view) {
        Intent intent = new Intent(this, RecyclerViewActivity.class);
        startActivity(intent);
    }
}