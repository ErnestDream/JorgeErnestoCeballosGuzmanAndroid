import java.io.*;

Class Calculadora Impl implements ICalculadora {
	public Double calcular(Operacion operacion){
		
		switch (Operacion.getOperando()){
			case SUMA:
				return operacion.getx1() + operacion.getx2;
			
		}
		
		//system.out.println("OP:" + operacion.getOperando());
		//system.out.println("x1" + operacion.getx1());
		//system.out.println("x2" + operacion.getx1());
		//return 0.0;
	}
	
}
