package com.from2112.collapsingdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * Created by sun on 2018/2/1.
 */






public class FirstFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_first,container,false);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
       CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout)view.findViewById(R.id.collasping_toolbar);
        toolbar.setTitle("");
//        ((AppCompatActivity) getActivity()). setSupportActionBar(toolbar);
//        ActionBar actionBar = ((AppCompatActivity) getActivity()). getSupportActionBar();
//        if (actionBar != null){
//            actionBar.setDisplayHomeAsUpEnabled(true);
//
//        }

        return view;
    }
}
