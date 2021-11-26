package com.example.listsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class ListViewWithoutAdapterActivity extends AppCompatActivity {

    ArrayList<String> countries = new ArrayList<String>();

    private ListView listView;
    private TextView tv_listview_item;
    private EditText edt_item;

    private ArrayAdapter<String> adapter;
    ArrayList<String> selectedItems = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_without_adapter);

        Collections.addAll(countries,"Россия", "Америка", "Украина", "Китай", "Германия", "Канада", "Испания");

        listView = findViewById(R.id.listView);
        tv_listview_item = findViewById(R.id.tv_listview_item);
        edt_item = findViewById(R.id.edt_item);

        /*
 Способ с  массивом
        String []countries = {"Россия", "Америка", "Финляндия", "Китай"};
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, countries);
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.countries));
        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.countries));
*/

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_multiple_choice, countries);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                /*
  Если одиночное выделение
               tv_item.setText(adapter.getItem(i));
*/

                /*
  Синий цвет
                if(listView.isItemChecked(i)) {
                    selectedItems.add(adapter.getItem(i));
                    ((TextView) view).setTextColor(Color.BLUE);
                }
                else{
                    selectedItems.remove(adapter.getItem(i));
                    ((TextView) view).setTextColor(Color.BLACK);
                }
*/

                String listItems = "";
                for(String selectedItem : selectedItems){
                    listItems += selectedItem + " ";
                }
                tv_listview_item.setText(listItems);

            }
        });
    }

    public void onClickAdd(View view) {
        String country = edt_item.getText().toString();
        if(!country.isEmpty() && country != null){
            adapter.add(country);
            adapter.notifyDataSetChanged();
            edt_item.getText().clear();
        }

    }

    public void onClickRemove(View view) {
        for(int i=0; i< selectedItems.size();i++){
            adapter.remove(selectedItems.get(i));
        }
        listView.clearChoices();
        selectedItems.clear();

        adapter.notifyDataSetChanged();

    }
}