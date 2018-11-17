package com.lizardkits.lzviewpager;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Author：GitLqr
 * Desc：比原生ViewPager更强大的ViewPager
 * <p>
 * 1、{@link #setOffscreenPageLimit(int)}无限制，最少可设置0个缓存页，即不缓存。（默认缓存页为0，与原生ViewPager不同，原生默认且最小为1，即最少会缓存1页，也就是至少会同时存在2页）
 * 2、支持自定义ViewPager翻页时长。调用{@link #setScrollDuration(int)}可自定义，调用{@link #resetScrollDuration()}可恢复默认翻页时长。
 */
public class LzViewPager extends V4ViewPagerExt{

    public LzViewPager(Context context) {
        super(context);
    }

    public LzViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}
