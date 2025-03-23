package com.example.gato;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    ImageView img1;
    ImageView img2;
    ImageView img3;
    ImageView img4;
    ImageView img5;
    ImageView img6;
    ImageView img7;
    ImageView img8;
    ImageView img9;

    int player1 = 0, player2 = 1;
    int conteo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        img1 = findViewById(R.id.img1);
        img1.setOnClickListener(v -> {
            if(conteo == 0){
                img1.setImageResource(R.drawable.baseline_circle_24);
                conteo = 1;
            }else {
                img1.setImageResource(R.drawable.sharp_ac_unit_24);
                conteo=0;
            }
        });

        img2 = findViewById(R.id.img2);
        img2.setOnClickListener(v -> {
            if(conteo == 0){
                img2.setImageResource(R.drawable.baseline_circle_24);
                conteo = 1;
            }else {
                img2.setImageResource(R.drawable.sharp_ac_unit_24);
                conteo=0;
            }
        });

        img3 = findViewById(R.id.img3);
        img3.setOnClickListener(v -> {
            if(conteo == 0){
                img3.setImageResource(R.drawable.baseline_circle_24);
                conteo = 1;
            }else {
                img3.setImageResource(R.drawable.sharp_ac_unit_24);
                conteo=0;
            }
        });

        img4 = findViewById(R.id.img4);
        img4.setOnClickListener(v -> {
            if(conteo == 0){
                img4.setImageResource(R.drawable.baseline_circle_24);
                conteo = 1;
            }else {
                img4.setImageResource(R.drawable.sharp_ac_unit_24);
                conteo=0;
            }
        });

        img5 = findViewById(R.id.img5);
        img5.setOnClickListener(v -> {
            if(conteo == 0){
                img5.setImageResource(R.drawable.baseline_circle_24);
                conteo = 1;
            }else {
                img5.setImageResource(R.drawable.sharp_ac_unit_24);
                conteo=0;
            }
        });

        img6 = findViewById(R.id.img6);
        img6.setOnClickListener(v -> {
            if(conteo == 0){
                img6.setImageResource(R.drawable.baseline_circle_24);
                conteo = 1;
            }else {
                img6.setImageResource(R.drawable.sharp_ac_unit_24);
                conteo=0;
            }
        });

        img7 = findViewById(R.id.img7);
        img7.setOnClickListener(v -> {
            if(conteo == 0){
                img7.setImageResource(R.drawable.baseline_circle_24);
                conteo = 1;
            }else {
                img7.setImageResource(R.drawable.sharp_ac_unit_24);
                conteo=0;
            }
        });

        img8 = findViewById(R.id.img8);
        img8.setOnClickListener(v -> {
            if(conteo == 0){
                img8.setImageResource(R.drawable.baseline_circle_24);
                conteo = 1;
            }else {
                img8.setImageResource(R.drawable.sharp_ac_unit_24);
                conteo=0;
            }
        });

        img9 = findViewById(R.id.img9);
        img9.setOnClickListener(v -> {
            if(conteo == 0){
                img9.setImageResource(R.drawable.baseline_circle_24);
                conteo = 1;
            }else {
                img9.setImageResource(R.drawable.sharp_ac_unit_24);
                conteo=0;
            }
        });

    }

  //  void imprimeGanador(){
//        Toast.makeText(this,"El ganador es:", Toast.LENGTH_LONG).show();

    //}
}