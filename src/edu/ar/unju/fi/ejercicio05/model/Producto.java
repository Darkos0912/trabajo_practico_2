package edu.ar.unju.fi.ejercicio05.model;


public class Producto {
	private String código;
	private String descripción;
	private Double precioUnitario;
	private OrigenFabricacion origenfabricacion;
	private Categoria categoria;
	private boolean estado;
	
	public enum OrigenFabricacion {
		ARGENTINA, BRASIL, CHILE, URUGUAY
	}
	
	public enum Categoria{
		TELEFONIA, INFORMATICA, ELECTROHOGAR, HERRAMIENTAS
	}
	
	public Producto() {
		// TODO Auto-generated constructor stub
	}
	
	

	public Producto(String código, String descripción, Double precioUnitario, OrigenFabricacion origenfabricacion,
			Categoria categoria, boolean estado) {
		this.código = código;
		this.descripción = descripción;
		this.precioUnitario = precioUnitario;
		this.origenfabricacion = origenfabricacion;
		this.categoria = categoria;
		this.estado = estado;
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

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Producto [código=" + código + ", descripción=" + descripción + ", precioUnitario=" + precioUnitario
				+ ", origenfabricacion=" + origenfabricacion + ", categoria=" + categoria + ", estado=" + estado + "]";
	}
	
	

}
