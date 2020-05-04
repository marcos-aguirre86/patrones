package com.mitocode.patrones.disenio.prototype;

public class MainPrototype {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.setCuenta("Marcos Aguirre");
		cuenta.setMonto(400.0);
		Cuenta cuenta2 = (Cuenta) cuenta.clon();
		cuenta2.setMonto(0.0);
		
		System.out.println("Cuenta " + cuenta.getCuenta() + " " +cuenta.getMonto());
		System.out.println("Cuenta 2 " + cuenta2.getCuenta()+ " " +cuenta2.getMonto());
		
		System.out.println(cuenta == cuenta2);

	}

}
