package com.mitocode.patrones.disenio.inyeccion;

import java.util.ArrayList;
import java.util.List;

public class ImpPersonaDao implements IPersona{
	
	private IConectar db;
	private List<Persona> listPersonas;
	
	public ImpPersonaDao(IConectar conexion) {
		this.db = conexion;
		Persona marcos = new Persona(3230545,"Marcos");
		Persona belen = new Persona(34672090,"Belen");
		listPersonas = new ArrayList<Persona>();
		listPersonas.add(marcos);
		listPersonas.add(belen);
	}

	@Override
	public List<Persona> listarPersonas() {
		return listPersonas;
	}

	@Override
	public Persona getnombre(int dni) {
		return listPersonas.get(dni);
	}

}
