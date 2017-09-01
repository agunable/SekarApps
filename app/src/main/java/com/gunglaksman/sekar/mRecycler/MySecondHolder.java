package com.gunglaksman.sekar.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.gunglaksman.sekar.R;

import org.w3c.dom.Text;

/**
 * Created by Laksman on 9/1/2017.
 */

public class MySecondHolder extends RecyclerView.ViewHolder{

    TextView nametxt;

    public MySecondHolder(View itemView) {
        super(itemView);

        nametxt = (TextView) itemView.findViewById(R.id.subJudul);

    }
}
