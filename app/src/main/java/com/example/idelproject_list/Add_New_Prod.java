package com.example.idelproject_list;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.idelproject_list.moduls.Product;
import com.thomashaertel.widget.MultiSpinner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Add_New_Prod extends AppCompatActivity {

    String name;
    double price ;
    List<String> color_tovar;
    List<String> size_tovar;
    int image_tovar  = R.drawable.idel_project_item4;
    String description;


    Spinner sp_color;
    MultiSpinner  sp_size;
    Button but_add_foto ,getBut_add_prod ;
    TextView tv_write_size;
    EditText name_adder_prod;
    ImageView image_adder_foto;

    ArrayAdapter<String> adapter_size , adapter_color;

    ArrayList<Product> products =new ArrayList<Product>();

    ArrayList<String> size = new ArrayList<String>();
    ArrayList<String> color = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_prod);

        sp_color = findViewById(R.id.color_spin);
        sp_size =(MultiSpinner) findViewById(R.id.size_spin);
        but_add_foto = findViewById(R.id.foto_adder_newprod);
        getBut_add_prod = findViewById(R.id.adder_newrpod);
        tv_write_size = findViewById(R.id.sixe_text);
        name_adder_prod = findViewById(R.id.editText);
        image_adder_foto = findViewById(R.id.image_adder);





        Collections.addAll(size , "XS" , "S" , "M" , "L" , "XL" );
        Collections.addAll(color , "Red" , "Black" , "Grey" , "green" , "Yellow" );

        adapter_size = new ArrayAdapter<String>( this ,android.R.layout.simple_spinner_item);
        adapter_size.add("XS");
        adapter_size.add("S");
        adapter_size.add("M");
        adapter_size.add("L");
        adapter_size.add("XL");

        sp_size.setAdapter(adapter_size, false , onSelectListener);
        adapter_size.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        boolean[] selectItems = new boolean[adapter_size.getCount()];
        selectItems[1] = true;
        sp_size.setSelected(selectItems);

        String a = sp_size.getText().toString();
        System.out.println(a);
        name = name_adder_prod.getText().toString();

        adapter_color = new ArrayAdapter<String>( this ,android.R.layout.simple_spinner_item , color );
        adapter_color.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            int im = bundle.getInt("Image");
            image_adder_foto.setImageResource(im);
            image_tovar = im;
            ArrayList<Product> productss = (ArrayList<Product>)bundle.get("Catalog_list");

        }

        sp_color.setAdapter(adapter_color);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
               String item = (String) adapterView.getItemAtPosition(i);
                String b = sp_size.getText().toString();
                System.out.println(b);
            }
        };

        but_add_foto.setOnClickListener(v -> {

            Intent intent = new Intent( this , Foto_selectedActivity.class );
            startActivity(intent);

        });

        getBut_add_prod.setOnClickListener(view -> {

            String b = sp_size.getText().toString();
            System.out.println(b);
            products = new ArrayList<Product>();
            products.add(new Product(name , price , "dsfas" ,size_tovar ,  image_tovar ,description));
            Intent intent= new Intent(this , CatalogActivity.class);
            intent.putExtra("Catalog_list" ,  products);
            startActivity(intent);
            String v = sp_size.getText().toString();
            System.out.println(v);

        });


    }

    @Override
    protected void onStart(){
        super.onStart();
        System.out.println("  Staaart  ");


    }


    private MultiSpinner.MultiSpinnerListener onSelectListener  =new MultiSpinner.MultiSpinnerListener(){

        public void onItemsSelected(boolean[] selected) {
            // Do something here with the selected items
            String v = sp_size.getText().toString();
            System.out.println(v);

        }
    };

}