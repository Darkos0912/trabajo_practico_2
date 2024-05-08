package edu.ar.unju.fi.ejercicio05.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import edu.ar.unju.fi.ejercicio05.model.PagoEfectivo;
import edu.ar.unju.fi.ejercicio05.model.PagoTarjeta;
import edu.ar.unju.fi.ejercicio05.model.Producto;
import edu.ar.unju.fi.ejercicio05.model.Producto.Categoria;
import edu.ar.unju.fi.ejercicio05.model.Producto.OrigenFabricacion;



public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		List<Producto> listaProductos = new ArrayList<Producto>(15);
		List<Producto> listaCompra = new ArrayList<Producto>();				
		
		//int c= 0;
		boolean band = true;
		boolean band2 = true;
		int v = 0;
		int a = 0;
		
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
		
		listaProductos.add(p1); listaProductos.add(p2); listaProductos.add(p3); listaProductos.add(p4); listaProductos.add(p5); listaProductos.add(p6); listaProductos.add(p7); listaProductos.add(p8);
		listaProductos.add(p9); listaProductos.add(p10); listaProductos.add(p11); listaProductos.add(p12); listaProductos.add(p13); listaProductos.add(p14); listaProductos.add(p15);
		
		while(band2) {
			try {
				System.out.println("\nMenú de Opciones");
				System.out.println("----------------------");
				System.out.println("1 _ Mostrar productos");
				System.out.println("2 _ Realizar compras");
				System.out.println("3 _ Salir\n");
				
				System.out.println("Ingrese una opcion: ");
				int op = entrada.nextInt();
				
				switch(op) {
				// Mostrar Productos
				case 1:
					System.out.println("\n" + listaProductos);
					break;
				// Realizar Compras
				case 2:
					
					boolean cond = true;
					while(cond) {
						System.out.println("\nAviso: Ingresar Si o No, para responder la pregunta.");
						System.out.println("¿Quiere comprar algun producto? Si/No");
						String res = entrada.next();
						switch(res) {
						
						case "Si":
							System.out.println("\nLista de productos disponibles");
							System.out.println("-------------------");
							for(Producto productos : listaProductos) {
								if(productos.isEstado()) {
									System.out.println("* "+productos.getDescripción()+ " *");
								}
							}
							
							System.out.println("\nIngrese la descripción del producto que quiera añadir a su compra: ");
							String descripcion = entrada.next();
							
							
							for(Producto producto : listaProductos) {
								a = a + 1;
								if(producto.isEstado() && producto.getDescripción().equals(descripcion)) {
									listaCompra.add(producto);
									v = v + 1;
									band = true;
								}
							}
							a = a - 14;
							if(a != v) {
								System.out.println("El producto que ingresó no existe.");
								a = a - 1;
							}
							break;
							
						case "No":
							cond = false;
							break;
							
							
						default:
							System.out.println("\nIngrese Si o No");
						}
					}
					
					if(listaCompra.size() < 1) {
						band = false;
					}
					
					while(band) {
						System.out.println("Método de Pago");
						System.out.println("---------------");
						System.out.println("1_ Pago Efectivo");
						System.out.println("2_ Pago con Tarjeta");
						System.out.println("\nSeleccione un método de pago: ");
						int pago = entrada.nextInt();
						
						switch(pago) {
						case 1:
							band = false;
							double suma = 0.;
							
							LocalDate fecha = LocalDate.now();
							
							
							for (Producto producto : listaCompra) {
								suma = suma + producto.getPrecioUnitario();
							}
							PagoEfectivo pagoEfectivo = new PagoEfectivo(fecha);
							pagoEfectivo.realizarPago(suma);
							
							System.out.println(pagoEfectivo.imprimirRecibo());
							break;
						case 2:
							band = false;
							double sum = 0.;
							
							LocalDate hoy = LocalDate.now();
							
							System.out.println("\nIngrese el numero de tarjeta: ");
							String numeroTarjeta = entrada.next();
							
							System.out.println(listaCompra);
							
							for (Producto producto : listaCompra) {
								sum = sum + producto.getPrecioUnitario();
							}
							PagoTarjeta pagoTarjeta = new PagoTarjeta(numeroTarjeta, hoy);
							pagoTarjeta.realizarPago(sum);
							
							System.out.println(pagoTarjeta.imprimirRecibo());
							break;
						default:
							System.out.println("\nIngrese una opción válida.");
							break;
						}
					}
					break;
					
				//Salir del menú
				case 3:
					band2 = false;
					System.out.println("\nVuelva pronto.");
					break;
				default:
					System.out.println("\nIngrese una opción válida.");
				}
			}catch(Exception e) {
				System.out.println("Ocurrió un problema. Vuelva a correr el menú e ingrese los datos correctamente.");
				break;
			}
			
		}	
		
		entrada.close();
		
	}

}
