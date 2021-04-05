package com.example.list_recycle_view;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private MahasiswaAdapter mAdapter;
    private RecyclerView recyclerView;
    private ArrayList<Mahasiswa> mahasiswaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        addData();

        recyclerView = findViewById(R.id.recycler_view);

        mAdapter = new MahasiswaAdapter(mahasiswaArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);
    }

    private void addData() {
        mahasiswaArrayList = new ArrayList<>();
        mahasiswaArrayList.add(new Mahasiswa("Aziz", "E41191468", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Ragil", "E41192173", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Sulton", "E41192269", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Zami", "E41191668", "123456789"));
        mahasiswaArrayList.add(new Mahasiswa("Ivon", "E41192308", "123456789"));
    }
}