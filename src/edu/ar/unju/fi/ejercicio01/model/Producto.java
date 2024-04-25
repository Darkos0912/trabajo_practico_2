package edu.ar.unju.fi.ejercicio01.model;

public class Producto {
	
	private String código;
	private String descripción;
	private Double precioUnitario;
	private OrigenFabricacion origenfabricacion;
	private Categoria categoria;
	
	public enum OrigenFabricacion {
		ARGENTINA, BRASIL, CHILE, URUGUAY
	}
	
	public enum Categoria{
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
	}
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}

	public String getCódigo() {
		return código;
	}

	public void setCódigo(String código) {
		this.código = código;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public Double getPrecioUnitario() {
		return precioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}

	public OrigenFabricacion getOrigenfabricacion() {
		return origenfabricacion;
	}

	public void setOrigenfabricacion(OrigenFabricacion origenfabricacion) {
		this.origenfabricacion = origenfabricacion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Producto [código=" + código + ", descripción=" + descripción + ", precioUnitario=" + precioUnitario
				+ ", origenfabricacion=" + origenfabricacion + ", categoria=" + categoria + "]";
	}
	
	

}
