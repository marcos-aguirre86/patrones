package com.mitocode.patrones.disenio.decorator;

public class Maindecorator {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta();
		cuenta.setCliente("1");
		cuenta.setCliente("Marcos Aguirre");
		IntCuentaBancaria cuentaCorriente = new ImpCuentaCorrente();
		BlindajeCuentaBancaria blindaje = new BlindajeCuentaBancaria(cuentaCorriente);
		blindaje.abrirCueta(cuenta);

	}

}
