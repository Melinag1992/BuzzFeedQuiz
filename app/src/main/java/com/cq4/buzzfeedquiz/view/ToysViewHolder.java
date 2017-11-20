package com.cq4.buzzfeedquiz.view;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.cq4.buzzfeedquiz.R;
import com.cq4.buzzfeedquiz.model.Toys;
import com.squareup.picasso.Picasso;

/**
 * Created by melina.gonzalez on 11/19/17.
 */

public class ToysViewHolder extends RecyclerView.ViewHolder  {
    private Context context;
    private TextView questions;
    private ImageView imageView;
    private Button yesbutton;
    private Button nobutton;


    public ToysViewHolder(View itemView) {
        super(itemView);

        questions = (TextView) itemView.findViewById(R.id.toys_questions);
        imageView = (ImageView) itemView.findViewById(R.id.toys_imageview);
        yesbutton = (Button) itemView.findViewById(R.id.yes_button);
        nobutton = (Button) itemView.findViewById(R.id.no_button);




    }


    public void onBind(Toys toy) {
        imageView.setImageResource(toy.getImageView());
//        Picasso.with(itemView.getContext()).load(toy.getImageView()).into(imageView);

    }


}
