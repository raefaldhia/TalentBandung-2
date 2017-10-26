package io.github.raefaldhia.talentbandung;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        Button task_1 = (Button) findViewById(R.id.task_1);
        task_1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this, Task1Activity.class));
            }
        });

        Button task_2 = (Button) findViewById(R.id.task_2);
        task_2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this, Task2Activity.class));
            }
        });

        Button task_3 = (Button) findViewById(R.id.task_3);
        task_3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this, Task3Activity.class));
            }
        });

        Button task_4 = (Button) findViewById(R.id.task_4);
        task_4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this, Task4Activity.class));
            }
        });

        Button task_5 = (Button) findViewById(R.id.task_5);
        task_5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this, Task5Activity.class));
            }
        });

        Button task_6 = (Button) findViewById(R.id.task_6);
        task_6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(DashboardActivity.this, Task6Activity.class));
            }
        });
    }
}
