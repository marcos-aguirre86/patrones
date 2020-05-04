package com.mitocode.patrone.disenio.fabrica.abstracta;

public class MainFbricaAbstracta {

	public static void main(String[] args) {
		FabricaAbstracta fabrica = FabricaProductor.getFabricaProductor("rest");
		IntServiciosRest servicio = fabrica.getRest("google");
			servicio.leerurl("");
	}

}
