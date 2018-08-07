package com.example.dudrb.skproject.Admin.AttendCheck;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.dudrb.skproject.R;

import java.util.ArrayList;
import java.util.List;

public class AttendList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attend_list);

        ListView lv = (ListView)findViewById(R.id.listView);

        List<String> list = new ArrayList<>();

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, list);

        lv.setAdapter(adapter);

        list.add("aaaaaaaaaaaaaaa ");
        list.add("bbbbbbbbbbbbbbbbbb");
        list.add("cccccccccccccccccccccccccc ");
        list.add("ddddddddddddddddddddddddd ");
    }
}
