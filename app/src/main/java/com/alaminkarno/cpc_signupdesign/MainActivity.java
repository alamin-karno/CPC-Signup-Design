package com.alaminkarno.cpc_signupdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameET,emailET,numberET,passwordET;
    Button sign_up_button;
    String name,email,number,password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameET = findViewById(R.id.nameET);
        emailET = findViewById(R.id.emailET);
        numberET = findViewById(R.id.phoneET);
        passwordET = findViewById(R.id.passwordET);
        sign_up_button = findViewById(R.id.signupBTN);

        sign_up_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               name = nameET.getText().toString();
               email = emailET.getText().toString();
               number = numberET.getText().toString();
               password = passwordET.getText().toString();

               if(name.isEmpty()){
                   nameET.setError("Please enter name first");
               }
               else if(email.isEmpty()){
                   emailET.setError("Please enter email first");
               }
               else if(number.isEmpty()){
                   numberET.setError("Please enter number first");
               }
               else if(password.isEmpty() || password.length()<6){

                   Toast.makeText(MainActivity.this, "Please enter 6 digit password first", Toast.LENGTH_SHORT).show();
               }
               else {
                   Toast.makeText(MainActivity.this,"Name: "+name+"\nEmail: "+
                           email+"\nNumber: "+number+"\nPassword: "+password,Toast.LENGTH_LONG).show();
               }

            }
        });

    }
}