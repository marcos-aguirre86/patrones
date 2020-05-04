package com.mitocode.patrones.disenio.proxy;

public class CuentaProxy implements ICuenta{
	
	private ICuenta impCuenta;
	
	public CuentaProxy(ICuenta impCuenta) {
		this.impCuenta = impCuenta;
	}

	@Override
	public void mostrarSaldo(Cuenta cuenta) {
		if(this.impCuenta == null) {
			this.impCuenta = new ImpCuenta();
			this.impCuenta.mostrarSaldo(cuenta);
		}else {
			this.impCuenta.mostrarSaldo(cuenta);
		}
		
	}

	@Override
	public Cuenta agregarDinero(Cuenta cuenta, double sldo) {
		if(this.impCuenta == null) {
			this.impCuenta = new ImpCuenta();
			return this.impCuenta.agregarDinero(cuenta, sldo);
		}else {
			return this.impCuenta.agregarDinero(cuenta, sldo);
		}
	}

	@Override
	public Cuenta retirarDinero(Cuenta cuenta, double sldo) {
		if(this.impCuenta == null) {
			this.impCuenta = new ImpCuenta();
			return this.impCuenta.retirarDinero(cuenta, sldo);
		}else {
			return this.impCuenta.retirarDinero(cuenta, sldo);
		}
	}

}
