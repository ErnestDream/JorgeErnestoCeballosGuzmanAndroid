package com.example.proyecto05032025;

import java.math.BigDecimal;

public interface iCalculadora {

    //ENcargado de hacer las operciones

    BigDecimal calculate(Operacion operacion, BigDecimal x, BigDecimal y);

}
