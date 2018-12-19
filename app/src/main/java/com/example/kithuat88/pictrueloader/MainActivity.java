package com.example.kithuat88.pictrueloader;

import android.annotation.SuppressLint;
import android.graphics.Color;
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
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public android.support.v4.app.Fragment getItem(int position) {
            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position){
            switch (position){
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
            }
            return null;
        }
    }

    @SuppressLint("ValidFragment")
    private static class PlaceholderFragment extends Fragment {
        private  static final String KEY_COLOR = "key_color";

        public static Fragment newInstance(int color) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(KEY_COLOR, color);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            ConstraintLayout constraintLayout = rootView.findViewById(R.id.cl_fragment);
            TextView textView = rootView.findViewById(R.id.section_label);

            switch (getArguments().getInt(KEY_COLOR)){
                case 1:
                    constraintLayout.setBackgroundColor(Color.GREEN);
                    textView.setText("Fteam GREEN");
                    break;
                case 2:
                    constraintLayout.setBackgroundColor(Color.RED);
                    textView.setText("Fteam RED");
                    break;
                case 3:
                    constraintLayout.setBackgroundColor(Color.YELLOW);
                    textView.setText("Fteam YELLOW");
                    break;
                default:
                    constraintLayout.setBackgroundColor(Color.GREEN);
                    textView.setText("Fteam GREEN");
                    break;

            }
            return  rootView;
        }
    }
}
