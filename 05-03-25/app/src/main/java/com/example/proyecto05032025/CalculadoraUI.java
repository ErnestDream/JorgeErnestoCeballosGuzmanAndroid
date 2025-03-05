package com.example.proyecto05032025;

import android.app.Activity;
import android.content.Context;
import android.widget.Button;
import android.widget.TextView;

public class CalculadoraUI implements iCalculadoraUI {

    ICalculadoraMemoria memoria = new CalculadoraMemoria();
    Context context;
    TextView txvDisplay;
    Button btnSuma;
    Button btnResta;
    Button btnDivision;
    Button btnMultiplicacion;
    Button btnPunto;
    Button btnPorcentaje;
    Button btnMAsMenos;
    Button btnIgual;
    Button btnClear;
    Button btnUno;
    Button btnDos;
    Button btnTres;
    Button btnCuatro;
    Button btnCinco;
    Button btnSeis;
    Button btnSiete;
    Button btnOcho;
    Button btnNueve;
    Button btnCero;

    public CalculadoraUI(Activity activity){
        context = activity.getApplicationContext();
        txvDisplay = activity.findViewById(R.id.salida_textView);
        btnCero = activity.findViewById(R.id.cero_button);
        btnUno = activity.findViewById(R.id.uno_button);
        btnDos = activity.findViewById(R.id.dos_button);
        btnTres = activity.findViewById(R.id.tres_button);
        btnCuatro = activity.findViewById(R.id.cuatro_button);
        btnCinco = activity.findViewById(R.id.cinco_button);
        btnSeis = activity.findViewById(R.id.seis_button);
        btnSiete = activity.findViewById(R.id.siete_button);
        btnOcho = activity.findViewById(R.id.ocho_button);
        btnNueve = activity.findViewById(R.id.nueve_button);
        btnIgual = activity.findViewById(R.id.igual_button);
        btnSuma = activity.findViewById(R.id.mas_button);
        btnResta = activity.findViewById(R.id.menos_button);
        btnMultiplicacion = activity.findViewById(R.id.por_button);
        btnDivision = activity.findViewById(R.id.entre_button);
        btnMAsMenos = activity.findViewById(R.id.masmenos_button);
        btnPunto = activity.findViewById(R.id.punto_button);
        btnPorcentaje = activity.findViewById(R.id.porciento_button);
        btnClear =activity.findViewById(R.id.ac_button);

    }

    @Override
    public void clearScreen() {
        txvDisplay.setText("");
        memoria.clear();
    }

    @Override
    public void showResult(String result) {
        txvDisplay.setText(result);
    }

    @Override
    public String addNumber(String numero) {
        txvDisplay.setText(numero);
        return memoria.concat(numero);
    }

    @Override
    public String addOperation(String operacion) {
        return "";
    }

    @Override
    public String addOperation(Operacion operacion) {
        txvDisplay.setText(Operacion.convert(operacion));
        return memoria.concat(numero);
    }

    @Override
    public void makeOperation(Operacion operacion) {
        
    }

    @Override
    public void result() {

    }
}
