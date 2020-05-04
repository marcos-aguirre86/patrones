package com.mitocode.patrone.disenio.fabrica.abstracta;

import com.mitocode.patrones.desenio.fabrica.ConexionFabrica;
import com.mitocode.patrones.desenio.fabrica.IntConexion;

public abstract class FabricaAbstracta {
	public abstract IntServiciosRest getRest(String rest);
	public  IntConexion getCnexion(String rest) {
		return new ConexionFabrica().getConexion(rest);
	};
}
