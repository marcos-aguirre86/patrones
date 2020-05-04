package com.mitocode.patrones.disenio.fachada;

public class Hotel implements IBuscador{

	@Override
	public void buscador(String origen, String destino, String lugar, String fechaE, String fechaS) {
		System.out.println("-----HOTELES-------");
		System.out.println("-------Hotel: " + lugar + "------------");
		System.out.println("-----Fecha ingreso: " + fechaE + "-----Fecha egreso: " + fechaE);
	}
}
