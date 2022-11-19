package com.arkaadhya.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register_activity extends AppCompatActivity {
    private Button newReg;
    private EditText newUser;
    private EditText newPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        newReg = findViewById(R.id.newRegister);
        newUser = findViewById(R.id.newUsername);
        newPassword = findViewById(R.id.newPassword);
        newReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                String username = newUser.getText().toString();
                String password = newPassword.getText().toString();
                SharedPreferences shrd = getSharedPreferences("myPREF",MODE_PRIVATE);
                SharedPreferences.Editor editor = shrd.edit();
                editor.putString("str",username+password);
                editor.apply();
                openLoginPage();
            }
        });
    }
    public void openLoginPage(){
        if(newUser.getText().toString().isEmpty() || newPassword.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Set valid username and password",Toast.LENGTH_LONG).show();
        }
        else {
            Toast.makeText(getApplicationContext(),"Registration Successful",Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}