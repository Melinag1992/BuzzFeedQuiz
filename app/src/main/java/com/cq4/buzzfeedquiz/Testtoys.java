package com.cq4.buzzfeedquiz;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.cq4.buzzfeedquiz.controller.ToysAdapter;
import com.cq4.buzzfeedquiz.model.Toys;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by melina.gonzalez on 11/18/17.
 */

public class Testtoys extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toyslayout);
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();

        RecyclerView toysRecyclerView = (RecyclerView) findViewById(R.id.toys_recyclerview);

        List<Toys> toys = new ArrayList<>();


        toys.add(new Toys(R.drawable.nintendo));
        toys.add(new Toys(R.drawable.socketboppers));
        toys.add(new Toys(R.drawable.gameboy));
        toys.add(new Toys(R.drawable.brickgame));
        toys.add(new Toys(R.drawable.mash));
        toys.add(new Toys(R.drawable.watergame));
        toys.add(new Toys(R.drawable.gigapets));

        ToysAdapter toysAdapter = new ToysAdapter(toys);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(), LinearLayoutManager.VERTICAL, false);
        toysRecyclerView.setAdapter(toysAdapter);
        toysRecyclerView.setLayoutManager(linearLayoutManager);
    }


}
