package com.example.kithuat88.pictrueloader.screen.home;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.kithuat88.pictrueloader.screen.animals.AnimalFragment;
import com.example.kithuat88.pictrueloader.screen.flowers.FlowerFragment;
import com.example.kithuat88.pictrueloader.screen.wallpapers.WallpaperFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    public static final int TAB_SIZE = 3;

    @interface TabType {
        int WALLPAPER = 0;
        int ANIMAL = 1;
        int FLOWER = 2;
    }

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case TabType.WALLPAPER:
                return new WallpaperFragment();
            case TabType.ANIMAL:
                return new AnimalFragment();
            case TabType.FLOWER:
                return new FlowerFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return TAB_SIZE;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {

        switch (position) {
            case TabType.WALLPAPER:
                return "Wallpapers";
            case TabType.ANIMAL:
                return "Animals";
            case TabType.FLOWER:
                return "Flowers";
        }
        return getPageTitle(position);
    }
}

