package com.example.proyecto05032025;

import android.graphics.Path;

import java.math.BigDecimal;

public class CalculadoraMemoria implements iCalculadoraMemoria {
    private String display = "0.0";
    private Operacion operacion;
    private BigDecimal x;
    private BigDecimal y;

    @Override
    public String concat(String numero) {
        display += numero;
        return display;
    }
    @Override
    public String concat(Operacion operacion) {
        this.operacion = operacion;
        this.x = BigDecimal.valueOf(Long.parseLong(display));
        this.display = "";
        return "";
    }
    @Override
    public Operacion getOperacion()
    {
        return operacion;
    }
    @Override
    public BigDecimal getX()
    {
        return x;
    }
    @Override
    public BigDecimal getY()
    {
        return y;
    }
    @Override
    public void clear()
    {
        display = "";
        operacion = Operacion.NONE;
                x = BigDecimal.ZERO;
                y = BigDecimal.ZERO;
    }

    @Override
    public void igual() {
        this.y = BigDecimal.valueOf(Long.parseLong(display));
    }

}
