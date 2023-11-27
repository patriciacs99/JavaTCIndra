package controlador;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import modelo.Modelo;
import vista.Vista;

/*
- Ganancias Bruta = Suma de las unidades vendidas
- Ganancia Neta = Ganancia bruta * 0.83
- Perdida proyectada = Ganancia neta / 12
- Diferencia de días entre Fecha de elaboración - Fecha de Vencimiento 
*/
public class Controlador extends Thread {
	
	private Vista vista;
	private Modelo modelo;
	
	public Controlador(Vista vista, Modelo modelo) {
		this.vista = vista;
		this.modelo = modelo;
	}
	
	
	public double calculaGananciaBruta() {
		return modelo.getUnidadesVendidas()* modelo.getPrecio();
	}
	
	public double calculaGananciaNeta() {
		return calculaGananciaBruta()* 0.83;
	}
	
	public double calculaPerdidaProyectada() {
		return calculaGananciaNeta()/ 12;
	}
	
	public double calcularDiasRestantes() {
		LocalDate fechaActual = LocalDate.now();
		return ChronoUnit.DAYS.between(fechaActual, modelo.getFechaVencimiento()); 
	}

	public void mostrarInformacion() {
		
		double gananciaBruta = this.calculaGananciaBruta();
		double gananciaNeta = this.calculaGananciaNeta();
		double perdidaProyectada = this.calculaPerdidaProyectada();
		double diasRestantes = this.calcularDiasRestantes();
		
		
		String detalleProducto = modelo.getDetalleProducto();
		String color  = modelo.getColor();
		double precio = modelo.getPrecio(); 
		int unidadesVendidas = modelo.getUnidadesVendidas();
		LocalDate fechaElaboracion = modelo.getFechaElaboracion();
		LocalDate fechaVencimiento = modelo.getFechaVencimiento();
		
		
		vista.mostrarInfoProducto(detalleProducto,color,precio,unidadesVendidas,fechaElaboracion,fechaVencimiento);
		vista.mostrarInfoFinanciera(gananciaBruta,gananciaNeta,perdidaProyectada,diasRestantes);
		vista.imprimeLineaSeparadora();
	}
}
