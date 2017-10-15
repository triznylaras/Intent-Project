package com.example.triznylarasati.fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menginstansiasi widget2
        Button login_btn = (Button) findViewById(R.id.login_btn);
        login_btn.setOnClickListener(new View.OnClickListener() {
        EditText nama_ins = (EditText) findViewById(R.id.nama_ins);
        EditText pass_ins = (EditText) findViewById(R.id.pass_ins);
        EditText email_ins = (EditText) findViewById(R.id.email_ins);
        String a = String.valueOf(nama_ins.getText());
        String b = String.valueOf(pass_ins.getText());
        String c = String.valueOf(email_ins.getText());

        //button login saat diklik
            public void onClick(View v) {
                if (v == findViewById(R.id.login_btn)) {
                    Fragment FragmentDua = new Fragment();
                    FragmentManager fm = getFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    Bundle bundle = new Bundle(); //menginisiasi bundle untuk menyimpan data string dari fragment satu
                    bundle.putString("Nama", a);
                    bundle.putString("Password", b);
                    bundle.putString("Email", c);
                    FragmentDua.setArguments(bundle);
                    ft.replace(R.id.fragment_place, FragmentDua); //mengganti tampilan menjadi fragment dua
                    ft.commit();

                }
            }
        });
    }
}
