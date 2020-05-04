package com.mitocode.patrones.desenio.singleton;

/** 
 * Patrones de diseño: 
 * -Creacion: Creacion de clases, inicializacion y creacion de objetos.
 * -Comportamiento: Describe a los objetos, clases y describir la comunicacion entre ellos.
 * -Estructural: Separa la interface de la implementacion.
 *  Fuente: https://es.slideshare.net/SebastianRamrez2/patrones-diseo-1
 *  	    https://sourcemaking.com/design_patterns
 *  		https://www.tutorialspoint.com/design_pattern/
 * **/

public class Singleton {
	
	private static Singleton instancia;
	
	private Singleton() {}
	
	public static Singleton getInstancia() {
		if(instancia == null) {
			instancia = new Singleton();
			System.out.println("Se crea un nuevo objeto singleton");
		}else {
			System.out.println("Ya se encuentra creado un objeto singleton");
		}
		return instancia;
	}

	public static void main(String[] args) {
		Singleton sig = Singleton.getInstancia();
		System.out.println(sig instanceof Singleton);
		Singleton sig2 = Singleton.getInstancia();
		Singleton sig3 = Singleton.getInstancia();
		Singleton sig4 = Singleton.getInstancia();
		Singleton sig5 = Singleton.getInstancia();
		Singleton sig6 = Singleton.getInstancia();
		

	}

}
