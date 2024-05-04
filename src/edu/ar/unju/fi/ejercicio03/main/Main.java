package edu.ar.unju.fi.ejercicio03.main;



import edu.ar.unju.fi.ejercicio03.constantes.Provincia;

public class Main {

	public static void main(String[] args) {
		Provincia[] arrProvincia = Provincia.values();
		
		for(Provincia provincia : arrProvincia) {
			System.out.println("La Provincia de " + provincia + " tiene una población total de " + provincia.getCantidadPoblacion() + ", y tiene una superficie de " + 
		    provincia.getSuperficie() + " km2. La densidad poblacional es de " + provincia.DensidadPoblacional() + " hab/km2");
		}
	}

}
