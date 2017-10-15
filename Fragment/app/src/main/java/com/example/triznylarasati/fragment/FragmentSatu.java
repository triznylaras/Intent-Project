package com.example.triznylarasati.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class FragmentSatu extends Fragment {

    //class inflater untuk mengambil java object view dari layout yang dibuat
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_fragment_satu, container, false);
    }
}