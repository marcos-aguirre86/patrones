package com.mitocode.patrones.disenio.memento;

public class Originator {
	private Juego juego;

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}
	
	public Memento guardarEstadoMemento(Juego juego) {
		return new Memento(juego);
	}
	
	public void getEstateMemento(Memento memento) {
		this.juego = memento.getJuego();
	} 

}
