package com.example.calculadora19_02_25;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.renderscript.RenderScript;
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

import java.math.BigInteger;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnReinicio;

    TextView txvMiTexto;
    String cadena = "";
    int num1 = 0;
    int num2 = 1;
    int resultado = 0;
    int resultadoant = 0;
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
        //Log.println(Log.INFO, null, "onCreate");

        txvMiTexto = findViewById(R.id.txv_main);

        //Copir y pegar en los metodos del ciclo onActivity
        //cadena += "| onCreate()";
        txvMiTexto.setText(cadena);

        btnReinicio = findViewById(R.id.btn_reinicio);
        btnReinicio.setOnClickListener(this);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.println(Log.INFO, null, "onCreate");
        cadena += "\n| onCreate(savedInstanceState, persistentState)";
        txvMiTexto.setText(cadena);
    }


    /*
    @Override
    public void onStart() {
        super.onStart();
        Log.println(Log.INFO, null, "onStart");
        cadena += "\n| onStart()";
        txvMiTexto.setText(cadena);
    }
    @Override
    public void onPause() {
        super.onPause();
        Log.println(Log.INFO, null, "onPause");
        cadena += "\n| onPause()";
        txvMiTexto.setText(cadena);
    }
    @Override
    public void onStop() {
        super.onStop();
        Log.println(Log.INFO, null, "onStop");
        cadena += "\n| onStop()";
        txvMiTexto.setText(cadena);
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.println(Log.INFO, null, "onDestroy");
        cadena += "\n| onDestroy()";
        txvMiTexto.setText(cadena);
    }
    @Override
    public void onRestart() {
        super.onRestart();
        Log.println(Log.INFO, null, "onRestart");
        cadena += "\n| onRestart()";
        txvMiTexto.setText(cadena);
    }
    */

    /*@Override
    protected void onStart() {
        super.onStart();


    */

    @Override
    public void onClick(View v)
    {

        resultado = num1 + num2;
        num1 = num2;
        num2 = resultado;

        resultadoant = num1;

        txvMiTexto.setText( cadena + "EL numero es -" + resultado);
        btnReinicio = findViewById(R.id.btn_reinicio);
    }
}