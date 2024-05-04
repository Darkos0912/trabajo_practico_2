package edu.ar.unju.fi.ejercicio02.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.ar.unju.fi.ejercicio02.model.Efemeride;
import edu.ar.unju.fi.ejercicio02.constantes.Mes;

public class Main {

	public static void main(String[] args) {
		List<Efemeride> lista = new ArrayList<Efemeride>();
		Efemeride efemeride = new Efemeride();
		Scanner entrada = new Scanner(System.in);
		
		boolean band = true;
		
		while(band) {
			System.out.println("\n       Menú        ");
			System.out.println("------------------");
			System.out.println("1 – Crear efeméride");
			System.out.println("2 – Mostrar efemérides");
			System.out.println("3 – Eliminar efemérides");
			System.out.println("4 – Modificar efemérides");
			System.out.println("5 – Salir");
			
			
			System.out.println("\n Seleccione una opción");
			int op = entrada.nextInt();
			
			switch(op) {
			// CREAR EFEMÉRIDE
			case 1:
				
				System.out.println("\n Ingrese un código: ");
				String codigo = entrada.next();
				efemeride.setCodigo(codigo);
				
				System.out.println("\n Ingrese el numero de mes: ");
				int num = entrada.nextInt();
				
				switch(num) {
				case 1:
					efemeride.setMes(Mes.ENERO);
					break;
				case 2:
					efemeride.setMes(Mes.FEBRERO);
					break;
				case 3:
					efemeride.setMes(Mes.MARZO);
					break;
				case 4:
					efemeride.setMes(Mes.ABRIL);
					break;
				case 5:
					efemeride.setMes(Mes.MAYO);
					break;
				case 6:
					efemeride.setMes(Mes.JUNIO);
					break;
				case 7:
					efemeride.setMes(Mes.JULIO);
					break;
				case 8:
					efemeride.setMes(Mes.AGOSTO);
					break;
				case 9:
					efemeride.setMes(Mes.SEPTIEMBRE);
					break;
				case 10:
					efemeride.setMes(Mes.OCTUBRE);
					break;
				case 11:
					efemeride.setMes(Mes.NOVIEMBRE);
					break;
				case 12:
					efemeride.setMes(Mes.DICIEMBRE);
					break;
				default:
					System.out.println("\n Ingrese un numero de mes válido, por favor.");
					break;
				}
				
				System.out.println("\nIngrese un día del mes: ");
				int dia = entrada.nextInt();
				
				if(dia < 1 && dia > 31) {
					System.out.println("Ingrese un día del mes válido, por favor");
					break;
				}
				else if(efemeride.getMes() == Mes.ABRIL || efemeride.getMes() == Mes.JUNIO || efemeride.getMes() == Mes.SEPTIEMBRE || efemeride.getMes() == Mes.NOVIEMBRE) {
					if(dia > 30) {
						System.out.println("Ingrese un día del mes válido, por favor.");
						break;
					}
				}
				else if(efemeride.getMes() == Mes.FEBRERO) {
					if(dia > 29) {
						System.out.println("Ingrese un día del mes válido, por favor.");
						break;
					}
				}
				efemeride.setDia(dia);
				
				System.out.println("\n Ingrese el detalle de la efeméride: ");
				String detalle = entrada.next();
				efemeride.setDetalle(detalle);
				
				lista.add(efemeride);
				break;
			case 2:
				System.out.println("\n" + lista + "\n");
				break;
			case 3:
				lista.remove(efemeride);
				break;
			case 4:
				System.out.println("\n Ingrese el numero de mes: ");
				int numMod = entrada.nextInt();
				
				switch(numMod) {
				case 1:
					efemeride.setMes(Mes.ENERO);
					break;
				case 2:
					efemeride.setMes(Mes.FEBRERO);
					break;
				case 3:
					efemeride.setMes(Mes.MARZO);
					break;
				case 4:
					efemeride.setMes(Mes.ABRIL);
					break;
				case 5:
					efemeride.setMes(Mes.MAYO);
					break;
				case 6:
					efemeride.setMes(Mes.JUNIO);
					break;
				case 7:
					efemeride.setMes(Mes.JULIO);
					break;
				case 8:
					efemeride.setMes(Mes.AGOSTO);
					break;
				case 9:
					efemeride.setMes(Mes.SEPTIEMBRE);
					break;
				case 10:
					efemeride.setMes(Mes.OCTUBRE);
					break;
				case 11:
					efemeride.setMes(Mes.NOVIEMBRE);
					break;
				case 12:
					efemeride.setMes(Mes.DICIEMBRE);
					break;
				default:
					System.out.println("\n Ingrese un numero de mes válido, por favor.");
					break;
				}
				
				if(efemeride.getMes() == Mes.ABRIL || efemeride.getMes() == Mes.JUNIO || efemeride.getMes() == Mes.SEPTIEMBRE || efemeride.getMes() == Mes.NOVIEMBRE) {
					if(efemeride.getDia() > 30) {
						efemeride.setDia(30);
					}
				}
				else if(efemeride.getMes() == Mes.FEBRERO) {
					if(efemeride.getDia() > 29) {
						efemeride.setDia(29);
					}
				}
				break;
			case 5:
				System.out.println("\n Menú cerrado");
				band = false;
				break;
			default:
				System.out.println("Ingrese una opción válida, por favor.");
			}
			
		}
		
		entrada.close();
	}
	
	

}
