package com.lizardkits.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 创建者：GitLqr
 * 描述：测试Fragment
 */
public class TestFragment extends Fragment {

    private static final int[] sColors = {Color.RED, Color.GREEN, Color.BLUE};
    private TextView mTextView;
    private int mPosition;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mPosition = getArguments().getInt("position");
        Log.e("lqr", "TestFragment " + mPosition + " onCreate");
        mTextView = new TextView(getContext());
        mTextView.setText("posi : " + mPosition);
        mTextView.setBackgroundColor(sColors[mPosition]);
        return mTextView;
        // return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e("lqr", "TestFragment " + mPosition + " onDestroyView");
    }
}
