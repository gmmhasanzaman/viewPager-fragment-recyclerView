package com.example.viewpagerfragment;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.viewpagerfragment.Adapter.ViewPagerAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.homeToolBarId);
        toolbar.setTitle("Home");
        setSupportActionBar(toolbar);

        viewPager = findViewById(R.id.viewPagerId);
        addTabs(viewPager);

        tabLayout = findViewById(R.id.tabLayoutId);
        tabLayout.setupWithViewPager(viewPager);

        //Set Icon
        tabLayout.getTabAt(0).setIcon(R.drawable.ic_call_black_24dp);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_contact_black_24dp);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_favorite_border_black_24dp);

        //Remove shadow from the actionbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setElevation(0);



    }

    private void addTabs(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager(),MODE_PRIVATE);
        adapter.addFrag(new FirstFragment(), "Call");
        adapter.addFrag(new ContactFragment(), "Contact");
        adapter.addFrag(new SecondFragment(), "Favorite");
        viewPager.setAdapter(adapter);

    }

}
