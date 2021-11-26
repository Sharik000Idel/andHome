package com.example.listsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.listsproject.Adapters.CountryRecyclerAdapter;
import com.example.listsproject.Models.Country;

public class CountryInfoActivity extends AppCompatActivity {

    private ImageView iv_info_flag;
    private TextView tv_info_name;
    private TextView tv_info_capital;
    private TextView tv_info_count;
    private TextView tv_info_description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_country_info);

        Bundle bundle = getIntent().getExtras();

        iv_info_flag = findViewById(R.id.iv_info_flag);
        tv_info_name = findViewById(R.id.tv_info_name);
        tv_info_capital = findViewById(R.id.tv_info_capital);
        tv_info_count = findViewById(R.id.tv_info_count);
        tv_info_description = findViewById(R.id.tv_info_description);

        if (bundle != null){
            Object object = bundle.getSerializable(Country.class.getSimpleName());
            if (object instanceof Country){
                Country country = (Country) object;
                iv_info_flag.setImageResource(country.getFlag());
                tv_info_name.setText(country.getName());
                tv_info_capital.setText(country.getCapital());
                tv_info_count.setText(String.valueOf(country.getCount()));
                tv_info_description.setText(country.getDescription());
            }
        }
    }
}