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

public class Congrats extends AppCompatActivity {

    private TextView textshown;
    private ImageView congratsimage;
    private Button mainpage;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.congrats);


        textshown = (TextView) findViewById(R.id.textshown);
        textshown.setText("Congrats! You remember your childhood");
        congratsimage = (ImageView) findViewById(R.id.congrats);
        congratsimage.setImageDrawable(getResources().getDrawable(R.drawable.childcongrats));
        mainpage = (Button) findViewById(R.id.mainpage_button);

        mainpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(k);
            }
        });


    }
}
