package com.sgp.anil.tabexamples.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.mikhaellopez.circularimageview.CircularImageView;
import com.sgp.anil.tabexamples.Model.Example;
import com.sgp.anil.tabexamples.R;

/**
 * Created by Anil on 09-06-2016.
 */
public class ActorAdapteer extends RecyclerView.Adapter<ActorAdapteer.VH> {
    Example list;
    Context context;

    public ActorAdapteer(Example list, Context context) {
        this.list = list;
        this.context = context;
    }


    @Override
    public ActorAdapteer.VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ActorAdapteer.VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.data_bind, parent, false));
    }

    @Override
    public void onBindViewHolder(ActorAdapteer.VH holder, int position) {
        String spoucename = list.getActors().get(position).getSpouse();
        holder.textView.setText(list.getActors().get(position).getName());


        holder.circularImageView.addShadow();
        Glide.with(context).load(list.getActors().get(position).getImage()).skipMemoryCache(false).listener(new RequestListener<String, GlideDrawable>() {
            @Override
            public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                return false;
            }

            @Override
            public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                return false;
            }
        }).into(holder.circularImageView);

    }

    @Override
    public int getItemCount() {
        return list.getActors().size();
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView textView;
        CircularImageView circularImageView;

        public VH(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.list_title);
            circularImageView = (CircularImageView) itemView.findViewById(R.id.list_avatar);
        }
    }
}
