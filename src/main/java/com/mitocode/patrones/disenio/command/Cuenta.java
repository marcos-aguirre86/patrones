package com.mitocode.patrones.disenio.command;
/** Request **/
public class Cuenta {

	private int id;
	private double saldo;
	
	public Cuenta(int id, double saldo) {
		this.setId(id);
		this.setSaldo(saldo);
	}
	
	
	public void depositar(double saldo) {
		this.setSaldo(this.getSaldo() + saldo);
		System.out.println("Se depositaron: " + saldo);
	}
	
	public void retirar(double saldo) {
		this.setSaldo(this.getSaldo() - saldo);
		System.out.println("Se retiro: " + saldo);
	}


	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
}
