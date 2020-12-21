package com.mitocode.patrones.disenio.fabricaAbstracta;

import com.mitocode.patrones.disenio.fabrica.ConexionFabrica;
import com.mitocode.patrones.disenio.fabrica.IntConexion;

public abstract class FabricaAbstracta {
	public abstract IntServiciosRest getRest(String rest);
	public  IntConexion getCnexion(String rest) {
		return new ConexionFabrica().getConexion(rest);
	};
}
