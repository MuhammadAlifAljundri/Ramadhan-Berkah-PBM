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
        String hadist2 = getString(R.string.hadist2);
        String hadist3 = getString(R.string.hadist3);
        String hadist4 = getString(R.string.hadist4);
        String hadist5 = getString(R.string.hadist5);
        String hadist6 = getString(R.string.hadist6);
        String hadist7 = getString(R.string.hadist7);
        String hadist8 = getString(R.string.hadist8);
        String hadist9 = getString(R.string.hadist9);
        String hadist10 = getString(R.string.hadist10);
        String hadist11 = getString(R.string.hadist11);

        hadistArrayList.add(new Hadist("Niat", hadist1));
        hadistArrayList.add(new Hadist("Mengimami Shalat", hadist2));
        hadistArrayList.add(new Hadist("Shalat Berjamaah", hadist3));
        hadistArrayList.add(new Hadist("Shalat Tahiyatul Masjid", hadist4));
        hadistArrayList.add(new Hadist("Membayar Utang Puasa Bagi Orang yang Telah Meninggal", hadist5));
        hadistArrayList.add(new Hadist("Hukum Berbuka Bagi Musafir", hadist6));
        hadistArrayList.add(new Hadist("Hukum Berdusta Ketika Sedang Berpuasa", hadist7));
        hadistArrayList.add(new Hadist("Keutamaan Sahur", hadist8));
        hadistArrayList.add(new Hadist("Menyegerakan Berbuka", hadist9));
        hadistArrayList.add(new Hadist("Hukum Mendahului Puasa Ramadhan", hadist10));
        hadistArrayList.add(new Hadist("Tiga Orang yang Dibolehkan meminta-minta", hadist11));

    }
}