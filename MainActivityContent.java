package com.test.testy2;

        import android.content.Intent;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.TabLayout;
        import android.support.v4.view.ViewPager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;

        import com.test.testy2.tabs_fragments.TabFragmentOne;
        import com.test.testy2.tabs_fragments.TabFragmentThree;
        import com.test.testy2.tabs_fragments.TabFragmentTwo;

public class MainActivityContent extends AppCompatActivity {

    private ViewPager viewPager;
    private TabLayout tabLayout;
    // where tabIcons are to be set
    private int[] tabIcons = {R.drawable.ic_profile, R.drawable.ic_lost, R.drawable.ic_found};

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_content);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        // where icon is to be designed from tabIcon arraylist
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.findAddButton);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent foundIntent = new Intent(MainActivityContent.this, FoundActivity.class);
                startActivity(foundIntent);
            }
        });

        FloatingActionButton fab2 = (FloatingActionButton) findViewById(R.id.lostAddButton);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lostIntent = new Intent(MainActivityContent.this, LostActivity.class);
                startActivity(lostIntent);
            }
        });
    }



    private void setupViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(TabFragmentOne.newInstance("this data is for fragment 1"), "One");
        adapter.addFragment(TabFragmentTwo.newInstance("this data is for fragment 2"), "Two");
        adapter.addFragment(TabFragmentThree.newInstance("this data is for fragment 3"), "Three");
        viewPager.setAdapter(adapter);
    }
}