package com.mitocode.patrones.disenio.proxy;

public class MainProxy {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1,"Marcos", 100.0);
		ICuenta intCuenta = new CuentaProxy(new ImpCuentaB());
		intCuenta.mostrarSaldo(cuenta);
		intCuenta.agregarDinero(cuenta, 50.0);
		intCuenta.retirarDinero(cuenta, 20.0);
		intCuenta.mostrarSaldo(cuenta);

	}

}
