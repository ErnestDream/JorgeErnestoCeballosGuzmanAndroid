import java.io.*;

class Main{

	public static void main(String [] args) {

		Operacion op = new Operacion(10.0, 10.0, Operando.SUMA);
		
		ICalculadora calculadora = new CalculadoraImpl();

		Double resultado = calculadora.calcular(op);
		System.out.println("El resultado de la suma es " + resultado);

		//resta
		op = new Operacion(10.0, 10.0, Operando.RESTA);
                resultado = calculadora.calcular(op);
                System.out.println("El resultado de la resta es " + resultado);

		//Multiplicacion
                op = new Operacion(10.0, 10.0, Operando.MULT);
                resultado = calculadora.calcular(op);
                System.out.println("El resultado de la multiplicacion es " + resultado);

		//Division
                op = new Operacion(10.0, 10.0, Operando.DIV);
                resultado = calculadora.calcular(op);
                System.out.println("El resultado de la division es " + resultado);


	}
}
