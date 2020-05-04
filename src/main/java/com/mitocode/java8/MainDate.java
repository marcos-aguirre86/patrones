package com.mitocode.java8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;	

public class MainDate {


	public void verificar() {
		LocalDate fechaNacimiento = LocalDate.of(1986, 07, 18);
		LocalDate fechaActual = LocalDate.now();
		System.out.println(fechaActual.isAfter(fechaNacimiento));
		System.out.println(fechaActual.isBefore(fechaNacimiento));
	}
	
	public void medirTiempo() throws InterruptedException {
		Instant inicio = Instant.now();
		Thread.sleep(1);
		Instant fin = Instant.now();
		System.out.println("Tiempo transcurrido: " + Duration.between(inicio, fin).toMillis());
	}
	
	public void periodoEntreFecha() throws InterruptedException {
		LocalDate nacimiento = LocalDate.of(1986, 07, 18);
		LocalDate actual = LocalDate.now();
		
		Period periodo = Period.between(nacimiento, actual);
		System.out.println("Años trascuridos desde el nacimiento : " + periodo.getYears() + " meses: " + periodo.getMonths()
		+ " dias: " + periodo.getDays());
	}
	
	public void convertirFecha() throws ParseException {
		String fechaInicial = "1986/07/18";
		DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formato.parse(fechaInicial);
		System.out.println("Formato java 1.7 : " + date);
		
		String fechaCumple = "18/07/1986";
		DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fecha = LocalDate.parse(fechaCumple,formateador);
		System.out.println("Formato java 1.8 : " + formateador.format(fecha));
	}
	
	
	
	
	public static void main(String[] args) {
		MainDate date = new MainDate();
		//date.verificar();
		try {
			//date.medirTiempo();
			//date.periodoEntreFecha();
			date.convertirFecha();
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}
