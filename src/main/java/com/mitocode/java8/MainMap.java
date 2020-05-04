package com.mitocode.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MainMap {

	Map<Integer, String> mapa;
	
	public void poblar() {
		mapa = new HashMap<Integer, String>();
		mapa.put(1, "Marcos");
		mapa.put(2, "Belen");
		mapa.put(3, "Isabella");
	}
	
	public void imprimir_v7() {
		for(Entry<Integer, String> valores : mapa.entrySet()) {
			System.out.println("CLAVE: "+valores.getKey()+" - "+ "VALOR: "+valores.getValue());
		}
	}
	
	public void imprimir_v8() {
		mapa.forEach((k,v) -> System.out.println("CLAVE: "+k+" - "+ "VALOR: "+v));
	}
	
	public void insertarSiAusente() {
		mapa.putIfAbsent(4, "Balon");
	}
	
	public void operarSiPresente() {
		mapa.computeIfPresent(3, (k,v) -> v.concat(" Aguirre"));
	}
	
	
	public void recolectar() {
		Map<Integer, String> nuevaLista = mapa.entrySet().stream()
				.filter(e -> e.getValue().contains("a"))
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		
		nuevaLista.forEach((k,v) -> System.out.println("CLAVE: "+k+" - "+ "VALOR: "+v));
	}
	
	public void ordenarMap() {
		
		Map<Integer, String> nuevaLista = mapa .entrySet() .stream() 
				.sorted(Map.Entry.comparingByValue()) 
				.collect( Collectors.toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e1, LinkedHashMap::new));

		
//		Map<Integer, String> nuevaLista = mapa.entrySet().stream()
//				.sorted(Map.Entry.comparingByValue())
//				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()), (e1, e2) -> e2, LinkedHashMap::new);
		
		nuevaLista.forEach((k,v) -> System.out.println("CLAVE: "+k+" - "+ "VALOR: "+v));
		
	}
	
	
	public static void main(String[] args) {
		MainMap mm = new MainMap();
		mm.poblar();
		//mm.imprimir_v7();
//		mm.insertarSiAusente();
//		mm.operarSiPresente();
//		mm.imprimir_v8();
		//mm.recolectar();
		mm.ordenarMap();
	}

}
