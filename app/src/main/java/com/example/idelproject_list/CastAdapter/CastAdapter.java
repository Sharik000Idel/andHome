package com.example.idelproject_list.CastAdapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import com.example.idelproject_list.R;
import com.example.idelproject_list.moduls.Product;

import java.util.ArrayList;


public class CastAdapter extends ArrayAdapter<Product> {
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Product> product;

    public CastAdapter(Context context, int resource ,ArrayList<Product> product ) {
        super(context, resource, product);
        this.inflater = LayoutInflater.from(context);
        this.layout = resource;
        this.product = product;
    }


    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        Product pro = product.get(position);

        viewHolder.item_image.setImageResource(pro.getImage_tovar());
        viewHolder.item_name.setText(pro.getName_tovar());
        viewHolder.pri_and_buy.setText(""+pro.getPrice());

        return convertView;
    }

    private  class ViewHolder {
        ImageView item_image;
        TextView item_name ;
        Button pri_and_buy;

        ViewHolder(View view){
            item_image = view.findViewById(R.id.image_pro);
            item_name = view.findViewById(R.id.name);
            pri_and_buy = view.findViewById(R.id.buy);
        }

    }
}
