package com.mitocode.patrones.disenio.strategy;

public abstract class AnalisisAvanzado implements IEstrategia{

	public void analizar() {
		this.file();
		this.rar();
		this.zip();
		this.doc();
	}
	
	
	public abstract void file();
	public abstract void rar();
	public abstract void zip();
	public abstract void doc();
}
