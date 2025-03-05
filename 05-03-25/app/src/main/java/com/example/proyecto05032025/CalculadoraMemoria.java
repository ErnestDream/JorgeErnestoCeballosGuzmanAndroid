package com.example.proyecto05032025;

import android.graphics.Path;

public class CalculadoraMemoria implements iCalculadoraMemoria {

    String display = "";

    Operacion operacion;

    @Override
    public String concat(String numero) {
        display += numero;
        return display;
    }

    @Override
    public String concat(Operacion operacion) {
        this.operacion = operacion;
    }

    @Override
    public void clear() {
        display = "";
        operacion = null;
    }


}
