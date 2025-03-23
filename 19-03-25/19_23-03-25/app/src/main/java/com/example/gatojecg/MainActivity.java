package com.example.gatojecg;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Objects;

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

    String turno;

    //Matriz que contiene las posibles combinaciones de los ganadores
    int[][] matrizGanadora = {
            {1, 256, 4096},
            {2, 512, 1024},
            {17, 19, 23}
    };

    //Variables que contienen las combinaciones de los ganadores
    int ganadorHorizontal1 = matrizGanadora[0][0] + matrizGanadora[0][1] + matrizGanadora[0][2];
    int ganadorHorizontal2 = matrizGanadora[1][0] + matrizGanadora[1][1] + matrizGanadora[1][2];
    int ganadorHorizontal3 = matrizGanadora[2][0] + matrizGanadora[2][1] + matrizGanadora[2][2];
    int ganadorVertical1 = matrizGanadora[0][0] + matrizGanadora[1][0] + matrizGanadora[2][0];
    int ganadorVertical2 = matrizGanadora[0][1] + matrizGanadora[1][1] + matrizGanadora[2][1];
    int ganadorVertical3 = matrizGanadora[0][2] + matrizGanadora[1][2] + matrizGanadora[2][2];
    int ganadorDiagonal1 = matrizGanadora[0][0] + matrizGanadora[1][1] + matrizGanadora[2][2];
    int ganadorDiagonal2 = matrizGanadora[0][2] + matrizGanadora[1][1] + matrizGanadora[2][0];

    int jugada1h = 0;
    int jugada2h = 0;

    int jugada1v = 0;
    int jugada2v = 0;

    int jugada1d = 0;
    int jugada2d = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        //Turno con el que se empieza siempre, es decir, con el turno de la bolita
        turno = "o";

        //Declaración de la imagen
        img1 = findViewById(R.id.img1);
        //Listener de click de la ImageView
        img1.setOnClickListener(v -> {
            if(Objects.equals(turno, "o")){
                img1.setImageResource(R.drawable.baseline_circle_24);
                //Si pasa bolita, el que sigue es la X
                turno = "x";
                jugada1h += matrizGanadora[0][0];
                jugada1v += matrizGanadora[0][0];
                jugada1d += matrizGanadora[0][0];
            }else {
                img1.setImageResource(R.drawable.baseline_clear_24);
                //Si pasa x, el que sigue es la bolita
                turno = "o";

                jugada2h += matrizGanadora[0][0];
                jugada2v += matrizGanadora[0][0];
                jugada2d += matrizGanadora[0][0];
            }
            verificarGanador();
            img1.setOnClickListener(null);
        });

        img2 = findViewById(R.id.img2);
        img2.setOnClickListener(v -> {
            if(Objects.equals(turno, "o")){
                img2.setImageResource(R.drawable.baseline_circle_24);
                turno = "x";
                jugada1h += matrizGanadora[0][1];
                jugada1v += matrizGanadora[0][1];
            }else {
                img2.setImageResource(R.drawable.baseline_clear_24);
                turno = "o";
                jugada2h += matrizGanadora[0][1];
                jugada2v += matrizGanadora[0][1];
            }
            verificarGanador();
            img2.setOnClickListener(null);
        });

        img3 = findViewById(R.id.img3);
        img3.setOnClickListener(v -> {
            if(Objects.equals(turno, "o")){
                img3.setImageResource(R.drawable.baseline_circle_24);
                turno = "x";
                jugada1h += matrizGanadora[0][2];
                jugada1v += matrizGanadora[0][2];
                jugada1d += matrizGanadora[0][2];
            }else {
                img3.setImageResource(R.drawable.baseline_clear_24);
                turno = "o";
                jugada2h += matrizGanadora[0][2];
                jugada2v += matrizGanadora[0][2];
                jugada2d += matrizGanadora[0][2];
            }
            verificarGanador();
            img3.setOnClickListener(null);
        });

        img4 = findViewById(R.id.img4);
        img4.setOnClickListener(v -> {
            if(Objects.equals(turno, "o")){
                img4.setImageResource(R.drawable.baseline_circle_24);
                turno = "x";
                jugada1h += matrizGanadora[1][0];
                jugada1v += matrizGanadora[1][0];
            }else {
                img4.setImageResource(R.drawable.baseline_clear_24);
                turno = "o";
                jugada2h += matrizGanadora[1][0];
                jugada2v += matrizGanadora[1][0];
            }
            verificarGanador();
            img4.setOnClickListener(null);
        });

        img5 = findViewById(R.id.img5);
        img5.setOnClickListener(v -> {
            if(Objects.equals(turno, "o")){
                img5.setImageResource(R.drawable.baseline_circle_24);
                turno = "x";
                jugada1h += matrizGanadora[1][1];
                jugada1v += matrizGanadora[1][1];
                jugada1d += matrizGanadora[1][1];
            }else {
                img5.setImageResource(R.drawable.baseline_clear_24);
                turno = "o";
                jugada2h += matrizGanadora[1][1];
                jugada2v += matrizGanadora[1][1];
                jugada2d += matrizGanadora[1][1];
            }
            verificarGanador();
            img5.setOnClickListener(null);
        });

        img6 = findViewById(R.id.img6);
        img6.setOnClickListener(v -> {
            if(Objects.equals(turno, "o")){
                img6.setImageResource(R.drawable.baseline_circle_24);
                turno = "x";
                jugada1h += matrizGanadora[1][2];
                jugada1v += matrizGanadora[1][2];
            }else {
                img6.setImageResource(R.drawable.baseline_clear_24);
                turno = "o";
                jugada2h += matrizGanadora[1][2];
                jugada2v += matrizGanadora[1][2];
            }
            verificarGanador();
            img6.setOnClickListener(null);
        });

        img7 = findViewById(R.id.img7);
        img7.setOnClickListener(v -> {
            if(Objects.equals(turno, "o")){
                img7.setImageResource(R.drawable.baseline_circle_24);
                turno = "x";
                jugada1h += matrizGanadora[2][0];
                jugada1v += matrizGanadora[2][0];
                jugada1d += matrizGanadora[2][0];
            }else {
                img7.setImageResource(R.drawable.baseline_clear_24);
                turno = "o";
                jugada2h += matrizGanadora[2][0];
                jugada2v += matrizGanadora[2][0];
                jugada2d += matrizGanadora[2][0];
            }
            verificarGanador();
            img7.setOnClickListener(null);
        });

        img8 = findViewById(R.id.img8);
        img8.setOnClickListener(v -> {
            if(Objects.equals(turno, "o")){
                img8.setImageResource(R.drawable.baseline_circle_24);
                turno = "x";
                jugada1h += matrizGanadora[2][1];
                jugada1v += matrizGanadora[2][1];
            }else {
                img8.setImageResource(R.drawable.baseline_clear_24);
                turno = "o";
                jugada2h += matrizGanadora[2][1];
                jugada2v += matrizGanadora[2][1];
            }
            verificarGanador();
            img8.setOnClickListener(null);
        });

        img9 = findViewById(R.id.img9);
        img9.setOnClickListener(v -> {
            if(Objects.equals(turno, "o")){
                img9.setImageResource(R.drawable.baseline_circle_24);
                turno = "x";
                jugada1h += matrizGanadora[2][2];
                jugada1v += matrizGanadora[2][2];
                jugada1d += matrizGanadora[2][2];
            }else {
                img9.setImageResource(R.drawable.baseline_clear_24);
                turno = "o";
                jugada2h += matrizGanadora[2][2];
                jugada2v += matrizGanadora[2][2];
                jugada2d += matrizGanadora[2][2];
            }
            verificarGanador();
            img9.setOnClickListener(null);
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.gridLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void deshabilitarImagenes() {
        img1.setOnClickListener(null);
        img2.setOnClickListener(null);
        img3.setOnClickListener(null);
        img4.setOnClickListener(null);
        img5.setOnClickListener(null);
        img6.setOnClickListener(null);
        img7.setOnClickListener(null);
        img8.setOnClickListener(null);
        img9.setOnClickListener(null);
    }

    public void verificarGanador()
    {
        //Booleano que revisa si hay un ganador, para cuando se necesite deshabilitar
        // todo el tablero cuando alguiien gane
        boolean ganador = false;

        if(jugada1h == ganadorHorizontal1 || jugada1h == ganadorHorizontal2 || jugada1h == ganadorHorizontal3)
        {
            Toast.makeText(this, "Ganó la bolita", Toast.LENGTH_SHORT).show();
            ganador = true;
        }

        if(jugada1v == ganadorVertical1 || jugada1v == ganadorVertical2 || jugada1v == ganadorVertical3)
        {
            Toast.makeText(this, "Ganó la bolita", Toast.LENGTH_SHORT).show();
            ganador = true;
        }

        if(jugada1d == ganadorDiagonal1 || jugada1d == ganadorDiagonal2)
        {
            Toast.makeText(this, "Ganó la bolita", Toast.LENGTH_SHORT).show();
            ganador = true;

        }

        if(jugada2h == ganadorHorizontal1 || jugada2h == ganadorHorizontal2 || jugada2h == ganadorHorizontal3)
        {
            Toast.makeText(this, "Ganó la otra cosa", Toast.LENGTH_SHORT).show();
            ganador = true;
        }

        if(jugada2v == ganadorVertical1 || jugada2v == ganadorVertical2 || jugada2v == ganadorVertical3)
        {
            Toast.makeText(this, "Ganó la otra cosa", Toast.LENGTH_SHORT).show();
            ganador = true;
        }

        if(jugada2d == ganadorDiagonal1 || jugada2d == ganadorDiagonal2)
        {
            Toast.makeText(this, "Ganó la otra cosa", Toast.LENGTH_SHORT).show();
            ganador = true;
        }
        if(ganador)
        {
            deshabilitarImagenes();
        }
    }

    public void reiniciar() {
        Button btnReiniciar = findViewById(R.id.btnReiniciar);

        btnReiniciar.setOnClickListener(v -> {
            onStart();
        });

    }
}