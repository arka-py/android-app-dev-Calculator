package com.arkaadhya.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button regBtn;
    private Button logBtn;
    private EditText uname;
    private EditText passwrd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        regBtn = findViewById(R.id.register);
        logBtn = findViewById(R.id.login);
        uname = findViewById(R.id.username);
        passwrd = findViewById(R.id.password);
        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                openRegistration();
            }
        });
        logBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                SharedPreferences shrd= getSharedPreferences("myPREF",MODE_PRIVATE);
                String loginCred = shrd.getString("str","Not found!");
                String currUname = uname.getText().toString();
                String currpswrd = passwrd.getText().toString();
//                if(loginCred.equals(currUname+currpswrd)) {
//                    openCalculator();
//                }
                if(loginCred.isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter valid username and password",Toast.LENGTH_LONG).show();
                }
                else if(loginCred.equals(currUname+currpswrd)) {
                    openCalculator();
                }
                else if(!loginCred.equals(currUname+currpswrd)){
                    Toast.makeText(getApplicationContext(),"Enter valid username and password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
    public void openRegistration(){
        Intent intent = new Intent(this,register_activity.class);
        startActivity(intent);
    }
    public void openCalculator(){
        Intent intent = new Intent(this,calculator_activity.class);
        startActivity(intent);
        finish();
    }
}