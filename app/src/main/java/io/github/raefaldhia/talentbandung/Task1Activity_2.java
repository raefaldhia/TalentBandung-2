package io.github.raefaldhia.talentbandung;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by raefaldhia on 10/26/17.
 */

public class Task1Activity_2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_task_1_2);

        ImageView taskNavigation_imgBack = (ImageView)findViewById(R.id.taskNavigation_imgBack);
        taskNavigation_imgBack.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        TextView task_1_textView = (TextView)findViewById(R.id.task_1_textView);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            task_1_textView.setText(bundle.getString("username"));
        }
    }
}
