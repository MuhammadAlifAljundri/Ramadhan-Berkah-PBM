package com.pbm.ramadhanberkahrevisi1.Sejarah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.pbm.ramadhanberkahrevisi1.R;

public class SejarahIslamActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sejarah_islam3);

        //deklarasi variabel
        ImageView imgBack12;

        //Menginisialisasi id ke dalam variabel
        imgBack12 = findViewById(R.id.img_back12);

        //imgBack2 Event Handler Onclick
        imgBack12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SejarahIslamActivity3.this, SejarahIslamActivity2.class);
                startActivity(intent);
            }
        });

    }
}