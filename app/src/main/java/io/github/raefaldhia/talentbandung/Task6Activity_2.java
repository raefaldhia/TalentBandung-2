package io.github.raefaldhia.talentbandung;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by raefaldhia on 10/26/17.
 */

public class Task6Activity_2 extends AppCompatActivity {
    EditText task_6_inputText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_task_6_2);

        ImageView taskNavigation_imgBack = (ImageView)findViewById(R.id.taskNavigation_imgBack);
        taskNavigation_imgBack.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        task_6_inputText = (EditText)findViewById(R.id.task_6_inputText);
        Button task_6_btnChange = (Button)findViewById(R.id.task_6_btnChange);
        task_6_btnChange.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("text", task_6_inputText.getText().toString());

                setResult(Activity.RESULT_OK, intent);

                finish();
            }
        });
    }
}
