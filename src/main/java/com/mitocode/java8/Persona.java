package com.mitocode.java8;

public class Persona {
	
	private int id;
	private String nombre;
	
	Persona(int id, String nombre){
		this.id = id;
		this.nombre = nombre;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
