package com.dingli.selfadaptionlayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;

import com.dingli.selfadaptionlayout.R;
import com.dingli.selfadaptionlayout.fragment.SimpleFragment;
import com.dingli.selfadaptionlayout.widget.AutoLayoutActivity;


/**
 * Created by dingli on 2015/12/28.
 */
public class CategoryActivity extends AutoLayoutActivity {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    private String[] mTabTitles = new String[]
            {"单个UI", "正方形"};


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);


        mTabLayout = (TabLayout) findViewById(R.id.id_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.id_viewpager);

        mViewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager())
        {
            @Override
            public Fragment getItem(int i)
            {
                return new SimpleFragment();
            }

            @Override
            public CharSequence getPageTitle(int position)
            {

                return mTabTitles[position];
            }

            @Override
            public int getCount()
            {
                return mTabTitles.length;
            }
        });


        mTabLayout.setupWithViewPager(mViewPager);
    }


}
