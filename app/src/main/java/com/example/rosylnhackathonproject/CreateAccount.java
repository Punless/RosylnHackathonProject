package com.example.rosylnhackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CreateAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        EditText email = findViewById(R.id.editTextTextEmailAddress3);
        EditText username = findViewById(R.id.editTextUsername);
        EditText editText = findViewById(R.id.editTextTextPassword);
        Button button = findViewById(R.id.button);

    }
}