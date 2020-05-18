package com.mitocode.patrones.disenio.inyeccion;

public class ConexionOracle implements IConectar{
	
	private String puerto = "2125";
	private String host = "100.23.43.2";
	private String name = "rentas";
	
	public ConexionOracle() {
		this.puerto = "2125";
		this.host = "100.23.43.2";
		this.name = "rentas";
	}
	

	@Override
	public void conectar() {		
		System.out.println("Se conecto a la BD Oracle");
	}


}
