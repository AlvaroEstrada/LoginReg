package com.alvaropedrajas.loginreg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResumeActivity extends AppCompatActivity implements View.OnClickListener{

    String nombre, apeUno, apeDos, direcc, ciudad, cpostal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        TextView tv_name = (TextView) findViewById(R.id.tv_name);
        TextView tv_last1 = (TextView) findViewById(R.id.tv_last1);
        TextView tv_last2 = (TextView) findViewById(R.id.tv_last2);
        TextView tv_address = (TextView) findViewById(R.id.tv_address);
        TextView tv_city = (TextView) findViewById(R.id.tv_city);
        TextView tv_cp = (TextView) findViewById(R.id.tv_cp);

        Button btnBack = (Button) findViewById(R.id.btnBack);
        Button btnNext = (Button) findViewById(R.id.btnNext);
        btnBack.setOnClickListener(this);
        btnNext.setOnClickListener(this);

        Bundle datos = this.getIntent().getExtras();

        if(datos != null) {

            nombre = datos.getString("et_name");
            apeUno = datos.getString("et_last1");
            apeDos = datos.getString("et_last2");
            direcc = datos.getString("et_address");
            ciudad = datos.getString("et_city");
            cpostal = datos.getString("et_cp");

            tv_name.setText(nombre);
            tv_last1.setText(apeUno);
            tv_last2.setText(apeDos);
            tv_address.setText(direcc);
            tv_city.setText(ciudad);
            tv_cp.setText(cpostal);
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnBack:
                finish();
                break;

            case R.id.btnNext:
                startActivity(new Intent(getBaseContext(), MainActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP));
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