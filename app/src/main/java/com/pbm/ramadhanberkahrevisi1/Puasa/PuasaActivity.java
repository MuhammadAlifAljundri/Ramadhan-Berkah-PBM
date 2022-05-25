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
        LinearLayout lyNiat;

//        lyNiat = findViewById(R.id.ly_niat);
//
//        lyNiat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentNiat = new Intent(PuasaActivity.this, NiatPuasaActivity.class);
//                startActivity(intentNiat);
//            }
//        });


        //Menginisialisasi id ke dalam variabel
//        cvNiat =  findViewById(R.id.cv_niat_puasa);
//        cvDoa = (CardView) findViewById(R.id.cv_doa_puasa);
//        cvSyarat =(CardView) findViewById(R.id.cv_syarat_rukun_puasa);

//        cvNiat.setOnClickListener(this);
//        cvDoa.setOnClickListener(this);
//        cvSyarat.setOnClickListener(this);

//        //cvNiat Event Handler Onclick
//        cvNiat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(PuasaActivity.this, NiatPuasaActivity.class);
//                startActivity(intent);
//                finish();
//            }
//        });
//
//        //cvNgabuburit Event Handler Onclick
//        cvDoa.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(PuasaActivity.this, DoaPuasaActivity.class);
//                startActivity(intent);
//            }
//        });
//
//        //cvKuis Event Handler Onclick
//        cvSyarat.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(PuasaActivity.this, SyaratPuasaActivity.class);
//                startActivity(intent);
//            }
//        });
//



//        public void btnNiatPuasa(New View view){
//            Intent intent = new Intent(PuasaActivity.this, NiatPuasaActivity.class);
//            startActivity(intent);
//        }

    }

    public void btnNiat(View view) {
        Intent intentniat = new Intent(PuasaActivity.this, NiatPuasaActivity.class);
        startActivity(intentniat);
    }

//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.cv_niat_puasa:
//                Intent intent1 = new Intent(PuasaActivity.this, NiatPuasaActivity.class);
//                startActivity(intent1);
//                break;
//            case R.id.cv_doa_puasa:
//                break;
//            case R.id.cv_syarat_rukun_puasa:
//                break;
//        }
//    }




}
