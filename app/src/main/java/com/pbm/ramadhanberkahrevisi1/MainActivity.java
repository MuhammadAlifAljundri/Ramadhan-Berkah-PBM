package com.pbm.ramadhanberkahrevisi1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //deklarasi variabel
        CardView cvSerbaSerbi;

        //Menginisialisasi id ke dalam variabel
        cvSerbaSerbi = findViewById(R.id.cv_serba_serbi);

        //cvSerbaSerbi Event Handler Onclick
        cvSerbaSerbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SerbaSerbiActivity.class);
                startActivity(intent);
            }
        });

    }
}