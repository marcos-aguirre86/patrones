package com.mitocode.patrones.disenio.command;

public class MainCommand {

	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1,100.00);
		ICuenta depositar = new ImpDepositar(cuenta, 90.0);
		ICuenta retirar = new ImpRetirar(cuenta, 50.0);
		Invoker command = new Invoker();
		command.addInvoker(depositar);
		command.addInvoker(retirar);
		
		command.exeInvoker();

	}

}
