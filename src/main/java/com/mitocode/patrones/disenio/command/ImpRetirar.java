package com.mitocode.patrones.disenio.command;

public class ImpRetirar implements ICuenta{
	public Cuenta cuenta;
	public double monto;
	
	public ImpRetirar(Cuenta cuenta, double monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	}

	@Override
	public void execute() {
		this.cuenta.retirar(monto);
		
	}

}
