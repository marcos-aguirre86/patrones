package com.mitocode.patrones.disenio.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {

	List<Memento> listadoMementos = new ArrayList<Memento>();
	
	public void addMemento(Memento memento) {
		this.listadoMementos.add(memento);
	}
	
	public Memento getMementoEstado(int posicion) {
		return this.listadoMementos.get(posicion);
	}
}
