package edu.ar.unju.fi.ejercicio06.main;

import edu.ar.unju.fi.ejercicio06.interfaces.funcionales.Converter;
import edu.ar.unju.fi.ejercicio06.model.FelinoDomestico;
import edu.ar.unju.fi.ejercicio06.model.FelinoSalvaje;

public class Main {

	public static void main(String[] args) {
		FelinoSalvaje michi = new FelinoSalvaje("Ajax",(byte)3,4f);
		
		if (Converter.isNotNull(michi)){
			Converter<FelinoSalvaje, FelinoDomestico> converter = cat -> new FelinoDomestico(cat.getNombre(), cat.getEdad(), cat.getPeso());
			FelinoDomestico feliDomestic = converter.convert(michi);
			converter.mostrarObjeto(feliDomestic);
		}
	}

}
