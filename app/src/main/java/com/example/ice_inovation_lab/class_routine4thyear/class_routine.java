package com.example.ice_inovation_lab.class_routine4thyear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class class_routine extends AppCompatActivity implements View.OnClickListener{
    Button sat,sun,mon,tue,wed,ext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_class_routine);
        sat=findViewById(R.id.button);
        sun=findViewById(R.id.button2);
        mon=findViewById(R.id.button3);
        tue=findViewById(R.id.button4);
        wed=findViewById(R.id.button5);

        sat.setOnClickListener(this);
        sun.setOnClickListener(this);
        mon.setOnClickListener(this);
        tue.setOnClickListener(this);
        wed.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v==sat){
            Intent intent=new Intent(class_routine.this,satActivity.class);
            startActivity(intent);
        }

        if(v==sun){
            Intent intent=new Intent(class_routine.this,sunActivity.class);
            startActivity(intent);
        }

        if(v==mon){
            Intent intent=new Intent(class_routine.this,monActivity.class);
            startActivity(intent);
        }

        if(v==tue){
            Intent intent=new Intent(class_routine.this,tueActivity.class);
            startActivity(intent);
        }

        if(v==wed){
            Intent intent=new Intent(class_routine.this,wedActivity.class);
            startActivity(intent);
        }


    }
}
