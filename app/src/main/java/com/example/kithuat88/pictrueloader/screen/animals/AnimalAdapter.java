package com.example.kithuat88.pictrueloader.screen.animals;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.kithuat88.pictrueloader.R;
import com.example.kithuat88.pictrueloader.data.model.ItemImage;

import java.util.List;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {
    private List<ItemImage> mAnimalList;
    private Context context;
    private OnImageListener mListener;
    private LayoutInflater mInflater;


    public AnimalAdapter(List<ItemImage> mAnimalList, Context context) {
        this.mAnimalList = mAnimalList;
        this.context = context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public void setmListener(OnImageListener mListener) {
        this.mListener = mListener;
    }

    public void setmInflater(LayoutInflater mInflater) {
        this.mInflater = mInflater;
    }

    public Context getContext() {
        return context;
    }

    public OnImageListener getmListener() {
        return mListener;
    }

    public LayoutInflater getmInflater() {
        return mInflater;
    }

    public List<ItemImage> getmAnimalList() {
        return mAnimalList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (mInflater == null){
            mInflater = LayoutInflater.from(viewGroup.getContext());
        }
        View view = mInflater.inflate(R.layout.item_image, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final ItemImage image = mAnimalList.get(i);
        viewHolder.bindView(image, mListener);
    }

    @Override
    public int getItemCount() {
        return mAnimalList != null ? mAnimalList.size() : 0;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mAnimalImage;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mAnimalImage = itemView.findViewById(R.id.item_image);
        }

        public void bindView(final ItemImage itemImage, final OnImageListener listener){
            mAnimalImage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onImageSelected(itemImage.getmImageUrl());
                }
            });
        };
    }

    public void setmAnimalList (List<ItemImage> images){
        this.mAnimalList = images;
        notifyDataSetChanged();
    }

    public void setOnImageClickListener(OnImageListener listener) {
        mListener = listener;
    }

    public interface OnImageListener {
        void onImageSelected(String url);
    }
}
