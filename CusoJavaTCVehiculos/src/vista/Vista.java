package vista;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vista extends Thread{
	
	
	public void mostrarInfoFinanciera(double gananciaBruta,double gananciaNeta,double perdidaProyectada, double diasRestantes) {
		System.out.print("Información Finaciera: \nGanacia Bruta: " + gananciaBruta
				+"\nGanancia Neta: "+ gananciaNeta +"\nPerdida Proyectada: "+ perdidaProyectada+"\nDías hasta caducidad: "+diasRestantes+"\n\n");
	}
	
	public void mostrarInfoProducto(String detalleProducto,String color,double precio, int unidadesVendidas, LocalDate fechaElaboracion, LocalDate fechaVencimiento) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.print("\nInformación Producto: \nDetalle Producto: " + detalleProducto
				+"\nColor: "+ color+"\nPrecio: "+ precio+"\nUnidades Vendidas: "+unidadesVendidas+"\nFecha Elaboración: "+fechaElaboracion.format(formatter)+"\nFecha Vencimiento: "+fechaVencimiento.format(formatter)+"\n\n");
	}
	
	public void imprimeLineaSeparadora() {
		System.out.println("------------------------------------------------------------ ");
	}
	
	
}
