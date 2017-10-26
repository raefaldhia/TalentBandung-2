package io.github.raefaldhia.talentbandung;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by raefaldhia on 10/26/17.
 */

public class Task5Activity extends AppCompatActivity {
    ArrayList<String> listItems =new ArrayList<String>();
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_task_5);

        ImageView taskNavigation_imgBack = (ImageView)findViewById(R.id.taskNavigation_imgBack);
        taskNavigation_imgBack.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button btnAdd = (Button)findViewById(R.id.task5_btnAdd);
        btnAdd.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Task5Activity.this, Task5Activity_2.class);
                startActivityForResult(intent, 1);
            }
        });

        ListView listView = (ListView)findViewById(R.id.task5_listView);

        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.textview, listItems);
        listView.setAdapter(adapter);

        listItems.add("Raefaldhi");
        adapter.notifyDataSetChanged();
        listItems.add("Amartya");
        adapter.notifyDataSetChanged();
        listItems.add("Junior");
        adapter.notifyDataSetChanged();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK)
        {
            listItems.add(data.getStringExtra("text"));
            adapter.notifyDataSetChanged();
        }
    }
}
