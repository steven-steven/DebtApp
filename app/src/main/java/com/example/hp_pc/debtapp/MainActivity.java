package com.example.hp_pc.debtapp;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
////
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton numbers = (ImageButton)findViewById(R.id.IBRegistration);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent entrancePageIntent = new Intent(MainActivity.this, Summary_entrance_page.class);
                startActivity(entrancePageIntent);
            }
        });

    }
}
