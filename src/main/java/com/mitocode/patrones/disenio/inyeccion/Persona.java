package com.mitocode.patrones.disenio.inyeccion;

public class Persona {

	private int dni;
	private String nombre;
	
	Persona(int dni, String nombre){
		this.dni = dni;
		this.nombre = nombre;
	}
	
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
}
