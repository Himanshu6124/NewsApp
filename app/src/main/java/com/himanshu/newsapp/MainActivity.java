package com.himanshu.newsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem mhome,mscience,mtech,mentertainment,msport,mhealth;
    ViewPager viewPager;
    String api = "256a5e14ab23406985993a2171d51235";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        mhome =findViewById(R.id.home);
        mscience =findViewById(R.id.science);
        mtech =findViewById(R.id.technology);
        mentertainment =findViewById(R.id.entertainment);
        msport =findViewById(R.id.sports);
        mhealth=findViewById(R.id.health);
        viewPager = findViewById(R.id.fragmentcontainer);
        tabLayout =findViewById(R.id.include);

        PagerAdapter pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 6);  //behaviour is no of tabs
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {           //clicking on tab
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0 || tab.getPosition()==1 ||tab.getPosition()==2 ||tab.getPosition()==3 ||tab.getPosition()==4 ||tab.getPosition()==5 )
                {
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }

}