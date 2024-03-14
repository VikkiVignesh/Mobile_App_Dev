package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Successfull extends AppCompatActivity {

    Animation bottom,pop;
    Button log,back;
    ImageView img;
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_successfull);
        back=(Button) findViewById(R.id.back) ;
        log= (Button)findViewById(R.id.log);
        img=(ImageView) findViewById(R.id.imageView);
        txt=(TextView)findViewById(R.id.txtmsg);
        bottom=AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        pop=AnimationUtils.loadAnimation(this,R.anim.pop_up);

        img.setAnimation(pop);
        back.setAnimation(bottom);
        log.setAnimation(bottom);
        txt.setAnimation(pop);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Successfull.this,MainActivity.class);
                startActivity(i);
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent i= new Intent(Successfull.this,Login.class);
                i.putExtra("email",getIntent().getStringExtra("email"));
                i.putExtra("password",getIntent().getStringExtra("password"));
                startActivity(i);
            }
        });
    }
}