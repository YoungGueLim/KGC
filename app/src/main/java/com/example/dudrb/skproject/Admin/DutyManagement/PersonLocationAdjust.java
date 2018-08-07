package com.example.dudrb.skproject.Admin.DutyManagement;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.dudrb.skproject.R;

public class PersonLocationAdjust extends Activity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_location_adjust);

        b1 = (Button)findViewById(R.id.dutyChange);
    }

    public void onClickDutyChange(View v){
        startActivity(new Intent(this, PersonLocationAdjust.class));
    }


}
