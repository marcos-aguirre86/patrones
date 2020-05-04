package com.mitocode.patrones.disenio.decorator;

public class CuentaDecorator implements IntCuentaBancaria{

	protected IntCuentaBancaria cuentaDecorator;
	
	public  CuentaDecorator(IntCuentaBancaria cuenta) {
		this.cuentaDecorator = cuenta;
	}
		
	
	@Override
	public void abrirCueta(Cuenta c) {
		this.cuentaDecorator.abrirCueta(c);
	}

}
