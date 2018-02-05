package com.from2112.collapsingdemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by sun on 2018/2/3.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    //由于页面已经固定,故这里把Adapter需要的fragment提前创建
    private Fragment[] mFragments = new Fragment[]{new FirstFragment(), new ClassifFragment(), new ClassifFragment(),new ClassifFragment(),new ClassifFragment()};

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments[position];
    }

    @Override
    public int getCount() {
        return 5;
    }
}
