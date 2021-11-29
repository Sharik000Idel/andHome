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
        products.add(  new Product( "Кепка"    , 20.2  , "Black" , size_added(), R.drawable.idel_project_item1 , "Супер кепка"   ));
        products.add(  new Product( "Футболка" , 120.2 , "Black" , size_added(), R.drawable.idel_project_item1 , "Супер Футболка"));
        products.add(  new Product( "Майка"    , 100.2 , "Black" , size_added(), R.drawable.idel_project_item1 , "Супер Майка"   ));
        products.add(  new Product( "Куртка"   , 520.2 , "Black" , size_added(), R.drawable.idel_project_item1 , "Супер Куртка"  ));
        products.add(  new Product( "Шорты"    , 70.2  , "Black" , size_added(), R.drawable.idel_project_item1 , "Супер Шорты"   ));
        products.add(  new Product( "Штаны"    , 240.2 , "Black" , size_added(), R.drawable.idel_project_item1 , "Супер Штаны"   ));
        products.add(  new Product( "Кофта"    , 200.2 , "Black" , size_added(), R.drawable.idel_project_item1 , "Супер Кофта"   ));
        products.add(  new Product( "Сумка"    , 40.2  , "Black" , size_added(), R.drawable.idel_project_item1 , "Супер Сумка"   ));
        products.add(  new Product( "Очки"     , 10.2  , "Black" , size_added(), R.drawable.idel_project_item1 , "Супер Очки"    ));
        products.add(  new Product( "Шуба"     , 1000.2, "Black" , size_added(), R.drawable.idel_project_item1 , "Супер Шуба"    ));
        products.add(  new Product( "Тапочки"  , 20.2  , "Black" , size_added(), R.drawable.idel_project_item1 , "Супер Тапочки" ));

        if (bundle != null) {
            Object object = bundle.getSerializable("New_prod");
            if (object instanceof Product){
                Product new_Product = (Product) object;
                products.add(new_Product);
            }
        }
        adapter = new CastRacyclerAdapter();
        adapter.setData(products);

        LinearLayoutManager lln = new LinearLayoutManager(this);
        lln.setOrientation( LinearLayoutManager.VERTICAL );
        recyclerView.setLayoutManager(lln);
        recyclerView.setAdapter(adapter);

        b_add.setOnClickListener(view -> {

            Intent intent1 = new Intent( this , Add_New_Prod.class);
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