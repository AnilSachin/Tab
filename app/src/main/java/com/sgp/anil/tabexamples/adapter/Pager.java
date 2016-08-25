package com.sgp.anil.tabexamples.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;


//Extending FragmentStatePagerAdapter
public class Pager extends FragmentStatePagerAdapter {

    ArrayList<Fragment> fragmentArrayList=new ArrayList<>();
    ArrayList<String>tittlelist=new ArrayList<>();

    public Pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArrayList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArrayList.size();
    }

    public void addFragment(Fragment fragment,String tittle){

        fragmentArrayList.add(fragment);
        tittlelist.add(tittle);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tittlelist.get(position);
    }
}
