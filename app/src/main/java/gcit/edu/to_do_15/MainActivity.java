package gcit.edu.to_do_15;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;


import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    TabLayout tabLayout;
    Toolbar toolbar;
    ViewPager viewPager;
    pageAdapter pageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        TabLayout tabLayout= findViewById(R.id.layout);
        tabLayout.addTab(tabLayout.newTab().setText("First"));
        tabLayout.addTab(tabLayout.newTab().setText("Second"));
        tabLayout.addTab(tabLayout.newTab().setText("Third"));

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        ViewPager viewPager=findViewById(R.id.layout2);
        pageAdapter= new pageAdapter(getSupportFragmentManager(),tabLayout.getTabCount());
        viewPager.setAdapter(pageAdapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}