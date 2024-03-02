package com.example.rosylnhackathonproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_activity);

        //Create objects
        EditText email = findViewById(R.id.editTextTextEmailAddress);
        EditText password = findViewById(R.id.editTextTextPassword);
        Button signIn = findViewById(R.id.button2);
        Button signUp = findViewById(R.id.button3);


        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String emailText = email.getText().toString();
                String passwordText = password.getText().toString();
                launchNextAct(emailText,passwordText);
            }
        });
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchCreateAccount();
            }
        });
    }

    //Go to the madLib activity
    private boolean launchNextAct(String email, String password)
    {
       if(true)//check for sign in fail
       {
            return false;
       }
       //put sign in method

        //put new activity
        Intent intent = new Intent();//put in new activity

        return true;


    }
    //Create an account
    private void launchCreateAccount()
    {
        Intent intent = new Intent(this, CreateAccount.class);

        startActivity(intent);

    }
}