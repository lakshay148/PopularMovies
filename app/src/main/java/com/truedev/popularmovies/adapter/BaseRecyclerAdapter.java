package com.truedev.popularmovies.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.truedev.popularmovies.R;
import com.truedev.popularmovies.model.general.GeneralObject;

import java.util.ArrayList;

/**
 * Created by lakshaygirdhar on 21/3/16.
 */
public class BaseRecyclerAdapter extends RecyclerView.Adapter<BaseRecyclerAdapter.ViewHolder> {

    private ArrayList<Object> mObjects;
    private Context mContext;

    public BaseRecyclerAdapter(Context context,ArrayList<Object> objects){
        mContext = context;
        mObjects = objects;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.base_adapter,null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(mContext).load(((GeneralObject)mObjects.get(position)).getImagePath()).into(holder.ivMain);
        holder.tvTitle.setText(((GeneralObject)mObjects.get(position)).getTitle());
    }


    @Override
    public int getItemCount() {
        return mObjects.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView ivMain;
        private TextView tvTitle;

        public ViewHolder(View itemView) {
            super(itemView);
            ivMain = (ImageView) itemView.findViewById(R.id.ivMain);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
        }
    }
}
