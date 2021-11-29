package com.example.idelproject_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.idelproject_list.CastAdapter.CastAdapter;
import com.example.idelproject_list.moduls.Product;

import java.util.ArrayList;
import java.util.List;


public class activity_list_view_with_adapter extends AppCompatActivity {

    private ListView listView_product;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_adapter);

        listView_product = findViewById(R.id.listview_products);

        ArrayList<Product>products = new ArrayList<>();

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

        CastAdapter castAdapter = new CastAdapter(this , R.layout.cast_adapter , products );
        listView_product.setAdapter(castAdapter);
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