package com.mitocode.patrones.disenio.strategy;

public class AntivirusSimple extends AnalisisSimple{

	@Override
	public void file() {
		System.out.println("Analizando los archivos del escritorio......");
		
	}

	@Override
	public void zipe() {
		System.out.println("Analizando los archivos del escritorio zip......");
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void dll() {
		System.out.println("Analizando los archivos dll......");
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
