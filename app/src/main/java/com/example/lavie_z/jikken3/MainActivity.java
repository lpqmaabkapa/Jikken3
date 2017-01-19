package com.example.lavie_z.jikken3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button addScheduleBtn;
    Button deleteScheduleBtn;
    Button changeProgressBtn;

	AutoScheduleArranger arranger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addScheduleBtn = (Button) findViewById(R.id.addScheduleBtn);
        deleteScheduleBtn = (Button) findViewById(R.id.deleteScheduleBtn);
        changeProgressBtn = (Button) findViewById(R.id.changeProgressBtn);

        addScheduleBtn.setOnClickListener(this);
        deleteScheduleBtn.setOnClickListener(this);
        changeProgressBtn.setOnClickListener(this);

		arranger = new AutoScheduleArranger();

    }


    @Override
    public void onClick(View v) {

        /* スケジュール追加 */
        if(v == addScheduleBtn) {

            Intent intentAddTask = new Intent();
            intentAddTask.setClass(this, com.example.lavie_z.jikken3.AddTask.class);
//            startActivity(intentAddTask);

        }

        /* スケジュール削除 */
        if(v == deleteScheduleBtn) {

            Intent intentAddTask = new Intent(this, AddTask.class);
            startActivity(intentAddTask);

        }

        /* スケジュール追加 */
        if(v == addScheduleBtn) {

            Intent intentAddTask = new Intent(this, AddTask.class);
            startActivity(intentAddTask);

        }

    }
}
