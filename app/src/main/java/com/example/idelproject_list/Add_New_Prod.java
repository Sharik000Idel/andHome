package com.example.idelproject_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Add_New_Prod extends AppCompatActivity {

    Spinner sp_color , sp_size;
    Button but_add_foto ,getBut_add_prod ;
    TextView tv_write_size;
    EditText name_adder_prod;
    ImageView image_adder_foto;

    ArrayAdapter<String> adapter_size , adapter_color;

    ArrayList<String> size = new ArrayList<String>();
    ArrayList<String> color = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_prod);

        sp_color = findViewById(R.id.color_spin);
        sp_size = findViewById(R.id.size_spin);
        but_add_foto = findViewById(R.id.foto_adder_newprod);
        getBut_add_prod = findViewById(R.id.adder_newrpod);
        tv_write_size = findViewById(R.id.sixe_text);
        name_adder_prod = findViewById(R.id.editText);
        image_adder_foto = findViewById(R.id.image_adder);

        Collections.addAll(size , "XS" , "S" , "M" , "L" , "XL" );
        Collections.addAll(color , "Red" , "Black" , "Grey" , "green" , "Yellow" );

        adapter_size = new ArrayAdapter( this ,android.R.layout.simple_spinner_item , size );
        adapter_size.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_size.setAdapter(adapter_size);

        adapter_color = new ArrayAdapter( this ,android.R.layout.simple_spinner_item , color );
        adapter_color.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp_color.setAdapter(adapter_color);





    }
}