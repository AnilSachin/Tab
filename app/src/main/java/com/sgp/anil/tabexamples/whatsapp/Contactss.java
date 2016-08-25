package com.sgp.anil.tabexamples.whatsapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sgp.anil.tabexamples.R;

/**
 * Created by Anil on 09-06-2016.
 */
public class Contactss extends Fragment {
    public Contactss() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.contacts, container, false);
    }
}
