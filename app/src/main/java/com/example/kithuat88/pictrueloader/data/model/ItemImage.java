package com.example.kithuat88.pictrueloader.data.model;

import android.media.Image;

public class ItemImage {
    private String mImageUrl;
    private Image image;

    public ItemImage() {
    }

    public String getmImageUrl() {
        return mImageUrl;
    }

    public Image getImage() {
        return image;
    }

    public void setmImageUrl(String mImageUrl) {
        this.mImageUrl = mImageUrl;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}
