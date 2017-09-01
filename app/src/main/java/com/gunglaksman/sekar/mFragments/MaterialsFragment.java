package com.gunglaksman.sekar.mFragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gunglaksman.sekar.R;
import com.gunglaksman.sekar.mRecycler.MyAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class MaterialsFragment extends Fragment {

    String[] materi={"Materi 1", "Materi 2", "Materi 3", "Materi 4", "Materi 5"};

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_materials,container,false);

        RecyclerView rv = (RecyclerView) rootView.findViewById(R.id.materialsRV);
        rv.setLayoutManager(new LinearLayoutManager(this.getActivity()));

        MyAdapter adapter = new MyAdapter(this.getActivity(),materi);
        rv.setAdapter(adapter);

        return rootView;
    }

}
