package com.example.dudrb.skproject.Admin.DutyManagement;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dudrb.skproject.R;

public class DutyMgmt extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_duty_mgmt);

        b1 = (Button)findViewById(R.id.btn_location);
    }

    public void onClickLocationAdjust(View v){
        startActivity(new Intent(this, PersonLocationAdjust.class));
    }
}
