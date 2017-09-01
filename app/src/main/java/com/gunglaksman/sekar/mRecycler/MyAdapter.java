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

public class MyAdapter extends RecyclerView.Adapter<MyHolder>
{

    Context c;
    String[] materials;

    public MyAdapter(Context c, String[] materials) {
        this.c = c;
        this.materials = materials;
    }

    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.model,parent, false);
        return new MyHolder(v);
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.nametxt.setText(materials[position]);

    }

    @Override
    public int getItemCount() {
        return materials.length;
    }
}
