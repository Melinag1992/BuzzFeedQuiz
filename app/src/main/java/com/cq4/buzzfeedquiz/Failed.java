package com.cq4.buzzfeedquiz;


import android.content.Intent;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;



/**
 * Created by melina.gonzalez on 11/19/17.
 */

public class Failed extends AppCompatActivity {

    private TextView failed_text;
    private ImageView failed_image;
    private Button failedmainpage;

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.failedlayout);

        failed_image= (ImageView) findViewById(R.id.failed_image);
        failed_image.setImageDrawable(getResources().getDrawable(R.drawable.failedimage));
        failed_text = (TextView) findViewById(R.id.failed_textView01);
        failed_text.setText("What a horrible childhood...");
        failedmainpage = (Button) findViewById(R.id.failed_mainbutton);
        failedmainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(u);
            }
        });


    }
}
