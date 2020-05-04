package com.mitocode.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainFuntionAltoOrden {

	
	private Function<String, String> convertirmayuscula = x -> x.toUpperCase();
	private Function<String, String> convertirminuscula = x -> x.toLowerCase();
	
	public void imprimir(Function<String, String> funcion, String valor) {
		System.out.println(funcion.apply(valor));
	}
	
	private Function<String, String> mostrar(String message){
		return (String x) -> message + x;
	}
	
	public void filtrar(List<String> lista, Consumer<String> consumidor, int longitud, String nombre) {
		lista.stream().filter(this.filtrarValores(nombre)).forEach(consumidor);
	}
	
	public Predicate<String> filtrarValores(int longitud){
		return texto -> texto.length() < longitud;
	}
	
	public Predicate<String> filtrarValores(String nombre){
		return texto -> texto.contains(nombre);
	}
	
	
	
	public static void main(String[] args) {
		MainFuntionAltoOrden app = new MainFuntionAltoOrden();
//		app.imprimir(app.convertirmayuscula, "marquitos");
//		app.imprimir(app.convertirminuscula, "MARQUITOS");
		//System.out.println(app.mostrar("Marquitos").apply(" hola"));
		
		List<String> add = new ArrayList<String>();
		add.add("Marcos");
		add.add("Belen");
		add.add("Isabella");
		add.add("Balon");
		
//		app.filtrar(add, System.out::println, 6, null);
		app.filtrar(add, System.out::println, 6, "a");
	}

}
