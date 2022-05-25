package com.pbm.ramadhanberkahrevisi1.Shalat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pbm.ramadhanberkahrevisi1.R;

public class ShalatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shalat);

        //deklarasi variabel
        CardView cvShalatFardhu, cvShalatTarawih, cvShalatWitir;

        //Menginisialisasi id ke dalam variabel
        cvShalatFardhu = findViewById(R.id.cv_shalat_fardhu);
        cvShalatTarawih = findViewById(R.id.cv_shalat_tarawih);
        cvShalatWitir = findViewById(R.id.cv_shalat_witir);

        //cvShalat Event Handler Onclick
        cvShalatFardhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShalatActivity.this, ShalatFardhuActivity.class);
                startActivity(intent);
            }
        });

        cvShalatTarawih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShalatActivity.this, ShalatTarawihActivity.class);
                startActivity(intent);
            }
        });

        cvShalatWitir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ShalatActivity.this, ShalatWitirActivity.class);
                startActivity(intent);
            }
        });
    }
}