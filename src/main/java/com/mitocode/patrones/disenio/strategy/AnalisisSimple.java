package com.mitocode.patrones.disenio.strategy;

public abstract class AnalisisSimple implements IEstrategia{
	
	public void analizar() {
		this.file();
		this.zipe();
		this.dll();
		
	}
	
	
	public abstract void file();
	public abstract void zipe();
	public abstract void dll();
}
