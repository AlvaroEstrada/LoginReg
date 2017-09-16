package com.alvaropedrajas.loginreg;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddressActivity extends AppCompatActivity implements View.OnClickListener{

    EditText et_address, et_city, et_cp;
    String nombre, apeUno, apeDos, direcc, ciudad, cpostal;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);
        Button btnBack = (Button) findViewById(R.id.btnBack);
        Button btnNext = (Button) findViewById(R.id.btnNext);

        et_address = (EditText) this.findViewById(R.id.et_address);
        et_city = (EditText) this.findViewById(R.id.et_city);
        et_cp = (EditText) this.findViewById(R.id.et_cp);


        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);

        Bundle datos = this.getIntent().getExtras();

        if(datos != null) {
            nombre = datos.getString("et_name");
            apeUno = datos.getString("et_last1");
            apeDos = datos.getString("et_last2");
        }
    }

    public void getDatos(){

        direcc = et_address.getText().toString();
        ciudad = et_city.getText().toString();
        cpostal = et_cp.getText().toString();

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

    private void enviarDatos() {

        Intent intent = new Intent(this, ResumeActivity.class);
        intent.putExtra("et_name", nombre);
        intent.putExtra("et_last1", apeUno);
        intent.putExtra("et_last2", apeDos);
        intent.putExtra("et_address", direcc);
        intent.putExtra("et_city", ciudad);
        intent.putExtra("et_cp", cpostal);
        startActivity(intent);

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