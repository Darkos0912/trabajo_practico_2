package edu.ar.unju.fi.ejercicio01.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.ar.unju.fi.ejercicio01.model.Producto;
import edu.ar.unju.fi.ejercicio01.model.Producto.Categoria;
import edu.ar.unju.fi.ejercicio01.model.Producto.OrigenFabricacion;

public class Main {

	public static void main(String[] args) {
		List<Producto> lista = new ArrayList<Producto>();
		Producto product = new Producto();
		Scanner entrada = new Scanner(System.in);
		Boolean band = true;		
		
		while(band) {
	
			System.out.println("Menu");
			
			System.out.println("1 _ Crear Producto");
			System.out.println("2 _ Mostrar Producto");
			System.out.println("3 _ Modificar Producto");
			System.out.println("4 _ Salir");
			
			System.out.println("Ingrese una opción: ");
			int opcion = entrada.nextInt();
			
			switch(opcion) {
			
				//Crear Producto
				case 1: 
					System.out.println("*Creación del producto*");
					
					System.out.println("Ingrese el código del producto: ");
					String codigo = entrada.next();
					product.setCódigo(codigo);
					
					System.out.println("Ingrese una descripción: ");
					String descripcion = entrada.next();
					product.setDescripción(descripcion);
					
					System.out.println("Ingrese el precio unitario: ");
					Double precioUnitario = entrada.nextDouble();
					product.setPrecioUnitario(precioUnitario);
					
					// Menú OrigenFabricacion
					
					System.out.println("-----Origen de Fabricación-----");
					System.out.println("1 _ Argentina");
					System.out.println("2 _ Brasil");
					System.out.println("3 _ Chile");
					System.out.println("4 _ Uruguay");
					
					System.out.println("Elija una opción: ");
					int op = entrada.nextInt();
					
					switch(op) {
					case 1:
						product.setOrigenfabricacion(OrigenFabricacion.ARGENTINA);
						break;
					case 2:
						product.setOrigenfabricacion(OrigenFabricacion.BRASIL);
						break;
					case 3:
						product.setOrigenfabricacion(OrigenFabricacion.CHILE);
						break;
					case 4:
						product.setOrigenfabricacion(OrigenFabricacion.URUGUAY);
						break;
					}
					
					// Menú Categoría
					System.out.println("-----Categoría-----");
					System.out.println("1 _ TELEFONIA");
					System.out.println("2 _ INFORMATICA");
					System.out.println("3 _ ELECTROHOGAR");
					System.out.println("4 _ HERRAMIENTAS");
					
					System.out.println("Elija una opción: ");
					int opCategoria = entrada.nextInt();
					
					switch(opCategoria) {
					case 1:
						product.setCategoria(Categoria.TELEFONIA);
						break;
					case 2:
						product.setCategoria(Categoria.INFORMATICA);
						break;
					case 3:
						product.setCategoria(Categoria.ELECTROHOGAR);
						break;
					case 4:
						product.setCategoria(Categoria.HERRAMIENTAS);
						break;
					}
					
					lista.add(product);
					break;
					
				// Mostrar Productos
				case 2:
					System.out.println(lista);
					break;
					
				// Modificar Productos
				case 3:
					System.out.println("1 _ Descripción: ");
					System.out.println("2 _ Precio Unitario: ");
					System.out.println("3 _ Origen de fabricación: ");
					System.out.println("4 _ Categoría: ");
					
					System.out.println("Elija una opción: ");
					int opModificacion = entrada.nextInt();
					
					switch(opModificacion) {
					case 1:
						System.out.println("Ingrese nueva descripción: ");
						String nuevaDescripcion = entrada.next();
						product.setDescripción(nuevaDescripcion);
						break;
					case 2:
						System.out.println("Ingrese nuevo precio unitario: ");
						Double nuevoPrecio = entrada.nextDouble();
						product.setPrecioUnitario(nuevoPrecio);
						break;
					case 3:
						System.out.println("-----Origen de Fabricación-----");
						System.out.println("1 _ Argentina");
						System.out.println("2 _ Brasil");
						System.out.println("3 _ Chile");
						System.out.println("4 _ Uruguay");
						
						System.out.println("Elija una opción: ");
						int opp = entrada.nextInt();
						
						switch(opp) {
						case 1:
							product.setOrigenfabricacion(OrigenFabricacion.ARGENTINA);
							break;
						case 2:
							product.setOrigenfabricacion(OrigenFabricacion.BRASIL);
							break;
						case 3:
							product.setOrigenfabricacion(OrigenFabricacion.CHILE);
							break;
						case 4:
							product.setOrigenfabricacion(OrigenFabricacion.URUGUAY);
							break;
						}
					case 4:
						System.out.println("-----Categoría-----");
						System.out.println("1 _ TELEFONIA");
						System.out.println("2 _ INFORMATICA");
						System.out.println("3 _ ELECTROHOGAR");
						System.out.println("4 _ HERRAMIENTAS");
					
						System.out.println("Elija una opción: ");
						int opc = entrada.nextInt();
					
						switch(opc) {
						case 1:
							product.setCategoria(Categoria.TELEFONIA);
							break;
						case 2:
							product.setCategoria(Categoria.INFORMATICA);
							break;
						case 3:
							product.setCategoria(Categoria.ELECTROHOGAR);
							break;
						case 4:
							product.setCategoria(Categoria.HERRAMIENTAS);
							break;
							}
						}
						break;
				
				// Salir del menú
				case 4:
					band = false;
					System.out.println("Se cerró el menú");
					break;
				default:
					System.out.println("Ingrese una opcion válida por favor");
			}
			
		}
		
		entrada.close();
	}

}
