package com.mitocode.java8;

import java.util.ArrayList;
import java.util.List;

public class MainForEach {
	
	List<String> lista = new ArrayList<String>();
	MainForEach(){
		lista.add("Marcos");
		lista.add("Belen");
		lista.add("Isabella");
	}
	
	

	
	public void usarForEach() {
		lista.forEach(System.out::println);
	}
	
	public void usarRemoveIf() {
		lista.removeIf(x -> x.equalsIgnoreCase("Marcos"));
	}
	
	public void sort() {
		lista.sort((x,y)-> x.compareToIgnoreCase(y));
	}
	
	
	
	
	public static void main(String[] args) {
		MainForEach forEach = new MainForEach();
		//forEach.usarRemoveIf();
		forEach.sort();
		forEach.usarForEach();

	}

}
