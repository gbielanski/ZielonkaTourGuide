package com.zielonkatourguide.zielonkatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class TourGuideFragmentPagerAdapter extends FragmentPagerAdapter {

    Context mContext;

    private String tabTitles[];

    public TourGuideFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
        tabTitles = new String[] {
                mContext.getString(R.string.tab_info),
                "Colors",
                "Family",
                "Phrases" };
    }

    @Override
    public Fragment getItem(int position) {
        return new InfoFragment();
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
