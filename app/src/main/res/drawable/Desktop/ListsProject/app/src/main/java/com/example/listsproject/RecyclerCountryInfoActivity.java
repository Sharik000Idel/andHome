package com.example.listsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.listsproject.Adapters.CountryRecyclerAdapter;
import com.example.listsproject.Models.Country;

public class RecyclerCountryInfoActivity extends AppCompatActivity {

    EditText edt_recycler_item_name;
    EditText edt_recycler_item_capital;
    EditText edt_recycler_item_count;
    EditText edt_recycler_item_description;
    Button btn_item_photo;
    ImageView iv_item_flag;

    private Country country;
    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_country_info);

        btn_item_photo = findViewById(R.id.btn_item_photo);
        iv_item_flag = findViewById(R.id.iv_item_flag);
        edt_recycler_item_name = findViewById(R.id.edt_recycler_item_name);
        edt_recycler_item_capital = findViewById(R.id.edt_recycler_item_capital);
        edt_recycler_item_count = findViewById(R.id.edt_recycler_item_count);
        edt_recycler_item_description = findViewById(R.id.edt_recycler_item_description);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            Object object = bundle.getSerializable(Country.class.getSimpleName());
            position = bundle.getInt("idCountry");
            if (object instanceof Country){
                country = (Country) object;
                iv_item_flag.setImageResource(country.getFlag());
                edt_recycler_item_name.setText(country.getName());
                edt_recycler_item_capital.setText(country.getCapital());
                edt_recycler_item_count.setText(String.valueOf(country.getCount()));
                edt_recycler_item_description.setText(country.getDescription());
            }
        }
    }

    public void onClickItemChange(View view) {
        if(isEmpty(edt_recycler_item_name) || isEmpty(edt_recycler_item_capital)
                || isEmpty(edt_recycler_item_count) || isEmpty(edt_recycler_item_description)){
            Toast.makeText(this, "Заполните поля",Toast.LENGTH_LONG).show();
            return;
        }
        Country changedCountry = new Country(
                edt_recycler_item_name.getText().toString(),
                edt_recycler_item_capital.getText().toString(),
                country.getFlag(),
                Integer.parseInt(edt_recycler_item_count.getText().toString()),
                edt_recycler_item_description.getText().toString()
        );
        CountryRecyclerAdapter adapter = RecyclerViewActivity.getAdapter();
        adapter.changeItem(position, changedCountry);
        finish();
    }

    private boolean isEmpty(EditText edt) {
        return edt.getText().toString().trim().length() == 0;
    }


    public void onClickDeleteCountry(View view) {
        CountryRecyclerAdapter adapter = RecyclerViewActivity.getAdapter();
        adapter.removeItem(position);
        finish();
    }

}