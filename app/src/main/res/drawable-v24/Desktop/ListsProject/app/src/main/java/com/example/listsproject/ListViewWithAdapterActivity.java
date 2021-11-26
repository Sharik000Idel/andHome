package com.example.listsproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;

import com.example.listsproject.Adapters.CountryAdapter;
import com.example.listsproject.Models.Country;

import java.util.ArrayList;

public class ListViewWithAdapterActivity extends AppCompatActivity {

    private ListView listview_counties;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_with_adapter);

        listview_counties = findViewById(R.id.listview_counties);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add(
                new Country("Россия", "Москва", R.drawable.flag_of_russia, 1000000,
                        "Россия – крупнейшая страна мира, расположенная в Восточной Европе и Северной Азии и омываемая водами Тихого и Северного Ледовитого океанов. Ландшафт России крайне разнообразен: на ее территории есть и тундра, и леса, и субтропические пляжи. В Большом театре в Москве и Мариинском театре в Санкт-Петербурге выступают балетные труппы, снискавшие всемирную славу. Санкт-Петербург, основанный императором Петром I, известен своим Зимним дворцом в стиле барокко, в котором размещается часть обширной художественной коллекции музея \"Эрмитаж\"."));
        countries.add(new Country("Америка", "Вашингтон", R.drawable.flag_of_the_united_states,100000,
                "Соединенные Штаты Америки – государство, состоящее из 50 штатов, занимает значительную часть Северной Америки. Штат Аляска расположен на северо-западе континента, а Гавайи – в Тихом океане. К крупным городам атлантического побережья относятся Нью-Йорк и столица Вашингтон. К западу от них находится ещё один важный город – Чикаго, известный своей впечатляющей архитектурой. А на западном побережье расположен Лос-Анджелес со знаменитыми голливудскими киностудиями."));
        countries.add(new Country("Беларусь", "Минск", R.drawable.flag_of_belarus, 9300000,
                "Беларусь – государство в Восточной Европе, полностью окруженное сушей. В этой стране много зданий сталинской эпохи, исторические боевые укрепления и нетронутые леса. В столице, городе Минске, находится монументальное здание КГБ Республики Беларусь. Его очертания видны с расположенной неподалеку площади Независимости. Ещё одна достопримечательность – Государственный музей истории Великой Отечественной войны. Также в Минске находится множество разных церквей, например костел Святого Симеона и Святой Елены."));
        CountryAdapter countryAdapter = new CountryAdapter(this,R.layout.country_list_item, countries);
        listview_counties.setAdapter(countryAdapter);

        listview_counties.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent intent = new Intent(this,CountryInfoActivity.class);
            intent.putExtra(Country.class.getSimpleName(), countries.get(i));
            startActivity(intent);
        });



    }
}