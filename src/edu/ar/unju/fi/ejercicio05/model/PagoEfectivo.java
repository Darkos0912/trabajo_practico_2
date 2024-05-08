package edu.ar.unju.fi.ejercicio05.model;

import java.time.LocalDate;

import edu.ar.unju.fi.ejercicio05.interfaces.IPago;

public class PagoEfectivo implements IPago{
	
	private double montoPagado;
	private LocalDate fechaDePago;
	
	public PagoEfectivo() {
		// TODO Auto-generated constructor stub
	}
	
	
	public PagoEfectivo(LocalDate fechaDePago) {
		this.fechaDePago = fechaDePago;
	}

	
	public double realizarPago(double monto) {
		return this.montoPagado = monto / 1.10;
		
	}
	
	public String imprimirRecibo() {
		return
				"\nFecha de pago: " + this.getFechaDePago() + "\n" +
				"Monto pagado: " + this.getMontoPagado();
	}

	public double getMontoPagado() {
		return montoPagado;
	}

	public void setMontoPagado(double montoPagado) {
		this.montoPagado = montoPagado;
	}

	public LocalDate getFechaDePago() {
		return fechaDePago;
	}

	public void setFechaDePago(LocalDate fechaDePago) {
		this.fechaDePago = fechaDePago;
	}

	
	
}
