package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class Home extends AppCompatActivity {
  Button Hback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Hback=(Button) findViewById(R.id.back);
        Hback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this, Login.class);
                startActivity(i);
            }
        });

       Button out=(Button) findViewById(R.id.logout);
       out.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(Home.this, "Logged Out !!...", Toast.LENGTH_SHORT).show();
               Intent i =new Intent(Home.this,MainActivity.class);
               startActivity(i);
           }
       });


    }
}