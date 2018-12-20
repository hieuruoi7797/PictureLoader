package com.example.kithuat88.pictrueloader.screen.animals;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kithuat88.pictrueloader.R;
import com.example.kithuat88.pictrueloader.data.model.ItemImage;

import java.util.List;

public class AnimalFragment extends Fragment implements AnimalContract.View, AnimalAdapter.OnImageListener{
    private Context mContext;
    private AnimalContract.Presenter mPresenter;
    private RecyclerView mRecyclerView;
    public AnimalAdapter mAnimalAdapter;

    public AnimalFragment() {
    }

    public AnimalFragment newInstance(){
        AnimalFragment animalFragment = new AnimalFragment();
        return animalFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_animal, container, false);
        mContext = getContext();
        mRecyclerView = view.findViewById(R.id.recycler_animal);
        setupUI(container);

        mPresenter.loadImage();
        return view;
    }

    private void setupUI(ViewGroup container) {
        GridLayoutManager mGridLayoutManager;
        mGridLayoutManager = new GridLayoutManager(getContext(), 2,
                GridLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(mGridLayoutManager);
        mAnimalAdapter = new AnimalAdapter(null,container.getContext());
        mRecyclerView.setAdapter(mAnimalAdapter);
        mAnimalAdapter.setOnImageClickListener(this);
    }


    @Override
    public void showImage(List<ItemImage> images) {

    }

    @Override
    public void onImageSelected(String url) {

    }
}
