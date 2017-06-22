package com.zielonkatourguide.zielonkatourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class TourGuideFragmentPagerAdapter extends FragmentPagerAdapter {


    private String tabTitles[];

    public TourGuideFragmentPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        tabTitles = new String[]{
                context.getString(R.string.tab_monuments),
                context.getString(R.string.tab_restaurants),
                context.getString(R.string.tab_transport),
                context.getString(R.string.tab_hotels)};
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return new MonumentsFragment();
        else if (position == 1)
            return new FoodFragment();
        else if (position == 2)
            return new TransportFragment();
        else
            return new HotelsFragment();
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
