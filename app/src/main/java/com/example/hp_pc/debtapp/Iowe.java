package com.example.hp_pc.debtapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Iowe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iowe);
        ImageButton IBAddActIOwe = (ImageButton) findViewById(R.id.IBAddActIOwe2);
        IBAddActIOwe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent z = new Intent(getApplication(), itemitem.class);
                startActivity(z);
            }
        });
        getSupportActionBar().setTitle("MoneyGuard");
    }
}
