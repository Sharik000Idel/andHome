package com.example.idelproject_list;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.idelproject_list.CastAdapter.CastRacyclerAdapter;
import com.example.idelproject_list.moduls.Product;

import java.util.ArrayList;
import java.util.Objects;

public class CatalogActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    static CastRacyclerAdapter adapter;
    Button b_add;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalog);

        recyclerView = findViewById(R.id.recyclerView);
        b_add = findViewById(R.id.button_add_k);

        Bundle bundle = getIntent().getExtras();


        ArrayList<Product> products = new ArrayList<>();

        if (bundle != null) {

            Object object_list = bundle.get("Catalog_list");
            products =  (ArrayList<Product>) object_list;
        }
        adapter = new CastRacyclerAdapter();
        adapter.setData(products);

        LinearLayoutManager lln = new LinearLayoutManager(this);
        lln.setOrientation( LinearLayoutManager.VERTICAL );
        recyclerView.setLayoutManager(lln);
        recyclerView.setAdapter(adapter);

        ArrayList<Product> finalProducts = products;
        b_add.setOnClickListener(view -> {

            Intent intent1 = new Intent( this , Add_New_Prod.class);
            System.out.println( " dddd "+ finalProducts.size());
            intent1.putExtra( "Catalog_list" , finalProducts);
            startActivity(intent1);


        });

    }

    public ArrayList<String> colors_added (){
        ArrayList<String> colors= new ArrayList<>();
        colors.add("Grey");
        colors.add("Black");
        colors.add("Yellow");
        return colors;
    }

    public ArrayList<String> size_added (){
        ArrayList<String> colors= new ArrayList<>();
        colors.add("Grey");
        colors.add("Black");
        colors.add("Yellow");
        return colors;
    }
}