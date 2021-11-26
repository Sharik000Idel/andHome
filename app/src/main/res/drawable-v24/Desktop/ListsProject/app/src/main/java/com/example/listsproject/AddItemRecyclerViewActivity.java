package com.example.listsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.listsproject.Adapters.CountryAdapter;
import com.example.listsproject.Adapters.CountryRecyclerAdapter;
import com.example.listsproject.Models.Country;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class AddItemRecyclerViewActivity extends AppCompatActivity {

    EditText edt_recycler_item_name_add;
    EditText edt_recycler_item_capital_add;
    EditText edt_recycler_item_count_add;
    EditText edt_recycler_item_description_add;
    Button btn_item_add_photo;
    ImageView iv_item_add_flag;

    private final int Pick_image = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item_recycler_view);

        btn_item_add_photo = findViewById(R.id.btn_item_add_photo);
        iv_item_add_flag = findViewById(R.id.iv_item_add_flag);
        edt_recycler_item_name_add = findViewById(R.id.edt_recycler_item_name_add);
        edt_recycler_item_capital_add = findViewById(R.id.edt_recycler_item_capital_add);
        edt_recycler_item_count_add = findViewById(R.id.edt_recycler_item_count_add);
        edt_recycler_item_description_add = findViewById(R.id.edt_recycler_item_description_add);
    }

    public void onClickItemAddPhoto(View view) {
        //Вызываем стандартную галерею для выбора изображения с помощью Intent.ACTION_PICK:
        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);
        //Тип получаемых объектов - image:
        photoPickerIntent.setType("image/*");
        //Запускаем переход с ожиданием обратного результата в виде информации об изображении:
        startActivityForResult(photoPickerIntent, Pick_image);
    }

    public void OnClickItemAddCountry(View view) {
        if(isEmpty(edt_recycler_item_name_add) || isEmpty(edt_recycler_item_capital_add)
        || isEmpty(edt_recycler_item_count_add) || isEmpty(edt_recycler_item_description_add)){
            Toast.makeText(this, "Заполните поля",Toast.LENGTH_LONG).show();
            return;
        }
        Country country = new Country(
                edt_recycler_item_name_add.getText().toString(),
                edt_recycler_item_capital_add.getText().toString(),
                R.drawable.flag_of_sssr,
                Integer.parseInt(edt_recycler_item_count_add.getText().toString()),
                edt_recycler_item_description_add.getText().toString()
                );
        CountryRecyclerAdapter adapter = RecyclerViewActivity.getAdapter();
        adapter.addItem(country);
    }

    private boolean isEmpty(EditText edt) {
        return edt.getText().toString().trim().length() == 0;
    }
    //Обрабатываем результат выбора в галерее:
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent imageReturnedIntent) {
        super.onActivityResult(requestCode, resultCode, imageReturnedIntent);

        switch (requestCode) {
            case Pick_image:
                if (resultCode == RESULT_OK) {
                    try {

                        //Получаем URI изображения, преобразуем его в Bitmap
                        //объект и отображаем в элементе ImageView нашего интерфейса:
                        final Uri imageUri = imageReturnedIntent.getData();
                        final InputStream imageStream;
                        imageStream = getContentResolver().openInputStream(imageUri);
                        final Bitmap selectedImage = BitmapFactory.decodeStream(imageStream);
                        iv_item_add_flag.setImageBitmap(selectedImage);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}