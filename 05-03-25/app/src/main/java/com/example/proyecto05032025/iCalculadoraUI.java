package com.example.proyecto05032025;

public interface iCalculadoraUI {


    void clearScreen();
    void showResult(String result);
    String addNumber(String numero);

    String addOperation(String operacion);
    void makeOperation(Operacion operacion);

    void result();

}
