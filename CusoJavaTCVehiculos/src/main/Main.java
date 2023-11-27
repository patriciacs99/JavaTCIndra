package main;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import controlador.Controlador;
import modelo.Modelo;
import vista.Vista;

public class Main {
	 public static void main(String[] args) {
	      
			List<Modelo> modelos = new LinkedList<Modelo>();
			
			Scanner sc = new Scanner(System.in);
			
			for(int i = 0; i<5;i++) {
				
				System.out.println("Introduce los datos del producto "+ (i+1));
				System.out.println("Nombre: ");
				String detalle = sc.next();
				System.out.println("Color: ");
				String color = sc.next();
				System.out.println("Precio: ");
				double precio = sc.nextDouble();
				System.out.println("Unidades Vendidas: ");
				int unidadesVendidas = sc.nextInt();
				System.out.println("Fecha Elaboracion: ");
				String fechaElaboracion = sc.next();
				System.out.println("Fecha Vencimiento: ");
				String fechaVencimiento = sc.next();
				
				Modelo modelo = new Modelo(detalle,color,precio,unidadesVendidas,fechaElaboracion,fechaVencimiento);
				modelos.add(modelo);
			
				
			}
			sc.close();
			for (Modelo modelo : modelos) {
				Vista vista = new Vista();
				Controlador controlador = new Controlador(vista,modelo);
				
		        modelo.start();
		        controlador.start();
		        vista.start();

		        
		        try {
		            modelo.join();
		            controlador.join();
		            vista.join();
		            controlador.mostrarInformacion();
		        } catch (InterruptedException e) {
		            e.printStackTrace();
		        }
			}

	       
	    }
}
