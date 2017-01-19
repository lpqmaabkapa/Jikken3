package com.example.lavie_z.jikken3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.StrictMode;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by LaVie_Z on 19/01/2017.
 */

public class AddTask extends Activity implements View.OnClickListener{

    Schedule task;

    EditText title;
    EditText explain;
    EditText priority;
    EditText requiredTime;

//	AutoScheduleArranger arranger = new AutoScheduleArranger();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_task);

        title = (EditText) findViewById(R.id.editText1);
        explain = (EditText) findViewById(R.id.editText2);
        priority = (EditText) findViewById(R.id.editText3);
        requiredTime =(EditText) findViewById(R.id.editText4);


        Intent intent = getIntent();
        if(intent != null){
            Toast.makeText(this, "項目をすべて入力してください", Toast.LENGTH_SHORT).show();
        }
    }

    Intent intent = getIntent();


    @Override
    public void onClick(View v) {

        String strTitle = title.getText().toString();
        String strExplain = explain.getText().toString();
        String strRequiredTime = requiredTime.getText().toString();

        if(strTitle.length() == 0
                || strExplain.length() == 0
                || strRequiredTime.length() == 0
                || isPriority(priority.getText().toString())
                ){
            Toast.makeText(this, "すべての項目を入力してください", Toast.LENGTH_SHORT).show();
        }
        else {
            task.isEvent = false;
            task.title = strTitle;
            task.explanation = strExplain;
            task.requiredTime = Integer.parseInt(strRequiredTime);
        }
    }



	//数字であるかを判定する
    public boolean isNumber(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

	//優先順位に合っているかを判定する
    public boolean isPriority(String num) {
        if(!isNumber(num)) {
            return false;
        }
        else{
            int intNum = Integer.parseInt(num);
            if(1 <= intNum && intNum <= 7) {
                return true;
            }
            else {
                return false;
            }
        }
    }


}
