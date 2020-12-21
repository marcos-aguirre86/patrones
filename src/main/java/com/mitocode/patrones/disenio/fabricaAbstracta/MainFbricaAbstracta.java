package com.mitocode.patrones.disenio.fabricaAbstracta;

public class MainFbricaAbstracta {

	public static void main(String[] args) {
		FabricaAbstracta fabrica = FabricaProductor.getFabricaProductor("rest");
		IntServiciosRest servicio = fabrica.getRest("google");
			servicio.leerurl("");
	}

}
