package com.mitocode.patrones.disenio.observer;

public class DineroArgentina extends Observer{

	private double dolarArgentino = 63.78;
	
	public  DineroArgentina(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}
	
	
	@Override
	public void update() {
		System.out.println("Pesos Argentinos: " + this.sujeto.getState() * dolarArgentino);
		
	}

}
