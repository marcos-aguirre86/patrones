package com.mitocode.patrones.disenio.command;

public class ImpDepositar implements ICuenta{
	private Cuenta cuenta;
	private double monto;
	
	 public ImpDepositar(Cuenta cuenta, double monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	 }

	@Override
	public void execute() {
		this.cuenta.depositar(monto);
		
	}

}
