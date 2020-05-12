package com.mitocode.patrones.disenio.strategy;

public class MainStrategy {

	public static void main(String[] args) {
		Contexto strategy = new Contexto(new AntivirusAvanzado());
		strategy.ejecutarEstrategia();
	}

}
