package com.example.idelproject_list;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.GridLayout;
import android.widget.ImageView;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Foto_selectedActivity extends AppCompatActivity {

    GridLayout gridLayout;
    RecyclerView recyclerView;

    Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        adapter = new Adapter();
        setContentView(R.layout.activity_foto_selected);

        recyclerView = findViewById(R.id.Foto_selected_emty);


        GridLayoutManager layoutManager = new GridLayoutManager(this , 2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


        getSupportActionBar().setTitle("Выберите фото");
    }



    private ArrayList<Integer> ImagesFolder (  ){
        ArrayList<Integer> drawables = new ArrayList<>();

        drawables.add(R.drawable.idel_project_item1);
        drawables.add(R.drawable.idel_project_item2);
        drawables.add(R.drawable.idel_project_item3);
        drawables.add(R.drawable.idel_project_item4);
        drawables.add(R.drawable.idel_project_item5);
        drawables.add(R.drawable.idel_project_item6);
        drawables.add(R.drawable.idel_project_item7);
        drawables.add(R.drawable.idel_project_item8);


        return drawables;
    }



    private class  Adapter extends  RecyclerView.Adapter<ViewHoler> {

        ArrayList<Integer> drawables = ImagesFolder();

        public void setImages (List<Integer> draws ){
            this.drawables.clear();
            this.drawables.addAll(draws);
            notifyDataSetChanged();

        }

        @NonNull
        @Override
        public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            return new ViewHoler(LayoutInflater.from(parent.getContext())
            .inflate(R.layout.item_image, parent, false));
        }

        @Override
        public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
            holder.bind(drawables.get(position));
        }

        @Override
        public int getItemCount() {
            return drawables.size();
        }


    }


    private  class ViewHoler extends RecyclerView.ViewHolder{


        ImageView imageView;

        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image_prod_select);

        }

        public void bind (int drawabl ) {

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent  = new Intent(v.getContext() ,  Add_New_Prod.class);
                    intent.putExtra("Image" , drawabl);
                    System.out.println("asdfasd   " + drawabl);
                    //intent.addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);//FLAG_ACTIVITY_REORDER_TO_FRONT)
                    v.getContext().startActivity(intent);
                }
            });


            imageView.setImageResource(drawabl);
        }


    }

}

