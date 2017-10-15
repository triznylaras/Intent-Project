package com.example.triznylarasati.intentworkflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Button;

public class konten_pertama extends AppCompatActivity {
    //membuat variabel widget
    Button input_btn;
    EditText nama_ins, pass_ins, tanggal_ins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konten_pertama);

        //pemanggilan id widget
        input_btn = (Button) findViewById(R.id.input_btn);
        nama_ins = (EditText) findViewById(R.id.nama_ins);
        pass_ins = (EditText) findViewById(R.id.pass_ins);
        tanggal_ins = (EditText) findViewById(R.id.tanggal_ins);

        //method saat tombol submit diklik
        input_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_obj = new Intent(konten_pertama.this, konten_kedua.class);//inisiasi objek intent
                intent_obj.putExtra("Nama", nama_ins.getText().toString());//mengambil teks lalu diubah menjadi string
                intent_obj.putExtra("Password", pass_ins.getText().toString());
                intent_obj.putExtra("TTL", tanggal_ins.getText().toString());
                konten_pertama.this.startActivity(intent_obj);
                konten_pertama.this.finish();
            }
        });
    }
}
