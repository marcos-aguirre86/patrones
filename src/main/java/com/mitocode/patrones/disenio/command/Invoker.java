package com.mitocode.patrones.disenio.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	private List<ICuenta> cuentas = new ArrayList<ICuenta>();
	
	public void addInvoker(ICuenta cuenta) {
		this.cuentas.add(cuenta);
	}
	
	public void exeInvoker() {
		this.cuentas.forEach(x-> x.execute());
	}
	

}
