package com.oushangfeng.pinneddemo;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.oushangfeng.pinneddemo.adapter.HostMainTabPageAdapter;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private ArrayList mTabFragments;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ViewPager vp = findViewById(R.id.viewpager);
        mTabFragments = new ArrayList();
        mTabFragments.add(new MyFragment());
        mTabFragments.add(new MyFragment());
        mTabFragments.add(new MyFragment());
        vp.setAdapter(new HostMainTabPageAdapter(getSupportFragmentManager(),mTabFragments));
    }
}
