package com.mitocode.patrones.desenio.fabrica;

public class ConexionMySql implements IntConexion{
	
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

	@Override
	public void desconectar() {
		System.out.println("Se desconecto a la BD MySql");
	}
	
}	