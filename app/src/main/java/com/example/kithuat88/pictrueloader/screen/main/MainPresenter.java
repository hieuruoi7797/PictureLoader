package com.example.kithuat88.pictrueloader.screen.main;

public class MainPresenter implements MainContract.Presenter{

    private MainContract.View mView;
    public MainPresenter(MainContract.View view){
        mView = view;
    }
    @Override
    public void start() {
        mView.setPresenter(this);
    }

    @Override
    public void loadPicture() {

    }

}
