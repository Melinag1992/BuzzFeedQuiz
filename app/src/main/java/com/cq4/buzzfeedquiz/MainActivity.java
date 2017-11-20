package com.cq4.buzzfeedquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toysButton = findViewById(R.id.toys);
        Button button = findViewById(R.id.ninty);
        toysButton.setOnClickListener(this);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.ninty:
                Intent i = new Intent(MainActivity.this,Testninty.class);
                startActivity(i);
                break;
            case R.id.toys:
                Intent  j = new Intent(MainActivity.this,Testtoys.class);
                startActivity(j);
                break;

        }

    }
}
