package com.example.hp_pc.debtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Debtors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_debtors);
        getSupportActionBar().setTitle("MoneyGuard");
    }
}
