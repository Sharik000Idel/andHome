package com.example.listsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;

public class SpinnerActivity extends AppCompatActivity {

    private TextView tv_spinner_item;
    private Spinner spinner;
    ArrayList<String> countries = new ArrayList<String>();
    ArrayAdapter<String> adapter;
    private String selectedItem;

    private EditText edt_spinner_country;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);

        tv_spinner_item = findViewById(R.id.tv_spinner_item);
        spinner = findViewById(R.id.spinner);
        edt_spinner_country = findViewById(R.id.edt_spinner_country);

        Collections.addAll(countries,"Россия", "Америка", "Украина", "Китай", "Германия", "Канада", "Испания");

        adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, countries);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String item = adapter.getItem(position);
                tv_spinner_item.setText(item);
                selectedItem = item;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public void onClickAddSpinnerCountry(View view) {
        if (!isEmpty(edt_spinner_country)) {
            adapter.add(edt_spinner_country.getText().toString());
            edt_spinner_country.getText().clear();
            Toast.makeText(this,"Вы добавили страну " + edt_spinner_country.getText().toString(), Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickRemoveSpinnerCountry(View view) {
        if (spinner.getSelectedItem() != null) {
            adapter.remove(selectedItem);
            tv_spinner_item.setText(spinner.getSelectedItem().toString());
            Toast.makeText(this,"Вы удалили страну " + selectedItem, Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isEmpty(EditText edt) {
        return edt.getText().toString().trim().length() == 0;
    }

}