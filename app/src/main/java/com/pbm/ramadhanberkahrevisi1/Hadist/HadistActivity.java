package com.pbm.ramadhanberkahrevisi1.Hadist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.pbm.ramadhanberkahrevisi1.R;

import java.util.ArrayList;

public class HadistActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private HadistAdapter hadistAdapter;
    private ArrayList<Hadist> hadistArrayList;
    private HadistAdapter.RecyclerViewClickListener listener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hadist);

        recyclerView = findViewById(R.id.recycleview);
        hadistArrayList = new ArrayList<>();

        getData();
        setAdapter();
    }

    private void setAdapter() {
        setOnClickListener();
        HadistAdapter hadistAdapter = new HadistAdapter(hadistArrayList, listener);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(hadistAdapter);
    }

    //function event handler onClick
    private void setOnClickListener() {
        listener = new HadistAdapter.RecyclerViewClickListener() {
            @Override
            public void onClick(View v, int position) {
                Intent intent = new Intent(getApplicationContext(), HadistDetailActiviity.class);
                intent.putExtra("judul", hadistArrayList.get(position).getJudul());
                intent.putExtra("paragraf", hadistArrayList.get(position).getParagraf());
                startActivity(intent);
            }
        };
    }

    //function menyimpan data hadist atau menambah data hadist ke dalam arraylist
    public void getData() {

        //mengambil string yang terdapat pada value string.xml
        String hadist1 = getString(R.string.hadist1);

        hadistArrayList.add(new Hadist("Shalat Berjamaah", hadist1));
        hadistArrayList.add(new Hadist("Mengimami Shalat", hadist1));
        hadistArrayList.add(new Hadist("Shalat Tahiyatul Masjid", ""));
        hadistArrayList.add(new Hadist("Membayar Utang Puasa Bagi Orang yang Telah Meninggal", ""));
        hadistArrayList.add(new Hadist("Hukum Berbuka Bagi Musafir", ""));
        hadistArrayList.add(new Hadist("Hukum Berdusta Ketika Sedang Berpuasa", ""));
        hadistArrayList.add(new Hadist("Keutamaan Sahur", ""));
        hadistArrayList.add(new Hadist("Hukum Mendahului Puasa Ramadhan", ""));
        hadistArrayList.add(new Hadist("Menyegerakan Berbuka", ""));
        hadistArrayList.add(new Hadist("Tiga Orang yang Dibolehkan meminta-minta", ""));
        hadistArrayList.add(new Hadist("Shalat Berjamaah", ""));
        hadistArrayList.add(new Hadist("Shalat Berjamaah", ""));
        hadistArrayList.add(new Hadist("Shalat Berjamaah", ""));
        hadistArrayList.add(new Hadist("Shalat Berjamaah", ""));
        hadistArrayList.add(new Hadist("Shalat Berjamaah", ""));
        hadistArrayList.add(new Hadist("Shalat Berjamaah", ""));

    }
}