package com.example.proyecto24_02_2025;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondaryActivity extends AppCompatActivity {

    TextView txvTitle;

    Button btnContinuar2;

    //Intancia del view model
    ViewModel vm = new ViewModel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_secondary);

        txvTitle = findViewById(R.id.txvTitle);
        txvTitle.setText(R.string.Actividad_dos);

        btnContinuar2.setOnClickListener(v -> {
            vm.navigate(this, ThirdActivity.class );
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}