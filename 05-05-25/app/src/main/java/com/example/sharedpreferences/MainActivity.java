package com.example.sharedpreferences;

import android.os.Bundle;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

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

        Storage<T> localStorage = new LocalStorage(this);
        try {
            String valorPrevio = localStorage.getValue("Llave", null);
            if (valorPrevio != null){
                Toast.makeText(
                        this,
                        "Valor previo: " + valorPrevio,
                        Toast.LENGTH_LONG
                ).show();
            }
            localStorage.setValue("Facultad", "Lavve");
        } catch (StorageException e) {
            Toast.makeText(
                    this,
                    "Error al guardar el valor",
                    Toast.LENGTH_LONG
            ).show();

        }
    }
}