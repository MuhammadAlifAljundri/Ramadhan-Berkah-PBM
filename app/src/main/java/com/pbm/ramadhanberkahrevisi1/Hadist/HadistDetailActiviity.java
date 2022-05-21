package com.pbm.ramadhanberkahrevisi1.Hadist;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.pbm.ramadhanberkahrevisi1.R;

import java.util.ArrayList;

public class HadistDetailActiviity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hadist_detail_activity);

        //menginisialisasi id kedalam variabel
        TextView judulTxt = findViewById(R.id.judulTextView);
        TextView paragrafTxt = findViewById(R.id.paragrafTextView);

        //nilai default
        String judul = "judul tidak diset";
        String paragraf = "paragraf tidak diset";

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            //mengambil data string dari activity sebelumnya
            //menginisialisasikan kedalam variabel
            judul = extras.getString("judul");
            paragraf = extras.getString("paragraf");
        }
        //setText Text View
        judulTxt.setText(judul);
        paragrafTxt.setText(paragraf);
    }

}
