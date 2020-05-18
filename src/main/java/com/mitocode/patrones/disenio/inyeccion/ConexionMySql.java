package com.mitocode.patrones.disenio.inyeccion;

public class ConexionMySql implements IConectar{
	
	private String puerto;
	private String host;
	private String name;
	
	
	 public ConexionMySql() {
		 this.puerto = "2125";
		 this.host = "100.23.43.2";
		 this.name = "rentas";
	}


	@Override
	public void conectar() {
		System.out.println("Se conecto a la BD MySql");
		
	}
	

	
}	