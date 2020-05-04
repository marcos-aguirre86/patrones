package com.mitocode.patrones.disenio.prototype;

public abstract class AbstractPrototype implements Cloneable {

	private String id;
	private String type;
	
	public abstract void cuenta();
	
	
	public Object clon() {
		Object cuenta = null;
		
		if(cuenta == null) {
			try {
				cuenta = super.clone();
			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}
		}
		return cuenta;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	
	
}
