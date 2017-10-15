package com.example.triznylarasati.intentworkflow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;

public class konten_kedua extends AppCompatActivity {
    TextView nama_view, pass_view, ttl_view;
    Button back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konten_kedua);

        nama_view = (TextView)findViewById(R.id.nama_view);
        pass_view = (TextView)findViewById(R.id.pass_view);
        ttl_view = (TextView)findViewById(R.id.tanggal_view);
        back_btn = (Button) findViewById(R.id.back_btn);

        Intent intent_obj = getIntent();
        nama_view.setText(intent_obj.getStringExtra("Nama"));
        pass_view.setText(intent_obj.getStringExtra("Password"));
        ttl_view.setText(intent_obj.getStringExtra("TTL"));

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(konten_kedua.this, konten_pertama.class);
                konten_kedua.this.startActivity(intent);
                konten_kedua.this.finish();
            }
        });
    }
}

