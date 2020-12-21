package com.mitocode.patrones.disenio.fabricaAbstracta;

public class ImpServiciosRest extends FabricaAbstracta{

	@Override
	public IntServiciosRest getRest(String rest) {
		if(rest == null) {
			return null;
		}
		
		if(rest.equalsIgnoreCase("google")) {
			return new ServiciosGoogle();
		}
		if(rest.equalsIgnoreCase("amazon")) {
			return new ServiciosAmazon();
		}
		
		return null;
	}
}
