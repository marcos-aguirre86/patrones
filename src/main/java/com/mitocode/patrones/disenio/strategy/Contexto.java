package com.mitocode.patrones.disenio.strategy;

public class Contexto {
	IEstrategia strategy;
	
	public Contexto(IEstrategia estrategia) {
		this.strategy = estrategia;
	}
	
	
	public void ejecutarEstrategia() {
		this.strategy.analizar();
	}

}
