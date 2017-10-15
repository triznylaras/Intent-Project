package com.example.triznylarasati.viewpager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class ViewPagerAdapter extends FragmentStatePagerAdapter {
    public static int PAGER_LENGTH = 3 ;

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int arg0) {
        return CustomPager.create(arg0);
    }

    @Override
    public int getCount() {
        return PAGER_LENGTH;
    }
}
