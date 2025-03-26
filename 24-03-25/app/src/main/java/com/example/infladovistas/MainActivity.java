package com.example.infladovistas;

import static android.view.ViewGroup.LayoutParams.MATCH_PARENT;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button btnAgrega;
    Button btnAgrega2;
    Button btnContador;
    LinearLayout root;
    LinearLayout root2;

    int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        root = findViewById(R.id.lytMain);
        root2 = findViewById(R.id.lytMain2);
        btnAgrega = findViewById(R.id.btnAgrega);
        btnAgrega.setOnClickListener(v -> {
            generaImagenIzq();
        });

        btnAgrega2 = findViewById(R.id.btnAgrega2);
        btnAgrega2.setOnClickListener(v -> {
            generaImagenDer();
        });
    }

    void generaImagenIzq() {
        // Aqui se genera el inflado de vista
        LinearLayout lytItemPrueba = (LinearLayout) LinearLayout.inflate(this, R.layout.item_prueba, null);

        Button izqu = new Button(this);

        izqu.setText("" + contador);
        contador++;
        izqu.setMinimumHeight(100);
        izqu.setMinimumWidth(MATCH_PARENT);

        lytItemPrueba.addView(izqu);

        //ImageView img = new ImageView(this);

        // Aqui se genera la imagen
        //img.setImageResource(R.mipmap.ic_launcher);
        //img.setMinimumHeight(100);
        //img.setMinimumWidth(MATCH_PARENT);
        // Aqui se agrega la imagen al layout inflado
        //lytItemPrueba.setGravity(Gravity.CENTER);
        //lytItemPrueba.addView(img);

        // Aqui se agrega el layout inflado a la vista rootw
        root.addView(lytItemPrueba);
        lytItemPrueba.setMinimumWidth(MATCH_PARENT);
        lytItemPrueba.setBackgroundColor(getResources().getColor(R.color.naranja, getTheme()));
    }

    void generaImagenDer() {
        // Aqui se genera el inflado de vista
        LinearLayout lytItemPruebaDer = (LinearLayout) LinearLayout.inflate(this, R.layout.item_derecha, null);

        Button der = new Button(this);

        der.setText("" + contador);
        contador++;
        der.setMinimumHeight(100);
        der.setMinimumWidth(MATCH_PARENT);

        lytItemPruebaDer.addView(der);

        //ImageView img = new ImageView(this);

        // Aqui se genera la imagen
        //img.setImageResource(R.mipmap.ic_launcher);
        //img.setMinimumHeight(100);
        //img.setMinimumWidth(MATCH_PARENT);
        // Aqui se agrega la imagen al layout inflado
        //lytItemPruebaDer.setGravity(Gravity.CENTER);
        //lytItemPruebaDer.addView(img);

        // Aqui se agrega el layout inflado a la vista rootw
        root2.addView(lytItemPruebaDer);
        lytItemPruebaDer.setMinimumWidth(MATCH_PARENT);
        lytItemPruebaDer.setBackgroundColor(getResources().getColor(R.color.naranja, getTheme()));
    }
}