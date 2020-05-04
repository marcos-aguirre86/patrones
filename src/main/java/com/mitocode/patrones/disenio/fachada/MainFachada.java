package com.mitocode.patrones.disenio.fachada;

public class MainFachada {

	public static void main(String[] args) {
		ImpFachada fachada1 = new ImpFachada();
		fachada1.buscarPaquetes("Córdoba", "Colombia", "Quito", "24/04/2019", "24/05/2019");
		
		ImpFachada fachada2 = new ImpFachada();
		fachada2.buscarPaquetes("Fromosa", "Perú", "Lima", "24/04/2019", "24/05/2019");

	}

}
