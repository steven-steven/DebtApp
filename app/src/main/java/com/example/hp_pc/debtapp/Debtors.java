package com.example.hp_pc.debtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Debtors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debtors);

        ArrayList<ItemObject> ObjectLists = new ArrayList<ItemObject>();

        for (int i = 0; i<8 ; i++){
            ObjectLists.add(new ItemObject("Name"+i, "Value"+i));
        }


        ListItemAdapter itemsAdapter = new ListItemAdapter(this, ObjectLists);

        ListView listView = (ListView) findViewById(R.id.lvDebtors);
        listView.setAdapter(itemsAdapter);
    }
}//
