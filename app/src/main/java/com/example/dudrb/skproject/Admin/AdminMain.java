package com.example.dudrb.skproject.Admin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.dudrb.skproject.Admin.AttendCheck.AttendList;
import com.example.dudrb.skproject.Admin.DutyManagement.DutyMgmt;
import com.example.dudrb.skproject.R;

public class AdminMain extends AppCompatActivity {

    TextView e3,e4;
    Button b1, b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_main);

        e3 = (TextView) findViewById(R.id.admin_check);
        e4 = (TextView) findViewById(R.id.admin_mgmt);

        b1 = (Button)findViewById(R.id.admin_b1);
        b2 = (Button)findViewById(R.id.admin_b2);


    }
    public void onClickAttenList(View v){
        startActivity(new Intent(this, AttendList.class) );
    }
    public void onClickDutyMgmt(View v){
        startActivity(new Intent(this, DutyMgmt.class) );
    }
}
