package com.belajar.viewpagerhaerul;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    Adapter adapter;
    List<Model> models;
    Integer[] colors = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        models = new ArrayList<>();
        models.add(new Model(R.drawable.produk_fh99,"Formula Hayati 99", "Produk Suplemen antioksidan untuk kesehatan"));
        models.add(new Model(R.drawable.produk_afh,"Aulora Feminine Hygiene", "Produk Perawatan untuk perlindungan dan regenerasi area kewanitaan "));
        models.add(new Model(R.drawable.produk_collagensoap,"Colagen Soap", "Sabun pembersih tubuh yang akan menutrisi kulitmu dengan kolagen"));
        models.add(new Model(R.drawable.produk_gamatspray,"Gamatspray", "Produk praktis serbaguna sebagai P3K dan juga merawat kulit"));
        models.add(new Model(R.drawable.produk_goldsoap,"Aulora Gold Soap", "Sabun Mandi dengan Ekstra kolagen "));
        models.add(new Model(R.drawable.produk_kidjoz,"Kidjoz Kids Honey", "Produk Suplemen untuk anak-anak"));
        models.add(new Model(R.drawable.produk_mmf,"ABM7 Series MMF", "Produk Suplemen untuk kesehatan pencernaan Anda"));

        adapter = new Adapter(models, this);

        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.setPadding(130,0,130,0);

        Integer[] colors_temp = {
                getResources().getColor(R.color.color1),
                getResources().getColor(R.color.color2),
                getResources().getColor(R.color.color3),
                getResources().getColor(R.color.color4)
        };



        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {


            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }
}