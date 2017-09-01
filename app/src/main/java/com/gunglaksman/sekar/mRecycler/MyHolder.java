package com.gunglaksman.sekar.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.gunglaksman.sekar.R;

import org.w3c.dom.Text;

/**
 * Created by Laksman on 9/1/2017.
 */

public class MyHolder extends RecyclerView.ViewHolder{

    TextView nametxt;

    public MyHolder(View itemView) {
        super(itemView);

        nametxt = (TextView) itemView.findViewById(R.id.nameTxt);

    }
}
