package com.sgp.anil.tabexamples.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sgp.anil.tabexamples.Model.Datastore;
import com.sgp.anil.tabexamples.R;

import java.util.List;

/**
 * Created by Anil on 07-06-2016.
 */
public class MyRecAdapter extends RecyclerView.Adapter<MyRecAdapter.VH> {
    Context context;
    List<Datastore> list;

    public MyRecAdapter(Context context, List list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public MyRecAdapter.VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyRecAdapter.VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.data_bind, parent, false));
    }


    @Override
    public void onBindViewHolder(MyRecAdapter.VH holder, int position) {
        String lname = list.get(position).getLanme();
        holder.t1.setText(list.get(position).getFname());
        holder.t2.setText(lname);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView t1, t2;

        public VH(View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.list_title);
            t2 = (TextView) itemView.findViewById(R.id.list_desc);
        }
    }
}
