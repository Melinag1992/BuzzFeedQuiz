package com.cq4.buzzfeedquiz.controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cq4.buzzfeedquiz.R;
import com.cq4.buzzfeedquiz.model.Toys;
import com.cq4.buzzfeedquiz.view.ToysViewHolder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by melina.gonzalez on 11/19/17.
 */

public class ToysAdapter extends RecyclerView.Adapter<ToysViewHolder>{



    private List<Toys>toys;

    public ToysAdapter(List<Toys>toys) {
        this.toys = toys;
    }



    @Override
    public ToysViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.toys_itemview, parent, false);
        return new ToysViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(ToysViewHolder holder, int position) {
        Toys toy = toys.get(position);
        holder.onBind(toy);
    }

    @Override
    public int getItemCount() {
        return toys.size();
    }


}
