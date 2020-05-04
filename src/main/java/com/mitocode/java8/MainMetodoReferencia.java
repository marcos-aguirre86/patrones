package com.mitocode.java8;

import java.util.Arrays;

public class MainMetodoReferencia {

	public static void metodoReferenciaStatica() {
		System.out.println("Metodo por referencia statica");
	}
	
	public void operar() {
		OperacionMetodoReferencia omr = MainMetodoReferencia::metodoReferenciaStatica;
		omr.saludar();
	}
	
	public  void metodoReferenciaObjetoArbitrario() {
		String [] nombres = {"Marcos", "Belen" ,"Isabella"};
//		Arrays.sort(nombres, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				return o1.compareToIgnoreCase(o2);
//			}
//		});
		
		//Arrays.sort(nombres, (n1,n2)-> n1.compareToIgnoreCase(n2));
		Arrays.sort(nombres, String::compareToIgnoreCase);
		System.out.println("Nombres: " + Arrays.toString(nombres));
	}

	public void metodoReferenciaObjetoParticular() {
		System.out.println("Método referencia de un objeto en paticular");
	}
	
	public void metodoReferenciaConstructor() {
//		IPersona persona1 = new IPersona() {
//			@Override
//			public Persona Crear(int id, String nombre) {
//				return new Persona(id, nombre);
//			}
//		};
		
		//IPersona persona2 = (x,y) -> (new Persona(x,y));
		IPersona persona3 = Persona::new;
		Persona personacreada = persona3.Crear(1, "Marcos Aguirre");
		
		//Persona personacreada = persona1.Crear(1, "Marcos Aguirre");
		System.out.println(personacreada.getId()+ " - " + personacreada.getNombre());
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		MainMetodoReferencia metodoReferencia = new MainMetodoReferencia();
//		metodoReferencia.metodoReferenciaObjetoArbitrario();
//		OperacionMetodoReferencia referencia = metodoReferencia :: metodoReferenciaObjetoParticular;
//		referencia.saludar();
		metodoReferencia.metodoReferenciaConstructor();

	}

}
