package com.mitocode.patrones.disenio.prototype;

public class Cuenta extends AbstractPrototype{
	
	private String cuenta;
	private double monto;
	
	public Cuenta(){
		this.setMonto(100.0);
	}

	@Override
	public void cuenta() {
		System.out.println("Se creo una nueva cuenta");
		
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

}
