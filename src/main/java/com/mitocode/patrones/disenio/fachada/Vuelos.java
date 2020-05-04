package com.mitocode.patrones.disenio.fachada;

public class Vuelos implements IBuscador{

	@Override
	public void buscador(String origen, String destino, String lugar, String fechaE, String fechaS) {
		System.out.println("-----VUELOS-------");
		System.out.println("-------Ciudad origen: " + origen + "------------");
		System.out.println("-----Ciudad destino: " + destino);
	}

}
