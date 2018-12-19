package com.example.kithuat88.pictrueloader.screen.main;

import com.example.kithuat88.pictrueloader.BasePresenter;
import com.example.kithuat88.pictrueloader.BaseView;

public interface MainContract {
    interface View extends BaseView<Presenter> {
        void showTabLayout();

        void hideTabLayout();
    }

    interface Presenter extends BasePresenter {

    }
}
