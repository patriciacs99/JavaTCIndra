package controlador;


import modelo.Pelicula;
import vista.Vista;


public class Controlador {
    private Pelicula modelo;
    private Vista vista;

    public Controlador(Pelicula modelo, Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void setDatosPelicula() {
        modelo.actualizarDatos2023(); 
    }

    public String actualizarVista() {
          return vista.mostrarDetalles(modelo);
    }
}


