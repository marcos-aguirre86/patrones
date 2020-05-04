package com.mitocode.patrones.disenio.memento;

public class Juego {
	private int chekPoint;
	private String nombreJuego;
	
	
	public int getChekPoint() {
		return chekPoint;
	}
	public void setChekPoint(int chekPoint) {
		this.chekPoint = chekPoint;
	}
	public String getNombreJuego() {
		return nombreJuego;
	}
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	
	@Override
	public String toString() {
		return "Nombre juego: " +this.nombreJuego + " CheckPoint: " + this.chekPoint;
	}
	
	

}
