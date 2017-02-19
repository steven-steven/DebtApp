package com.example.hp_pc.debtapp;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PasswordCreate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password_create);
        getSupportActionBar().setTitle(" ");

        Button bConfirmPassword = (Button) findViewById(R.id.bConfirmPassword);
        final EditText ETOldPass = (EditText) findViewById(R.id.ETOldPass);
        final EditText ETNewPass = (EditText) findViewById(R.id.ETNewPass);
        final EditText ETNewPass2 = (EditText) findViewById(R.id.ETNewPass2);

        bConfirmPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String OldPass = ETOldPass.getText().toString();
                String NewPass = ETNewPass.getText().toString();
                String NewPass2 = ETNewPass2.getText().toString();

                SharedPreferences password = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                String passwordStr = password.getString("CURRENT_PASSWORD","");
//                Toast.makeText(getApplicationContext(), passwordStr.toString() ,Toast.LENGTH_LONG).show();
                SharedPreferences.Editor editor = password.edit();

                if(passwordStr.equals("")){
                    Toast.makeText(getApplicationContext(), "Welcome new user!!",Toast.LENGTH_LONG).show();
                    if (NewPass.equals(NewPass2)){
//                        Toast.makeText(getApplicationContext(), "About to commit" ,Toast.LENGTH_LONG).show();
                        editor.clear();
                        editor.putString("CURRENT_PASSWORD" , NewPass);
                        editor.commit();
                        Toast.makeText(getApplicationContext(), "Password Succesfully Saved",Toast.LENGTH_LONG).show();
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "New Passwords Don't Match",Toast.LENGTH_LONG).show();
                    }
                }
                else {
                    if (OldPass.equals(passwordStr)){
                        if (NewPass.equals(NewPass2)){
                            editor.clear();
                            editor.putString("CURRENT_PASSWORD" , NewPass);
                            editor.commit();
                            Toast.makeText(getApplicationContext(), "Password Succesfully Saved",Toast.LENGTH_LONG).show();
                        }
                        else {
                            Toast.makeText(getApplicationContext(), "New Passwords Don't Match",Toast.LENGTH_LONG).show();
                        }
                    }
                    else {
                        Toast.makeText(getApplicationContext(), "Old Password isn't correct",Toast.LENGTH_LONG).show();
                    }
                }

            }
        });

    }
}
