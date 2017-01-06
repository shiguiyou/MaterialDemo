package com.shiguiyou.materialdemo;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.shiguiyou.materialdemo.adapter.ViewPagerAdapter;
import com.shiguiyou.materialdemo.fragment.Tab1Fragment;
import com.shiguiyou.materialdemo.fragment.Tab2Fragment;
import com.shiguiyou.materialdemo.fragment.Tab3Fragment;

public class TabsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabs);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Material Style Tabs");

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        setupViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(Tab1Fragment.newInstance(), "One");
        adapter.addFrag(Tab2Fragment.newInstance(), "Two");
        adapter.addFrag(Tab3Fragment.newInstance(), "Three");
        viewPager.setAdapter(adapter);
    }
}
