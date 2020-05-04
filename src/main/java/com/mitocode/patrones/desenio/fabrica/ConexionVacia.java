package com.mitocode.patrones.desenio.fabrica;

public class ConexionVacia implements IntConexion{
	
	@Override
	public void conectar() {		
		System.out.println("No se encuentra la conexion especificada");
	}

	@Override
	public void desconectar() {
		System.out.println("Saliendo.......");
	}

}
