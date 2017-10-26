package io.github.raefaldhia.talentbandung;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by raefaldhia on 10/26/17.
 */

public class Task2Activity extends AppCompatActivity {
    TextView task_2_textView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_task_2);

        ImageView taskNavigation_imgBack = (ImageView)findViewById(R.id.taskNavigation_imgBack);
        taskNavigation_imgBack.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        task_2_textView = (TextView)findViewById(R.id.task_2_textView);
        Button task_2_btnChange = (Button)findViewById(R.id.task_2_btnChange);
        task_2_btnChange.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Task2Activity.this, Task2Activity_2.class);
                startActivityForResult(intent, 1);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1 && resultCode == RESULT_OK)
        {
            task_2_textView.setText(data.getStringExtra("text"));
        }
    }
}
