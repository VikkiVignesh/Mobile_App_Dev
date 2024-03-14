package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

import org.w3c.dom.Text;

public class Login extends AppCompatActivity {

    private TextInputLayout Gmail;
    private TextInputLayout Pswd;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        String usermail=getIntent().getStringExtra("email");
        String userpass=getIntent().getStringExtra("password");

        Gmail=(TextInputLayout) findViewById(R.id.gmail);
        Pswd=(TextInputLayout) findViewById(R.id.pass);
        login=(Button) findViewById(R.id.log_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Gmail.getEditText().toString().isEmpty() )
                {
                 Gmail.setError("Field's can not be Empty !!");
                }
                else if(!Gmail.getEditText().getText().toString().equals(usermail))
                {
                    Gmail.setError("Mail does not Match !!");
                }
                else {
                    Gmail.setError(null);
                }

                if(Pswd.getEditText().toString().isEmpty())
                    {
                        Pswd.setError("Field's can not be Empty !!");
                    }
                    else if (!Pswd.getEditText().getText().toString().equals(userpass)) {
                        Pswd.setError("Password does not Match !!");
                    }
                    else
                    {
                        Pswd.setError(null);
                    }
                if(Gmail.getError()==null && Pswd.getError()==null)
                {
                    Toast.makeText(Login.this, "Log in SuccessFull !!", Toast.LENGTH_SHORT).show();
                    Intent in=new Intent(Login.this,Home.class);
                    startActivity(in);
                }
            }
        });

    }
}