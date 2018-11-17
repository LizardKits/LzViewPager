package com.lizardkits.demo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lizardkits.lzviewpager.LzViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private LzViewPager mLzViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLzViewPager = findViewById(R.id.viewpager);

        final List<Fragment> fragments = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            TestFragment fragment = new TestFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("position", i);
            fragment.setArguments(bundle);
            fragments.add(fragment);
        }

        mLzViewPager.setOffscreenPageLimit(0); // 设置ViewPager缓存页数（0为不缓存）
        mLzViewPager.setScrollDuration(100); // 设置ViewPager翻页时长（速度）
        mLzViewPager.resetScrollDuration(); // 使用默认翻页速度
        mLzViewPager.setAdapter(new FragmentStatePagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }
        });

    }
}
