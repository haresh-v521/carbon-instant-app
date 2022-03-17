package com.phononx.carbonvoice.adapter;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.phononx.carbonvoice.loginFragment.EmailFragment;
import com.phononx.carbonvoice.loginFragment.MobileFragment;

import org.jetbrains.annotations.NotNull;

public class LoginAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public LoginAdapter(Context context, int totalTabs) {
        super(null);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                MobileFragment mobileFragment = new MobileFragment();
                return mobileFragment;
            case 1:
                EmailFragment emailFragment = new EmailFragment();
                return emailFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
