package com.example.listsproject.Adapters;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.listsproject.AddItemRecyclerViewActivity;
import com.example.listsproject.Models.Country;
import com.example.listsproject.R;
import com.example.listsproject.RecyclerCountryInfoActivity;

import java.util.ArrayList;

public class CountryRecyclerAdapter extends RecyclerView.Adapter<CountryRecyclerAdapter.ViewHolder>{

    private  ArrayList<Country> countries =new ArrayList();
    private LayoutInflater inflater;

    public void setData(ArrayList<Country> countries){
        this.countries.clear();
        this.countries.addAll(countries);
        notifyDataSetChanged();
    }

    public void addItem(Country country) {
        countries.add(country);
        notifyDataSetChanged();
    }

    public void removeItem(Country country) {
        countries.remove(country);
        notifyDataSetChanged();
    }

    public void removeItem(int position) {
        countries.remove(position);
        notifyDataSetChanged();
    }

    public void changeItem(int position, Country updatedCountry) {
        countries.set(position, updatedCountry);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public CountryRecyclerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.country_list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryRecyclerAdapter.ViewHolder holder, int position) {
        holder.bind(countries.get(position), position);
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iv_item_flag;
        private final TextView tv_item_name, tv_item_capital;
        ViewHolder(View view){
            super(view);
            iv_item_flag = view.findViewById(R.id.iv_item_flag);
            tv_item_name = view.findViewById(R.id.tv_item_name);
            tv_item_capital = view.findViewById(R.id.tv_item_capital);
        }

        public void bind(Country country, int position){
            iv_item_flag.setImageResource(country.getFlag());
            tv_item_name.setText(country.getName());
            tv_item_capital.setText(country.getCapital());

            itemView.setOnClickListener(v -> {
                Intent intent = new Intent(itemView.getContext(), RecyclerCountryInfoActivity.class);
                intent.putExtra(Country.class.getSimpleName(), country);
                intent.putExtra("idCountry", position);
                itemView.getContext().startActivity(intent);
            });
        }
    }

}
