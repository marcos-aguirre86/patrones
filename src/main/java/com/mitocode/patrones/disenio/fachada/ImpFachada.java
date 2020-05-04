package com.mitocode.patrones.disenio.fachada;

public class ImpFachada {
	
	private Hotel hotel;
	private Vuelos vuelo;
	
	public ImpFachada() {
		this.setHotel(new Hotel());
		this.setVuelo(new Vuelos());
	}
	
	
	public void buscarPaquetes(String origen, String destino, String lugar, String fechaE, String fechaS) {
		this.hotel.buscador(origen, destino, lugar, fechaE, fechaS);
		this.vuelo.buscador(origen, destino, lugar, fechaE, fechaS);
	}
	

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}

	public Vuelos getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelos vuelo) {
		this.vuelo = vuelo;
	}

}
