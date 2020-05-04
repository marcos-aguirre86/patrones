package com.mitocode.java8;

import java.util.ArrayList;
import java.util.List;

public class MainStreamParalelos {

	List<Integer> numeros = new ArrayList<Integer>();
	
	public void llenar() {
		for(int i=0; i<10; i++) {
			numeros.add(i);
		}
	}
	
	public void stream() {
		numeros.stream().forEach(System.out::println);
	}
	
	public void streamParalelos() {
		numeros.parallelStream().forEach(System.out::println);
	}
	
	
	public static void main(String[] args) {
		MainStreamParalelos msp = new MainStreamParalelos();
		msp.llenar();
		//msp.stream();
		msp.streamParalelos();

	}

}
