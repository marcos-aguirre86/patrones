package com.mitocode.patrones.disenio.proxy;

public class Cuenta {
	
	private String nombre;
	private double saldo;
	private int idCuenta;
	
	public Cuenta(int idCuenta, String nombre, double saldo) {
		this.idCuenta = idCuenta;
		this.nombre = nombre;
		this.saldo = saldo;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	

}
