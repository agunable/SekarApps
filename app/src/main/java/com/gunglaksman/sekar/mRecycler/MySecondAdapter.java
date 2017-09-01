package com.gunglaksman.sekar.mRecycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gunglaksman.sekar.R;

/**
 * Created by Laksman on 9/1/2017.
 */

public class MySecondAdapter extends RecyclerView.Adapter<MySecondHolder>
{

    Context c;
    String[] subjudul;

    public MySecondAdapter(Context c, String[] materials) {
        this.c = c;
        this.subjudul = subjudul;
    }

    @Override
    public MySecondHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent, false);
        return new MySecondHolder(v);
    }

    @Override
    public void onBindViewHolder(MySecondHolder holder, int position) {
        holder.nametxt.setText(subjudul[position]);

    }

    @Override
    public int getItemCount() {
        return subjudul.length;
    }
}
