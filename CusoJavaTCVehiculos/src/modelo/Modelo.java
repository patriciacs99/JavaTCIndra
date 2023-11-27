package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
- Detalle del producto
- Color
- Peso
- Precio
- Unidades vendidas
- Fecha de elaboración
- Fecha de Vencimiento
*/
public class Modelo extends Thread{
	
	private String detalleProducto;
	private String color;
	private double precio;
	private int unidadesVendidas;
	private LocalDate fechaElaboracion;
	private LocalDate fechaVencimiento;
	
	
	public Modelo() {
		
	}
	public Modelo(String detalleProducto, String color, double precio, int unidadesVendidas, String fechaElaboracion,
			String fechaVencimiento) {
	
		this.detalleProducto = detalleProducto;
		this.color = color;
		this.precio = precio;
		this.unidadesVendidas = unidadesVendidas;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		try { 
			
	        LocalDate fechaParseada = LocalDate.parse(fechaElaboracion, formatter);
	        this.fechaElaboracion = fechaParseada;   
	        
	    } catch (Exception e) {
	          
	        System.out.println("Error al parsear la fecha: " + e.getMessage());
	    }
		
		try { 
			
	        LocalDate fechaParseada = LocalDate.parse(fechaVencimiento, formatter);
	        this.fechaVencimiento =fechaParseada;   
	        
	    } catch (Exception e) {
	          
	        System.out.println("Error al parsear la fecha: " + e.getMessage());
	    }
	}

	public String getDetalleProducto() {
		return detalleProducto;
	}

	public void setDetalleProducto(String detalleProducto) {
		this.detalleProducto = detalleProducto;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getUnidadesVendidas() {
		return unidadesVendidas;
	}

	public void setUnidadesVendidas(int unidadesVendidas) {
		this.unidadesVendidas = unidadesVendidas;
	}

	public LocalDate getFechaElaboracion() {
		
		return fechaElaboracion;
	}

	public void setFechaElaboracion(String fechaElaboracion) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try { 
			
	        LocalDate fechaParseada = LocalDate.parse(fechaElaboracion, formatter);
	        this.fechaElaboracion = fechaParseada;   
	        
	    } catch (Exception e) {
	          
	        System.out.println("Error al parsear la fecha: " + e.getMessage());
	    }
	}

	public LocalDate getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		try { 
			
	        LocalDate fechaParseada = LocalDate.parse(fechaVencimiento, formatter);
	        this.fechaVencimiento = fechaParseada;   
	        
	    } catch (Exception e) {
	          
	        System.out.println("Error al parsear la fecha: " + e.getMessage());
	    }
	}

	
	
	
	
	
	
}
