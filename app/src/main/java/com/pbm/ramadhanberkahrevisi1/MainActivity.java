package com.pbm.ramadhanberkahrevisi1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pbm.ramadhanberkahrevisi1.Puasa.PuasaActivity;
import com.pbm.ramadhanberkahrevisi1.Shalat.ShalatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //deklarasi variabel
        CardView cvSerbaSerbi, cvPuasa, cvShalat;

        //Menginisialisasi id ke dalam variabel
        cvSerbaSerbi = findViewById(R.id.cv_serba_serbi);
        cvPuasa = findViewById(R.id.cv_puasa);
        cvShalat = findViewById(R.id.cv_shalat);

        //cvSerbaSerbi Event Handler Onclick
        cvSerbaSerbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SerbaSerbiActivity.class);
                startActivity(intent);
            }
        });

        //cvSerbaSerbi Event Handler Onclick
        cvPuasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PuasaActivity.class);
                startActivity(intent);
            }
        });

        //cvShalat Event Handler Onclick
        cvShalat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ShalatActivity.class);
                startActivity(intent);
            }
        });
    }
}