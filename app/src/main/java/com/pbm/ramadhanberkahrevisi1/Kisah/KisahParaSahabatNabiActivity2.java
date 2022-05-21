package com.pbm.ramadhanberkahrevisi1.Kisah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pbm.ramadhanberkahrevisi1.R;

public class KisahParaSahabatNabiActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisah_para_sahabat_nabi2);

        //deklarasi variabel
        ImageView imgBack1, imgForwad2;

        //Menginisialisasi id ke dalam variabel
        imgBack1 = findViewById(R.id.img_back1);
        imgForwad2 = findViewById(R.id.img_forwad2);

        //imgBack1 Event Handler Onclick
        imgBack1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KisahParaSahabatNabiActivity2.this, KisahParaSahabatNabiActivity1.class);
                startActivity(intent);
            }
        });

        //imgForwad2 Event Handler Onclick
        imgForwad2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KisahParaSahabatNabiActivity2.this, KisahParaSahabatNabiActivity3.class);
                startActivity(intent);
            }
        });
    }
}