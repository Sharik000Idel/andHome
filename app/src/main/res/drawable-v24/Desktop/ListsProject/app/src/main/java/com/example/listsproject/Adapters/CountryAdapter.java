package com.example.listsproject.Adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.example.listsproject.Models.Country;
import com.example.listsproject.R;
import com.example.listsproject.RecyclerViewActivity;

import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<Country> {


    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Country> countries;


    public CountryAdapter(@NonNull Context context, int resource, ArrayList<Country> countries) {
        super(context, resource, countries);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        this.countries = countries;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Country country = countries.get(position);

        viewHolder.iv_item_flag.setImageResource(country.getFlag());
        viewHolder.tv_item_name.setText(country.getName());
        viewHolder.tv_item_capital.setText(country.getCapital());

        return convertView;


    }



    private class ViewHolder {
        ImageView iv_item_flag;
        TextView tv_item_name, tv_item_capital;

        ViewHolder(View view) {
            iv_item_flag = view.findViewById(R.id.iv_item_flag);
            tv_item_name = view.findViewById(R.id.tv_item_name);
            tv_item_capital = view.findViewById(R.id.tv_item_capital);
        }

    }
}