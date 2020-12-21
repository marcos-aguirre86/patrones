package com.mitocode.patrones.disenio.fabrica;

public class ConexionOracle implements IntConexion{
	
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

	@Override
	public void desconectar() {
		System.out.println("Se desconecto a la BD Oracle");
	}

}
