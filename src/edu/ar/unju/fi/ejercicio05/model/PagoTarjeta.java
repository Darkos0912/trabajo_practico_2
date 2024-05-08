package edu.ar.unju.fi.ejercicio05.model;

import java.time.LocalDate;

import edu.ar.unju.fi.ejercicio05.interfaces.IPago;

public class PagoTarjeta implements IPago{

	private String NumeroTarjeta;
	private LocalDate FechaDePago;
	private double montoPagado;
	
	public double realizarPago(double monto) {
		return this.montoPagado = monto * 1.15;
	}
		
	public String imprimirRecibo() {
		return
				"\nNúmero de tarjeta: " + this.getNumeroTarjeta() + "\n" +
				"Fecha de pago: " + this.getFechaDePago() + "\n" +
				"Monto pagado: " + this.getMontoPagado();
	}
	
	public PagoTarjeta() {
		
	}

	

	public PagoTarjeta(String numeroTarjeta, LocalDate fechaDePago) {
		NumeroTarjeta = numeroTarjeta;
		FechaDePago = fechaDePago;
	}

	public String getNumeroTarjeta() {
		return NumeroTarjeta;
	}


	public void setNumeroTarjeta(String numeroTarjeta) {
		NumeroTarjeta = numeroTarjeta;
	}


	public LocalDate getFechaDePago() {
		return FechaDePago;
	}


	public void setFechaDePago(LocalDate fechaDePago) {
		FechaDePago = fechaDePago;
	}


	public double getMontoPagado() {
		return montoPagado;
	}


	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}
	
	
}
