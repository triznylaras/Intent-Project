package com.example.triznylarasati.viewpager;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    ViewPager viewPager ;
    Button back_btn, next_btn;
    ViewPagerAdapter viewPagerAdapter ;
    int page = 0 ; //page dimulai dari 0

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pembuatan nama-nama method
        initObject();
        initComponentViews();
        initConfigurationView();
        initOnImplementsView();
    }
    //method untuk inisiasi class viewpageradapter
    private void initObject(){
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
    }

    //method untuk pemanggilan id-id
    private void initComponentViews(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        back_btn = (Button) findViewById(R.id.back_btn);
        next_btn = (Button) findViewById(R.id.next_btn);

    }

    //method untuk menset adapter viewpager dengan viewpageradapter
    private void initConfigurationView(){
        viewPager.setAdapter(viewPagerAdapter);
    }

    //method untuk menset listener button2 di class ini
    private void initOnImplementsView(){
        back_btn.setOnClickListener(this);
        next_btn.setOnClickListener(this);
    }

    //method untuk
    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.back_btn:
                page -= 1;
                viewPager.setCurrentItem(page);
                if (page==0) { //jika ada di page 0 maka button back hilang
                    back_btn.setVisibility(Button.INVISIBLE);
                }else{
                    back_btn.setVisibility(Button.VISIBLE); //jika selain itu button back ada
                }
                break;

            case R.id.next_btn:
                page += 1;
                viewPager.setCurrentItem(page);
                if (page==2) { //jika ada di page terakhir maka button next hilang
                    next_btn.setVisibility(Button.INVISIBLE);
                }else{
                    next_btn.setVisibility(Button.VISIBLE); //jika selain itu button next ada
                }
                break;

            default:
                break;
        }
    }
}
