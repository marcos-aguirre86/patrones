package com.mitocode.patrones.disenio.memento;

public class Memento {
	private Juego juego;
	
	
	public Memento(Juego juego) {
		this.juego = juego;
	}


	public Juego getJuego() {
		return juego;
	}

}
