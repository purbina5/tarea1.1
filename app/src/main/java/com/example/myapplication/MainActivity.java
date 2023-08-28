package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox seleccionarChk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccionarChk = (CheckBox) findViewById(R.id.chk_Seleccionar);
    }
    public void BtnCheck(View V){
        if(seleccionarChk.isChecked()== true){
            String mensaje = "Seleccionado";
            Toast toast = Toast.makeText(this, mensaje, Toast.LENGTH_LONG);
            toast.setGravity(Gravity.CENTER_HORIZONTAL, Gravity.START|90,0);
            toast.show();
        }
        else{
            String mensaje = "Te equivocaste";
            Toast toast = Toast.makeText(this, mensaje, Toast.LENGTH_LONG);
            toast.show();
        }
    }
}