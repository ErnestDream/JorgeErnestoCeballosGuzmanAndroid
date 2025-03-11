package com.example.proyecto05032025;

import java.math.BigDecimal;

public interface iCalculadoraMemoria {

    String concat(String numero);
    String concat(Operacion operacion);
    Operacion getOperacion();
    BigDecimal getX();
    BigDecimal getY();
    void clear();
    void igual();
}
