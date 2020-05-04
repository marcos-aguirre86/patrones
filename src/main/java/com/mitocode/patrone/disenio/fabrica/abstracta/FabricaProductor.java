package com.mitocode.patrone.disenio.fabrica.abstracta;

public class FabricaProductor {
	public static FabricaAbstracta getFabricaProductor(String identificador) {
		if(identificador.equalsIgnoreCase("Rest"))
			return new ImpServiciosRest();
		if(identificador.equalsIgnoreCase("bd"))
			return null;
		
		return null;
	}	
}
