package com.example.idelproject_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button b1, b2,b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= findViewById(R.id.button1);
        b2= findViewById(R.id.button2);

        b4= findViewById(R.id.button4);

        b1.setOnClickListener(v -> {
            Intent intent = new Intent(this , CatalogActivity.class);
            startActivity(intent);
        });



        b2.setOnClickListener(v ->{

            Intent intent = new Intent(this , activity_list_view_with_adapter.class);
            startActivity(intent);
        });

        b4.setOnClickListener(v -> {
            Intent intent = new Intent(this , activity_list_view_with_adapter.class);
            startActivity(intent);

        });
    }
}