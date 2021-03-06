package com.rinadhiputra.muhammadrinadhiputra_1202152162_modul6;

/**
 * Created by ASUS on 01/04/2018.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;



public class PagerAdapter extends FragmentStatePagerAdapter {

    private int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int mNumOfTabs) {
        super(fm);
        this.mNumOfTabs = mNumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new PostsFragment();
            case 1:
                return new MyPostFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}