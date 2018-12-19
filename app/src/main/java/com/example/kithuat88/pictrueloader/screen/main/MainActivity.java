package com.example.kithuat88.pictrueloader.screen.main;

import android.annotation.SuppressLint;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.kithuat88.pictrueloader.R;
import com.example.kithuat88.pictrueloader.screen.home.HomeFragment;

public class MainActivity extends AppCompatActivity implements MainContract.View,
TabLayout.OnTabSelectedListener{
    private FrameLayout mFrameLayoutContainFragments;
    private HomeFragment mHomeFragment;
    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        addFragment();
    }

    private void addFragment() {
        if (mHomeFragment == null){
            mHomeFragment = new HomeFragment();
        }
        getSupportFragmentManager().beginTransaction()
                .replace(mFrameLayoutContainFragments.getId(),mHomeFragment)
                .commit();
        mTabLayout = mHomeFragment.getmTabLayout();

    }

    private void initView() {
        mFrameLayoutContainFragments = findViewById(R.id.frame_fragment);
    }


    @Override
    public void onTabSelected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabUnselected(TabLayout.Tab tab) {

    }

    @Override
    public void onTabReselected(TabLayout.Tab tab) {

    }

    @Override
    public void showTabLayout() {
        mTabLayout.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideTabLayout() {
        mTabLayout.setVisibility(View.GONE);
    }

    @Override
    public void setPresenter(MainContract.Presenter presenter) {

    }

    @Override
    public void showPicture() {

    }

    @Override
    public void hidePicture() {

    }
}
