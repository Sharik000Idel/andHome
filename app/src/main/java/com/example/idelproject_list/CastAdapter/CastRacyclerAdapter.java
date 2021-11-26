package com.example.idelproject_list.CastAdapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.idelproject_list.R;
import com.example.idelproject_list.TittleActivity;
import com.example.idelproject_list.moduls.Product;

import java.util.ArrayList;

public class CastRacyclerAdapter extends RecyclerView.Adapter<CastRacyclerAdapter.ViewHolder> {

    private ArrayList<Product> products = new ArrayList<>();
    private LayoutInflater inflater;

    public void setData(ArrayList<Product> countries){
        this.products.clear();
        this.products.addAll(countries);
        notifyDataSetChanged();
    }

    public void addItem(Product country) {
        products.add(country);
        notifyDataSetChanged();
    }

    public void removeItem(Product country) {
        products.remove(country);
        notifyDataSetChanged();
    }

    public void removeItem(int position) {
        products.remove(position);
        notifyDataSetChanged();
    }

    public void changeItem(int position, Product updatedCountry) {
        products.set(position, updatedCountry);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cast_adapter , parent , false);
        return new  ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(products.get(position) , position);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder{

        ImageView iv_item_image_tovar;
        TextView tv_item_name_tovarl;
        Button bu_item_pri_and_buy_tovar;

        public ViewHolder(View itemView) {
            super(itemView);
            iv_item_image_tovar = itemView.findViewById(R.id.image_pro);
            tv_item_name_tovarl = itemView.findViewById(R.id.name);
            bu_item_pri_and_buy_tovar = itemView.findViewById(R.id.buy);
        }

        public void bind(Product productss , int position){
            iv_item_image_tovar.setImageResource(productss.getImage_tovar());
            tv_item_name_tovarl.setText(productss.getName_tovar());
            bu_item_pri_and_buy_tovar.setText(String.valueOf(productss.getPrice()));

            itemView.setOnClickListener(v -> {

                Intent intent = new Intent( itemView.getContext() , TittleActivity.class);
                intent.putExtra(Product.class.getSimpleName() , productss);
                intent.putExtra("id" , position);
                itemView.getContext().startActivity(intent);

            });
        }
    }
}
