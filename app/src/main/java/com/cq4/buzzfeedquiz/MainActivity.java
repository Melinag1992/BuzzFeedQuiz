package com.cq4.buzzfeedquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent i = new Intent(this,Testtoys.class);
        startActivity(i);
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.ninty:
                Intent i = new Intent(this,Testninty.class);
                startActivity(i);
                break;
            case R.id.toys:
                Intent  j = new Intent(this,Testtoys.class);
                startActivity(j);
                break;

        }

    }
}
