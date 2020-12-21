package com.mitocode.patrones.disenio.fabrica;

public class ConexionFabrica {
	
	
	public IntConexion getConexion(String identificador) {
		
		if(identificador == null) {
			return new ConexionVacia();
		}
		
		if(identificador.equalsIgnoreCase("oracle")) {
			return new ConexionOracle();
		}
		if(identificador.equalsIgnoreCase("mysql")) {
			return new ConexionMySql();
		}
		
		return new ConexionVacia();
		
	}

}
