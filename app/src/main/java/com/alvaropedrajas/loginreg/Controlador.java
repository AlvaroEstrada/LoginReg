package com.alvaropedrajas.loginreg;


import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Objects;

public class Controlador implements IControlador {

    final String usuario = "usuario";
    final String password = "prueba";

    boolean loginFlag;

    private Activity activity;


    public Controlador (Activity activity){
        this.activity = activity;
        Button btn = (Button) activity.findViewById(R.id.btnJoin);
        btn.setOnClickListener(this);

    }

    public void login(View v) {
        EditText etUser = (EditText) activity.findViewById(R.id.etUser);
        EditText etPass = (EditText) activity.findViewById(R.id.etPass);

        String getUsuario = etUser.getText().toString();
        String getPassword = etPass.getText().toString();

        String empty = "";

        if (!Objects.equals(getUsuario, empty) && !Objects.equals(getPassword, empty)){
            if (Objects.equals(getUsuario, usuario) && Objects.equals(getPassword, password)){
                loginFlag = true;
            }else{
                Toast.makeText(v.getContext(), "¡Usuario o contraseña erroneo!", Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(v.getContext(), "¡Se necesita usuario y contraseña!", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {

        login(v);

        if (loginFlag) {
            Intent intent = new Intent(activity, UserdataActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
            activity.startActivityForResult(intent, 0);
        }
    }
}
