package io.github.raefaldhia.talentbandung;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;

/**
 * Created by raefaldhia on 10/26/17.
 */

public class Task3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_task_3);

        ImageView taskNavigation_imgBack = (ImageView)findViewById(R.id.taskNavigation_imgBack);
        taskNavigation_imgBack.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.task_3_frameLayout, new Example1Fragment())
                .commit();

        Button task_3_btn1 = (Button)findViewById(R.id.task_3_btn1);
        task_3_btn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.task_3_frameLayout, new Example1Fragment())
                        .commit();
            }
        });
        Button task_3_btn2 = (Button)findViewById(R.id.task_3_btn2);
        task_3_btn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.task_3_frameLayout, new Example2Fragment())
                        .commit();
            }
        });
    }
}
