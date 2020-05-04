package com.mitocode.patrones.disenio.decorator;

public class ImpCuentaCorrente implements IntCuentaBancaria{

	@Override
	public void abrirCueta(Cuenta c) {
		System.out.println("Se abrio una cuenta corriente a nombre de: ".concat(c.getCliente()));
		
	}

}
