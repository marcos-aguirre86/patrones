package com.mitocode.java8;

public class MainFunctional{

	public double imprimirResultado(double x, double y) {
		FunctionalIntarface function = (n1,n2)->  n1+n2;
		return function.calcular(x, y);
	}
	
	
	public static void main(String[] args) {
		MainFunctional funcional = new MainFunctional();
		double result = funcional.imprimirResultado(4,7);
		System.out.println(result);
	}

	

}
