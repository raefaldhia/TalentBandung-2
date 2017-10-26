package io.github.raefaldhia.talentbandung;

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

public class Task1Activity extends AppCompatActivity {
    EditText task_1_inputText;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_task_1);

        ImageView taskNavigation_imgBack = (ImageView)findViewById(R.id.taskNavigation_imgBack);
        taskNavigation_imgBack.setOnClickListener(new ImageView.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        task_1_inputText = (EditText)findViewById(R.id.task_1_inputText);
        Button task_1_btnLogin = (Button)findViewById(R.id.task_1_btnLogin);
        task_1_btnLogin.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Task1Activity.this, Task1Activity_2.class);
                intent.putExtra("username", task_1_inputText.getText().toString());

                startActivity(intent);
            }
        });
    }
}
