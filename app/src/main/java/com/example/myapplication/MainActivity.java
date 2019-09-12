package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Name;
    EditText Password;
    TextView Login;
    Button Submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = findViewById(R.id.etName);
        Password = findViewById(R.id.etPassword);
        Login = findViewById(R.id.tvTitle);
        Submit = findViewById(R.id.btnSubmit);

        Submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });
    }


    public void validate(String uName, String uPass) {
        if ((uName.equals("Admin")) && (uPass.equals("12345"))) {
            Intent intent = new Intent(MainActivity.this, SecondActivity.class);
           startActivity(intent);
       }
    }
    }