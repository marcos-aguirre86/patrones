package com.mitocode.patrones.disenio.proxy;

/** Command**/
public interface ICuenta {
	public void mostrarSaldo(Cuenta cuenta);
	public Cuenta agregarDinero(Cuenta cuenta, double sldo);
	public Cuenta retirarDinero(Cuenta cuenta, double sldo);

}
