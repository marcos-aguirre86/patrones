package com.mitocode.patrones.disenio.decorator;

public class ImpCuentaAhorro implements IntCuentaBancaria{

	@Override
	public void abrirCueta(Cuenta c) {
		System.out.println("Se abrio una cuenta de ahorro a nombre de: ".concat(c.getCliente()));
	}

}
