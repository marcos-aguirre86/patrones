package com.mitocode.patrones.disenio.observer;

public class MainObserver {

	public static void main(String[] args) {
		Subject sujeto = new Subject();
		
		new DineroArgentina(sujeto);
		new DineroMexicano(sujeto);
		
		System.out.println("Comprar $ 38 te sale: ");
		sujeto.setState(38);
		System.out.println("Comprar $ 100 te sale: ");
		sujeto.setState(100);
		

	}

}
