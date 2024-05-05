package edu.ar.unju.fi.ejercicio04.main;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

import edu.ar.unju.fi.ejercicio04.constantes.Posicion;
import edu.ar.unju.fi.ejercicio04.model.Jugador;

public class Main {

	public static void main(String[] args) {
		DateFormat formateador = new SimpleDateFormat("dd/M/yy");
		Calendar calendario = new GregorianCalendar();
		
		List<Jugador> listaJugadores = new ArrayList<Jugador>();
		
		Scanner entrada = new Scanner(System.in);
		boolean band = true;
		
		while(band) {	
			
			System.out.println("\nMenú");
			System.out.println("------------------");
			System.out.println("1 _ Alta del jugador");
			System.out.println("2 _ Mostrar todos los jugadores");
			System.out.println("3 _ Modificar la posicion de un jugador");
			System.out.println("4 _ Eliminar un jugador");
			System.out.println("5 _ Salir\n");
			
			
			System.out.println("Seleccione una opción: ");
			int opcion = entrada.nextInt();
			
			switch(opcion) {
			
				//Dar de alta al jugador
				case 1:
					Jugador jugador = new Jugador();
					try {
						System.out.println("\nIngrese el nombre del jugador: ");
						String nombre = entrada.next();
						jugador.setNombre(nombre);
						
						System.out.println("\nIngrese el apellido del jugador: ");
						String apellido = entrada.next();
						jugador.setApellido(apellido);
						
						System.out.println("\nIngrese fecha de nacimiento (dd/M/yy): ");
						String fechaNacimientoString = entrada.next();
						
						Date fecha = formateador.parse(fechaNacimientoString);
						calendario.setTime(fecha);
						
						jugador.setFechaNacimiento(calendario);
						
						System.out.println("\nIngrese la nacionalidad del jugador: ");
						String nacionalidad = entrada.next();
						jugador.setNacionalidad(nacionalidad);
						
						System.out.println("\nIngrese la estatura del jugador: ");
						Double estatura = entrada.nextDouble();
						jugador.setEstatura(estatura);
						
						System.out.println("\nIngrese el peso del jugador: ");
						Double peso = entrada.nextDouble();
						jugador.setPeso(peso);
						
						System.out.println("\nSeleccione la posición del jugador\n");
						System.out.println("1_ Delantero");
						System.out.println("2_ Medio");
						System.out.println("3_ Defensa");
						System.out.println("4_ Arquero");
						
						System.out.println("\nPosicion: ");
						int op = entrada.nextInt();
						
						switch(op) {
						case 1:
							jugador.setPosicion(Posicion.DELANTERO);
							break;
						case 2:
							jugador.setPosicion(Posicion.MEDIO);
							break;
						case 3:
							jugador.setPosicion(Posicion.DEFENSA);
							break;
						case 4:
							jugador.setPosicion(Posicion.ARQUERO);
							break;
						default: 
							System.out.println("Ingrese una opción válida");
							break;
						}
						
					}catch(Exception e) {
						System.out.println(e);
					}finally {
						listaJugadores.add(jugador);
					}
					
				//Mostrar los jugadores
				case 2:
					System.out.println(listaJugadores);
					break;
					
				//Modificar la posición del jugador
				case 3:
					try {
						System.out.println("\nIngrese el nombre del jugador: ");
						String nombreMod = entrada.next();
						System.out.println("\nIngrese el apellido del jugador: ");
						String apellidoMod = entrada.next();
						
						for(Jugador jugadores: listaJugadores) {
							if(jugadores.getNombre().equals(nombreMod) && jugadores.getApellido().equals(apellidoMod)) {
								System.out.println("\nSeleccione la posición del jugador\n");
								System.out.println("1_ Delantero");
								System.out.println("2_ Medio");
								System.out.println("3_ Defensa");
								System.out.println("4_ Arquero");
								
								System.out.println("\nPosicion: ");
								int op = entrada.nextInt();
								
								switch(op) {
								case 1:
									jugadores.setPosicion(Posicion.DELANTERO);
									break;
								case 2:
									jugadores.setPosicion(Posicion.MEDIO);
									break;
								case 3:
									jugadores.setPosicion(Posicion.DEFENSA);
									break;
								case 4:
									jugadores.setPosicion(Posicion.ARQUERO);
									break;
								default: 
									System.out.println("Ingrese una opción válida");
									break;
								}
								break;
							}
						}
					}catch(Exception e) {
							System.out.println(e);
					}
					break;
					
				//Eliminar datos del jugador.	
				case 4:
					try {
						System.out.println("\nIngrese el nombre del jugador: ");
						String nombreMod = entrada.next();
						System.out.println("\nIngrese el apellido del jugador: ");
						String apellidoMod = entrada.next();
						
						for(Jugador jugadores: listaJugadores) {
							if(jugadores.getNombre().equals(nombreMod) && jugadores.getApellido().equals(apellidoMod)) {
								listaJugadores.remove(jugadores);
								break;
							}
						}
					}catch(Exception e) {
							System.out.println(e);
					}
					break;
					
				//Salir del Menú
				case 5:
					band = false;
					System.out.println("\nSe cerró el menú");
					break;
			}
		}
		entrada.close();
	}

}
