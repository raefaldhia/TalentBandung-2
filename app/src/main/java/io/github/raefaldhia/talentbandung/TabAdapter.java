package io.github.raefaldhia.talentbandung;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import io.github.raefaldhia.talentbandung.Example1Fragment;
import io.github.raefaldhia.talentbandung.Example2Fragment;

/**
 * Created by raefaldhia on 10/24/17.
 */

public class TabAdapter extends FragmentPagerAdapter {
    public Example1Fragment first;
    public Example2Fragment second;

    public TabAdapter(FragmentManager fm) {
        super(fm);

        first = new Example1Fragment();
        second = new Example2Fragment();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0:
            {
                return (first);
            }
            case 1: {
                return (second);

            }
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
