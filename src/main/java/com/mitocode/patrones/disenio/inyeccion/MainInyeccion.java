package com.mitocode.patrones.disenio.inyeccion;

public class MainInyeccion {

	public static void main(String[] args) {
		IConectar dataSource = new ConexionMySql();
		dataSource.conectar();
		
		ImpPersonaDao personas = new ImpPersonaDao(dataSource);
		personas.listarPersonas().forEach(x-> System.out.println(x.getDni() + " "+ x.getNombre()));
	}

}
