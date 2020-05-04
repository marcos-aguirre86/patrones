package com.mitocode.java8;

@FunctionalInterface
public interface Operacion {
	
	public default double sumar(double p1,double p2) {
		return p1+p2;
	}
	
	public double calcular(double p1, double p2);

}
