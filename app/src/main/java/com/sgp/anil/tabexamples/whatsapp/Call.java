package com.sgp.anil.tabexamples.whatsapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sgp.anil.tabexamples.Model.Datastore;
import com.sgp.anil.tabexamples.R;
import com.sgp.anil.tabexamples.adapter.MyRecAdapter;
import com.sgp.anil.tabexamples.serverside.SerAPI;
import com.sgp.anil.tabexamples.serverside.ServiceGen;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Anil on 09-06-2016.
 */
public class Call extends Fragment {
    RecyclerView recyclerView;
    MyRecAdapter myRecAdapter;
    SerAPI serAPI;
    ArrayList list;
    Datastore datastore;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.call, container, false);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        list = new ArrayList();
        datastore = new Datastore();

        serAPI = ServiceGen.createservice(SerAPI.class);


        recyclerView = (RecyclerView) getActivity().findViewById(R.id.myrecid);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        myRecAdapter = new MyRecAdapter(getActivity(), list);
        recyclerView.setAdapter(myRecAdapter);
        retrofit2.Call<List<Datastore>> call = serAPI.alldata();
        call.enqueue(new Callback<List<Datastore>>() {
            @Override
            public void onResponse(retrofit2.Call<List<Datastore>> call, Response<List<Datastore>> response) {
                list.addAll(response.body());
                myRecAdapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(retrofit2.Call<List<Datastore>> call, Throwable t) {

            }
        });
    }
}
