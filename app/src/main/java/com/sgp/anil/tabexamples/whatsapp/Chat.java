package com.sgp.anil.tabexamples.whatsapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sgp.anil.tabexamples.Model.Example;
import com.sgp.anil.tabexamples.R;
import com.sgp.anil.tabexamples.adapter.ActorAdapteer;
import com.sgp.anil.tabexamples.serverside.SerAPI;
import com.sgp.anil.tabexamples.serverside.ServiceGenerator;

import java.util.List;

import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Anil on 09-06-2016.
 */
public class Chat extends Fragment {
    RecyclerView recyclerView;
    List<Example> list;
    ActorAdapteer actorAdapteer;
    SerAPI serAPI;
    Example example;

    public Chat() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.chat, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

                loadNewsFeed();

    }

    void loadNewsFeed() {
        serAPI = ServiceGenerator.create(SerAPI.class);
        retrofit2.Call<Example> call = serAPI.getactorsdata();
        call.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(retrofit2.Call<Example> call, Response<Example> response) {
                example = response.body();
                // Log.v("Profile Name",""+example.getNewsfeeds().get(1).getCommentdata().get(0).getCommentText());
                recyclerView = (RecyclerView) getActivity().findViewById(R.id.myrex2);
                recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                actorAdapteer = new ActorAdapteer(example, getActivity());
                recyclerView.setAdapter(actorAdapteer);

                actorAdapteer.notifyDataSetChanged();
            }

            @Override
            public void onFailure(retrofit2.Call<Example> call, Throwable t) {

            }
        });


    }
}
