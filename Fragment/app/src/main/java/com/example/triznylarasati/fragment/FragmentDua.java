package com.example.triznylarasati.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

public class FragmentDua extends Fragment {
    TextView nama_view, pass_view, email_view;

    @Override
        public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View view = inflater.inflate(R.layout.activity_fragment_dua, container, false);
            nama_view = (TextView) view.findViewById(R.id.nama_view);
            pass_view = (TextView) view.findViewById(R.id.pass_view);
            email_view = (TextView) view.findViewById(R.id.email_view);

            Bundle bundle = getArguments();
            //jika bundle tidak bernilai null, maka view fragment kedua akan diisi dgn data
            if (bundle != null) {
                if(bundle.containsKey("Nama")) {
                    nama_view.setText(bundle.getString("Nama"));
                }
                if (bundle.containsKey("Password")) {
                    pass_view.setText(bundle.getString("Password"));
                }
                if(bundle.containsKey("Email")) {
                    email_view.setText(bundle.getString("Email"));
                }
            }
            return view;
        }
    }
