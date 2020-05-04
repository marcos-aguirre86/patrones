package com.mitocode.java8;

import java.util.Optional;

public class MainOpcional {
	
	public void orElse(String valor) {
		System.out.println(Optional.ofNullable(valor).orElse("Prdeterminado"));
	}
	
	public void orElseThrow(String valor) {
		System.out.println(Optional.ofNullable(valor).orElseThrow(NumberFormatException::new));
		
	}

	public void isPresent(String valor) {
		System.out.println(Optional.ofNullable(valor).isPresent());
	}
	

	public static void main(String[] args) {
		MainOpcional mo = new MainOpcional();
//		mo.orElse("Marcos");
//		mo.orElseThrow(null);
		mo.isPresent(null);

	}

}
