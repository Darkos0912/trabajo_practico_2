package edu.ar.unju.fi.ejercicio06.model;

public class FelinoSalvaje {
	private String nombre;
	private byte Edad;
	private float peso;
	
	public FelinoSalvaje() {
		// TODO Auto-generated constructor stub
	}

	public FelinoSalvaje(String nombre, byte edad, float peso) {
		this.nombre = nombre;
		Edad = edad;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public byte getEdad() {
		return Edad;
	}

	public void setEdad(byte edad) {
		Edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "FelinoSalvaje [nombre=" + nombre + ", Edad=" + Edad + ", peso=" + peso + "]";
	}
	
	
}
