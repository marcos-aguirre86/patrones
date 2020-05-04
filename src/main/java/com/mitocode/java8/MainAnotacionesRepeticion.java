package com.mitocode.java8;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MainAnotacionesRepeticion {
	
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Lenguajes{
		InterfaceAnnotation[] value() default{};
	}
	
	@Repeatable(value = Lenguajes.class)
	public @interface InterfaceAnnotation {
		 String value();
	}
	
	
	
	@InterfaceAnnotation("Java")
	@InterfaceAnnotation("Angular")
	public interface LeguajesProgramacion{}
	

	public static void main(String[] args) {
		InterfaceAnnotation[] listaLenguajes = LeguajesProgramacion.class.getAnnotationsByType(InterfaceAnnotation.class);
		System.out.println("Cantida de valores " + listaLenguajes.length);

	}

}
