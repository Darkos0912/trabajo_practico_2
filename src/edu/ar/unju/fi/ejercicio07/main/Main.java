package edu.ar.unju.fi.ejercicio07.main;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import edu.ar.unju.fi.ejercicio05.model.Producto;
import edu.ar.unju.fi.ejercicio05.model.Producto.Categoria;
import edu.ar.unju.fi.ejercicio05.model.Producto.OrigenFabricacion;

public class Main {

	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		List<Producto>productos =new  ArrayList<>();
		cargarProductos(productos);
		int op=0;
		
		try {
			do {
				System.out.println("Seleccione una opción: ");
				System.out.println("\n1.Mostrar los productos");
				System.out.println("2.Realizar una compra");
				System.out.println("3.Salir");
				op = entrada.nextInt();
				
				switch(op) {
					case 1:
						mostrarProductos(productos);
						break;
					case 2:
						System.out.println(productosDisponibles(productos));
						break;
					case 3:
						List<Producto> productosIncrementados = aumentoDePrecio(productos);
						System.out.println(productosIncrementados);
						break;
					case 4:
						System.out.println(categoriaYT(productos));
						break;
					case 5:
						System.out.println(ordenarDescendentemente(productos));
						break;
					case 6:
						System.out.println(mayusculas(productos));
						break;
					case 7:
						System.out.println("Fin programa");
					default:
						System.out.println("Opcion incorrecta, intente de nuevo");
						break;
				}	
			}while(op != 3);
				
		}catch(InputMismatchException error) {
			System.out.println("Error: No es numero: " + error.getMessage());
		}
		
}
	public static void cargarProductos(List<Producto> productos){
		Producto p1 = new Producto("1p1","Celular",60000.00,OrigenFabricacion.ARGENTINA,Categoria.TELEFONIA,true);
		Producto p2 = new Producto("2p2","Microondas",120000.00,OrigenFabricacion.BRASIL,Categoria.TELEFONIA,true);
		Producto p3 = new Producto("3p3","Heladera",260000.00,OrigenFabricacion.ARGENTINA,Categoria.TELEFONIA,true);
		Producto p4 = new Producto("4p4","Martillo",15000.00,OrigenFabricacion.ARGENTINA,Categoria.TELEFONIA,false);
		Producto p5 = new Producto("5p5","Destornillador",10000.00,OrigenFabricacion.ARGENTINA,Categoria.TELEFONIA,true);
		Producto p6 = new Producto("6p6","Tablet",150000.00,OrigenFabricacion.BRASIL,Categoria.TELEFONIA,true);
		Producto p7 = new Producto("7p7","Licuadora",20000.00,OrigenFabricacion.CHILE,Categoria.TELEFONIA,false);
		Producto p8 = new Producto("8p8","impresora",120000.00,OrigenFabricacion.CHILE,Categoria.TELEFONIA,true);
		Producto p9 = new Producto("9p9","teclado",20000.00,OrigenFabricacion.URUGUAY,Categoria.TELEFONIA,true);
		Producto p10 = new Producto("10p10","USB",12000.00,OrigenFabricacion.ARGENTINA,Categoria.TELEFONIA,false);
		Producto p11 = new Producto("11p11","Cafetera",50000.00,OrigenFabricacion.ARGENTINA,Categoria.TELEFONIA,false);
		Producto p12 = new Producto("12p12","Linterna",8000.00,OrigenFabricacion.BRASIL,Categoria.TELEFONIA,true);
		Producto p13 = new Producto("13p13","Pendrive",5000.00,OrigenFabricacion.ARGENTINA,Categoria.TELEFONIA,true);
		Producto p14 = new Producto("14p14","Tostadora",30000.00,OrigenFabricacion.CHILE,Categoria.TELEFONIA,false);
		Producto p15 = new Producto("15p15","PC",300000.00,OrigenFabricacion.BRASIL,Categoria.TELEFONIA,true);
		
		productos.add(p1); productos.add(p2); productos.add(p3); productos.add(p4); productos.add(p5); productos.add(p6); productos.add(p7); productos.add(p8);
		productos.add(p9); productos.add(p10); productos.add(p11); productos.add(p12); productos.add(p13); productos.add(p14); productos.add(p15);
	}

	//Método para mostrar productos con Consumer:
	public static void mostrarProductos(List<Producto> productos) {
		Consumer<Producto> prod = p -> {
			if (p.isEstado())
			System.out.println(p);
		};
		productos.forEach(prod);
	}

	//Método para mostrar los productos con Predicate y Filter
	
	public static List<Producto> productosDisponibles (List<Producto> productos){
		Predicate<Producto> save = p -> !p.isEstado();
		return productos.stream().filter(save).collect(Collectors.toList());
				
	}
	
	//Método para incrementar los precios:
	
	public static List<Producto> aumentoDePrecio(List<Producto> productos){
		Function<Producto, Producto> precioAum = p ->{
			p.setPrecioUnitario(p.getPrecioUnitario()*1.20f);
			return p;
		};
		return productos.stream().map(precioAum).collect(Collectors.toList());
	}
	
	
	//Método para mostrar por categorias:
	public static List<Producto> categoriaYT (List<Producto>productos){
		Predicate<Producto> save = p -> (p.isEstado()&& p.getCategoria() == Categoria.ELECTROHOGAR);
		return productos.stream().filter(save).collect(Collectors.toList());
				
	}
	
	//Método para ordernar descendentemente:
	public static List<Producto> ordenarDescendentemente(List<Producto> productos){
		Comparator<Producto> c = Comparator.comparing(Producto :: getPrecioUnitario).reversed();

		productos.sort(c);
		return productos;
	}
	
	//Método para mostrar productos con mayúsculas:
	
	public static List<Producto> mayusculas(List<Producto> productos){
		Function<Producto, Producto> caps = p ->{
			p.setDescripción(p.getDescripción().toUpperCase());;
			return p;
		};
		return productos.stream().map(caps).collect(Collectors.toList());
	}
}
