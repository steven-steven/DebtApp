package com.example.hp_pc.debtapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {
//
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        getSupportActionBar().setTitle(" ");
        //Listener to take user to password change page if needed.
        ImageButton numbers = (ImageButton)findViewById(R.id.IBRegistration);
        numbers.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent entrancePageIntent = new Intent(LoginPage.this, PasswordCreate.class);
                startActivity(entrancePageIntent);
            }
        });

        //Checks if the user entered the right password.
        Button bGo = (Button) findViewById(R.id.bGO);
        final EditText etPassword = (EditText) findViewById(R.id.ETPassword);
        bGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences password = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                String passwordStr = password.getString("CURRENT_PASSWORD","");
                String userEnteredPass = etPassword.getText().toString();

                if (passwordStr.equals(userEnteredPass)){
                    Log.v("Password Checker " , "Correct Password Entered" );
                }
                else {
                    Toast.makeText(getApplicationContext(), "Wrong Password Try Again!",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
