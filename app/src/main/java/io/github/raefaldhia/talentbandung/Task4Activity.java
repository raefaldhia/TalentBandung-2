package io.github.raefaldhia.talentbandung;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by raefaldhia on 10/26/17.
 */

public class Task4Activity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabLayout;
    public Example1Fragment first;
    public Example2Fragment second;
    TabLayout.Tab content_1, content_2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_task_4);

        ImageView taskNavigation_imgBack = (ImageView)findViewById(R.id.taskNavigation_imgBack);
        taskNavigation_imgBack.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        viewPager = (ViewPager)findViewById(R.id.task_4_viewPager);
        tabLayout = (TabLayout)findViewById(R.id.task_4_tabLayout);

        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager());
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);

        first = (Example1Fragment) tabAdapter.getItem(0);
        second = (Example2Fragment) tabAdapter.getItem(1);

        content_1 = tabLayout.getTabAt(0);
        content_2 = tabLayout.getTabAt(1);
        viewPager.setOffscreenPageLimit(2);

        TextView tabotne = (TextView) LayoutInflater.from(this).inflate(R.layout.itemtab, null);
        tabotne.setText("content 1");
        content_1.setCustomView(tabotne);

        TextView tabtwo = (TextView) LayoutInflater.from(this).inflate(R.layout.itemtab, null);
        tabtwo.setText("content 2");
        content_2.setCustomView(tabtwo);
    }
}
