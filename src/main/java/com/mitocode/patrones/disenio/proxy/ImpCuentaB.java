package com.mitocode.patrones.disenio.proxy;

public class ImpCuentaB implements ICuenta{

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		System.out.println(cuenta.getSaldo());
	}

	@Override
	public Cuenta agregarDinero(Cuenta cuenta, double saldo) {
		cuenta.setSaldo(cuenta.getSaldo() + saldo + 0.20);
		return cuenta;
	}

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double saldo) {
		cuenta.setSaldo(cuenta.getSaldo() - saldo);
		return cuenta;
		
	}
	


}
