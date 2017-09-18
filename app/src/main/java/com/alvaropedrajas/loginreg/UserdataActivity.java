package com.alvaropedrajas.loginreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserdataActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et_name, et_last1, et_last2;
    static String nombre, apeUno, apeDos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_userdata);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        Button btnNext = (Button) findViewById(R.id.btnNext);
        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);
        et_name = (EditText) this.findViewById(R.id.et_name);
        et_last1 = (EditText) this.findViewById(R.id.et_last1);
        et_last2 = (EditText) this.findViewById(R.id.et_last2);
    }

    public void getDatos(){
        nombre = et_name.getText().toString();
        apeUno = et_last1.getText().toString();
        apeDos = et_last2.getText().toString();
    }

    public void enviarDatos(){
        Intent intent = new Intent(this, AddressActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        intent.putExtra("et_name", nombre);
        intent.putExtra("et_last1", apeUno);
        intent.putExtra("et_last2", apeDos);
        startActivity(intent);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBack:
                finish();
                break;

            case R.id.btnNext:
                getDatos();
                enviarDatos();
                break;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println(this + " - onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println(this + " - onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println(this + " - onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println(this + " - onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println(this + " - onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        System.out.println(this + " - onRestart");
    }
}