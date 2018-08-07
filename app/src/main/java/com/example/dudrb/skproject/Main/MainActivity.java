package com.example.dudrb.skproject.Main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.dudrb.skproject.Admin.AdminMain;
import com.example.dudrb.skproject.R;
import com.example.dudrb.skproject.Worker.WorkerMain;

public class MainActivity extends Activity {

    EditText e1, e2;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1 = (EditText)findViewById(R.id.edit_id);
        e2 = (EditText)findViewById(R.id.edit_pwd);
        b1 = (Button)findViewById(R.id.login);

        startActivity(new Intent(this, WorkerMain.class));

    }
    public void onClickLogin(View v){
        Intent intent = new Intent(this,AdminMain.class);

        startActivity(intent);
    }
}
