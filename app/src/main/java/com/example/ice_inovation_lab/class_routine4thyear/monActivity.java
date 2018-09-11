package com.example.ice_inovation_lab.class_routine4thyear;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class monActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn,ext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon);
        btn=findViewById(R.id.btnsat);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(monActivity.this,class_routine.class);
        startActivity(intent);

    }
}
