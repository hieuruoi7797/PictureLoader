package com.example.kithuat88.pictrueloader.screen.animals;

import android.content.ClipData;

import com.example.kithuat88.pictrueloader.BasePresenter;
import com.example.kithuat88.pictrueloader.BaseView;
import com.example.kithuat88.pictrueloader.data.model.ItemImage;

import java.util.List;

public interface AnimalContract {
    interface Presenter {
        void loadImage();
    }

    interface View {
        void showImage(List<ItemImage> images);
    }
}
