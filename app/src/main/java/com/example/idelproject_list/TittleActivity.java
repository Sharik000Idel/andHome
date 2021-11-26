package com.example.idelproject_list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.idelproject_list.moduls.Product;

public class TittleActivity extends AppCompatActivity {

    ImageView imageView_tittle;
    TextView textView_name ;
    TextView textView_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tittle);

        imageView_tittle = findViewById(R.id.tittle_image);
        textView_name = findViewById(R.id.tittle_name);
        textView_text = findViewById(R.id.title_text);

        Bundle bundle = getIntent().getExtras();
        textView_name.setText("product.getName_tovar()");
        textView_text.setText("product.getDescription()");
        if (bundle != null){
            Object object = bundle.getSerializable(Product.class.getSimpleName());
            textView_text.setText("product.getDescription()22222222222");
            if (object instanceof Product){
                Product product = (Product) object;
                imageView_tittle.setImageResource(product.getImage_tovar());
                textView_name.setText(product.getName_tovar());
                textView_text.setText(product.getDescription());

            }
        }

    }
}