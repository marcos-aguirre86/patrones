package com.mitocode.java8;

public class ScopesLambda implements Operacion {
	
	
	public void defaultMetodos() {
		System.out.println(calcular(10.0, 12.0));
	}
	
	
	@Override
	public double calcular(double p1, double p2) {
		return sumar(p1, p2);
	}
	
	public double calcularResultado(double p1, double p2) {
		Operacion operacion = (x,y) -> x+y;		
		return operacion.calcular(p1, p2);
	}
	

	public static void main(String[] args) {
		ScopesLambda scope = new ScopesLambda();
//		scope.defaultMetodos();
		System.out.println(scope.calcularResultado(10.0,20.0));

	}

	
}
