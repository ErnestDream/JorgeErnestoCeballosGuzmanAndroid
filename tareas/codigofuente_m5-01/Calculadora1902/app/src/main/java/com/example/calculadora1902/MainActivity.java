package com.example.calculadora1902;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements  View.OnClickListener{

    Button btnReinicio;
    TextView txvMiTexto;
    String cadena= "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        txvMiTexto = findViewById(R.id.txv_main);
        cadena +=  "Serie de Fibbonacci";
        txvMiTexto.setText(cadena);
        btnReinicio = findViewById(R.id.btn_reinicio);

        btnReinicio.setOnClickListener(this);
    }
/*
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.println(Log.INFO, null, "onCreate");

        cadena +="| onCreate(savedInstanceState, persistentState)";
        txvMiTexto.setText(cadena);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.println(Log.INFO, null, "hola");

        cadena =  "onStart()";
        txvMiTexto.setText(cadena);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.println(Log.INFO, null, "onPause");

        cadena +=  "onPause()";
        txvMiTexto.setText(cadena);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.println(Log.INFO, null, "onStop");

        cadena +=  "onStop()";
        txvMiTexto.setText(cadena);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.println(Log.INFO, null, "onDestroy");

        cadena +=  "onDestroy()";
        txvMiTexto.setText(cadena);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.println(Log.INFO, null, "onRestart");

        cadena +=  "onRestart()";
        txvMiTexto.setText(cadena);

    }*/

    long num1 = 1, num2 = 0, resultado = 0;

    @Override
    public void onClick(View v) {

        cadena = "";

        resultado = num1 + num2;
        num1 = num2;
        num2 = resultado;
        cadena = "" + num1;

        txvMiTexto.setText(cadena);

    }
}