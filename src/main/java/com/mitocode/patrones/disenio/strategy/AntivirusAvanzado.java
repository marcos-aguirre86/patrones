package com.mitocode.patrones.disenio.strategy;

public class AntivirusAvanzado extends AnalisisAvanzado{

	@Override
	public void file() {
		System.out.println("Analizando los archivos del escritorio......");
		
	}

	@Override
	public void rar() {
		System.out.println("Analizando los archivos RAR......");
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void zip() {
		System.out.println("Analizando los archivos ZIP......");
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void doc() {
		System.out.println("EROR al analizar los arcivos doc......");
		
	}

}
