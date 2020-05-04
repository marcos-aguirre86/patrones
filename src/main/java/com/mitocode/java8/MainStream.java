package com.mitocode.java8;

import java.util.ArrayList;
import java.util.List;

public class MainStream {

	private List<String> nombres = new ArrayList<String>();
	private List<String> numeros = new ArrayList<String>();
	
	MainStream(){
		nombres.add("Marcos");
		nombres.add("Belen");
		nombres.add("Isbella");
		nombres.add("Balon");
		
		numeros.add("1");
		numeros.add("2");
	}
	
	
	public void filtrar() {
		nombres.stream().filter(x -> x.startsWith("B")).forEach(System.out :: println);
	}
	
	public void ordenar() {
		nombres.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out :: println);
	}
	
	public void transformar() {
		nombres.stream().map(String :: toUpperCase).forEach(System.out::println);
		//numeros.stream().map(x -> Integer.parseInt(x)).forEach(System.out::println);
	}
	
	public void limitar() {
		nombres.stream().limit(2).forEach(System.out::println);
	}
	
	public void contar() {
		long cant = nombres.stream().count();
		System.out.println(cant);
	}
	
	
	
	public static void main(String[] args) {
		MainStream ms = new MainStream();
		//ms.filtrar();
		//ms.ordenar();
		//ms.transformar();
		//ms.limitar();
		ms.contar();

	}

}
