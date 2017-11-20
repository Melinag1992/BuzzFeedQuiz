package com.cq4.buzzfeedquiz;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import static com.cq4.buzzfeedquiz.R.drawable.childcongrats;

/**
 * Created by melina.gonzalez on 11/18/17.
 */

public class Testninty extends AppCompatActivity implements View.OnClickListener {

    HashMap<String, Drawable> shows;
    private String randomKey;
    private Drawable value;
    private TextView question_textView;
    private ImageView image_imageView;
    private Button yesbutton;
    private Button nobutton;
    private Button nextbutton;
    private int counter = 0;
    private int wrongcount = 0;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nintys);

        question_textView = (TextView) findViewById(R.id.question_textview);
        image_imageView = (ImageView) findViewById(R.id.image_imageview);
        nobutton = (Button) findViewById(R.id.no_button);
        nobutton.setOnClickListener(this);
        yesbutton = (Button) findViewById(R.id.yes_button);
        yesbutton.setOnClickListener(this);
        nextbutton = (Button) findViewById(R.id.next_button);
        nextbutton.setOnClickListener(this);


        shows = new HashMap<String, Drawable>();
        shows.put("Do you remember watching IT?", getResources().getDrawable(R.drawable.it));
        shows.put("Otto's shop?", getResources().getDrawable(R.drawable.rocketpower));
        shows.put("Remember watching Recess?", getResources().getDrawable(R.drawable.recess));
        shows.put("Remember Friends? Yes, greatest show ever.", getResources().getDrawable(R.drawable.firends));
        shows.put("Jerry! Jerry! you have to remember this!?!", getResources().getDrawable(R.drawable.jerryspringer));
        shows.put("Skreeech!",getResources().getDrawable(R.drawable.savedbythebell));
        shows.put("Bel'Air's finest...",getResources().getDrawable(R.drawable.freshprince));
        shows.put("Come on and Zoom !", getResources().getDrawable(R.drawable.zoom));


        imagesAndQuestions();
    }

    public void imagesAndQuestions() {
        Random random = new Random();
        List<String> keys = new ArrayList<String>(shows.keySet());
        randomKey = keys.get(random.nextInt(keys.size()));
        value = shows.get(randomKey);


        for (Object i : shows.keySet()) {

            question_textView.setText(randomKey);
            image_imageView.setImageDrawable(value);


        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {


            case R.id.yes_button:
                ++counter;

                break;

            case R.id.no_button:
                ++wrongcount;
                break;

            case R.id.next_button:
                imagesAndQuestions();
                if (counter >= 6) {
                    Intent k = new Intent(this, Congrats.class);
                    startActivity(k);
                    break;

                } else if (wrongcount >= 4){
                    Intent e = new Intent(getApplicationContext(), Failed.class);
                    startActivity(e);
                    break;
                }

        }
    }
}




