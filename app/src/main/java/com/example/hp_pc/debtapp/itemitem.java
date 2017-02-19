package com.example.hp_pc.debtapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class itemitem extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemitem);

        Button bSaveChanges = (Button) findViewById(R.id.bSavechanges);
        final EditText etName = (EditText) findViewById(R.id.ETName);
        final EditText etDetails = (EditText) findViewById(R.id.ETDetails);
        final EditText etAmount = (EditText) findViewById(R.id.ETAmount);

        bSaveChanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                String details = etDetails.getText().toString();
                String amount = etAmount.getText().toString();

                Database accesser = new Database(name,amount);
                accesser.save();
            }
        });


        getSupportActionBar().setTitle("MoneyGuard");
    }
}
