package com.alvaropedrajas.loginreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddressActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Button btnBack = (Button) findViewById(R.id.btnBack);
        Button btnNext = (Button) findViewById(R.id.btnNext);
        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBack:
                finish();
                break;

            case R.id.btnNext:
                Intent intent = new Intent(this, ResumeActivity.class);
                startActivityForResult(intent, 0);
                break;
        }
    }
}