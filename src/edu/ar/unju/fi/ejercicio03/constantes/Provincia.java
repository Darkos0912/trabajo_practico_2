package edu.ar.unju.fi.ejercicio03.constantes;

public enum Provincia {
	JUJUY(811611,53291), SALTA(1333000, 155488), TUCUMAN(1593000, 22525), CATAMARCA(396895, 102602), LA_RIOJA(362605, 89680), SANTIAG_DEL_ESTERO(1060906, 136351);
	
	private int cantidadPoblacion;
	private int superficie;
	
	private Provincia(int cantidadPoblacion, int superficie) {
		this.cantidadPoblacion = cantidadPoblacion;
		this.superficie = superficie;
	}

	public int getCantidadPoblacion() {
		return cantidadPoblacion;
	}

	public int getSuperficie() {
		return superficie;
	}
	
	public double DensidadPoblacional() {
		double calculo = cantidadPoblacion / superficie;
		return calculo;
	}
	
}
