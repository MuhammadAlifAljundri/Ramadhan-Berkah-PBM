package com.pbm.ramadhanberkahrevisi1.Sejarah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pbm.ramadhanberkahrevisi1.R;

public class SejarahIslamActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah_islam2);

        //deklarasi variabel
        ImageView imgBack11, imgForwad12;

        //Menginisialisasi id ke dalam variabel
        imgBack11 = findViewById(R.id.img_back11);
        imgForwad12 = findViewById(R.id.img_forwad12);

        //imgBack11 Event Handler Onclick
        imgBack11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SejarahIslamActivity2.this, SejarahIslamActivity1.class);
                startActivity(intent);
            }
        });

        //imgForwad12 Event Handler Onclick
        imgForwad12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SejarahIslamActivity2.this, SejarahIslamActivity3.class);
                startActivity(intent);
            }
        });
    }
}