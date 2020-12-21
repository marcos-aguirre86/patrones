package com.mitocode.patrones.disenio.fabrica;

public class MainFabrica {

	public static void main(String[] args) {
		ConexionFabrica fabrica = new ConexionFabrica();
		
		IntConexion oracle = fabrica.getConexion("oracle");
		oracle.conectar();
		
		IntConexion mysql = fabrica.getConexion("mysql");
		mysql.conectar();
		
		IntConexion pasgret = fabrica.getConexion("posgret");
		pasgret.conectar();
		
	}

}
