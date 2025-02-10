import java.io.*;

class CalculadoraImpl implements ICalculadora
{
	public Double calcular(Operacion operacion)
	{
		
		switch (operacion.getOperando())
		{
			case SUMA:
				return operacion.getX1() + operacion.getX2();
			default:
				return 0.0;
		}
		
		//system.out.println("OP:" + operacion.getOperando());
		//system.out.println("x1" + operacion.getx1());
		//system.out.println("x2" + operacion.getx1());
		//return 0.0;
	}
	
}
