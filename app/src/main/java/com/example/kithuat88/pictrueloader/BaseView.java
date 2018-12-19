package com.example.kithuat88.pictrueloader;

public interface BaseView<T> {
    void setPresenter(T presenter);
    void showPicture();
    void hidePicture();
}
