package com.from2112.collapsingdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.TextView;

public class BootomNavigationActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNavigationView;
    private TextView             mTitle;
    private ViewPager            mViewPager;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_first:
                    mViewPager.setCurrentItem(0);
                    return true;
                case R.id.navigation_classif:
                    mViewPager.setCurrentItem(1);
                    return true;
                case R.id.navigation_made:
                    mViewPager.setCurrentItem(2);
                    return true;
                case R.id.navigation_shop_cart:
                    mViewPager.setCurrentItem(3);
                    return true;
                case R.id.navigation_Home:
                    mViewPager.setCurrentItem(4);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTitle = (TextView) findViewById(R.id.title);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.navigation);
        BottomNavigationViewHelper.disableShiftMode(mBottomNavigationView);
        mBottomNavigationView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        mViewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));
        // 为ViewPager添加页面改变事件
        mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                // 将当前的页面对应的底部标签设为选中状态
                mBottomNavigationView.getMenu().getItem(position).setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }


        });


    }


}
