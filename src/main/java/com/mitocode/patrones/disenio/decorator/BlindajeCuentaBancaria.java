package com.mitocode.patrones.disenio.decorator;

public class BlindajeCuentaBancaria extends CuentaDecorator{

	public BlindajeCuentaBancaria(IntCuentaBancaria cuenta) {
		super(cuenta);
	}
	
	
	@Override
	public void abrirCueta(Cuenta c) {
		cuentaDecorator.abrirCueta(c);
		agregarBlindaje();
	}
	
	
	public void agregarBlindaje() {
		System.out.println("Se agrego el blindaje a la cuenta...");
	}

}
