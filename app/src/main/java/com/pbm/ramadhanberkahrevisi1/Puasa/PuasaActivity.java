package com.pbm.ramadhanberkahrevisi1.Puasa;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.pbm.ramadhanberkahrevisi1.R;

public class PuasaActivity extends AppCompatActivity{



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_puasa);

        //deklarasi variabel
        CardView cvNiat, cvDoa, cvSyarat;


        //Menginisialisasi id ke dalam variabel
        cvNiat = findViewById(R.id.cv_niat);
        cvDoa = findViewById(R.id.cv_doa_puasa);
        cvSyarat = findViewById(R.id.cv_syarat_rukun_puasa);


      //cvNiat Event Handler Onclick
        cvNiat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PuasaActivity.this, NiatPuasaActivity.class);
                startActivity(intent);
                finish();
            }
        });

      //cvDoa Event Handler Onclick
        cvDoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PuasaActivity.this, DoaPuasaActivity.class);
                startActivity(intent);
            }
        });

        //cvSyarat Event Handler Onclick
        cvSyarat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PuasaActivity.this, SyaratPuasaActivity.class);
                startActivity(intent);
            }
        });
    }
}
