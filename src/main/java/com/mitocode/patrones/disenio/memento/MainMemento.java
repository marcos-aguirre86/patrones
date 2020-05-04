package com.mitocode.patrones.disenio.memento;

public class MainMemento {

	public static void main(String[] args) {
		Juego juego = new Juego();
		
		juego.setNombreJuego("Mario Bros");
		juego.setChekPoint(10);
		Originator estado = new Originator();
		CareTaker trakeo = new CareTaker();
		trakeo.addMemento(estado.guardarEstadoMemento(juego));
		
		juego = new Juego();
	
		juego.setChekPoint(23);
		trakeo.addMemento(estado.guardarEstadoMemento(juego));
		
		
		estado.getEstateMemento(trakeo.getMementoEstado(0));
		juego = estado.getJuego();
		System.out.println(juego);

	}

}
