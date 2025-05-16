package com.example.actividad_m1_03;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Arrays;
import java.util.Random;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Declaramos nuestro arreglo que contendra los numeros aleatorios
        int[] numeracion;

        //Inicializamos el arreglo con 1000000 numeros aleatorios
        numeracion = new int [1000000];
        //Inicializamos el generador de numeros aleatorios
        Random random = new Random();

        //Llenar el arreglo con números aleatorios
        for (int i = 0; i < numeracion.length; i++) {
            numeracion[i] = random.nextInt(1000000);
        }

        //Ordenar el arreglo
        Arrays.sort(numeracion);

        //Imprimir en bloques de 500, ya que sino, solo llega hasta 805
        for (int i = 0; i < numeracion.length; i += 500) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < i + 500 && j < numeracion.length; j++) {
                sb.append(numeracion[j]).append(", ");
            }
            Log.d("Numeracion", sb.toString());
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}