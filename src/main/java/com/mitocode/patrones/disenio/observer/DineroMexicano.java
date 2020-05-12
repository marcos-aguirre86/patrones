package com.mitocode.patrones.disenio.observer;

public class DineroMexicano extends Observer{
	
	private double dolarMexicano = 23.45;
	
	public DineroMexicano(Subject subject) {
		this.sujeto = subject;
		this.sujeto.agregar(this);
	}

	@Override
	public void update() {
		System.out.println("Pesos Mexicanos: " + this.sujeto.getState() * dolarMexicano);
	}

}
