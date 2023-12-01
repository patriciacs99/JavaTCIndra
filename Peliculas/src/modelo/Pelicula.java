package modelo;


public class Pelicula {
    private String titulo;
    private int espectadores;
    private int salas;
    private double gananciaBruta;

    public Pelicula(String titulo, int espectadores, int salas, double gananciaBruta) {
        this.titulo = titulo;
        this.espectadores = espectadores;
        this.salas = salas;
        this.gananciaBruta = gananciaBruta;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getEspectadores() {
        return espectadores;
    }

    public int getSalas() {
        return salas;
    }

    public double getGananciaBruta() {
        return gananciaBruta;
    }

   
    public void actualizarDatos2023() {
        this.espectadores /= 2;
        this.salas /= 2;
        this.gananciaBruta = calcularGananciaBruta();
    }


    private double calcularGananciaBruta() {
        
        return this.espectadores * this.salas * 10;
    }

	@Override
	public String toString() {
		return "Pelicula [titulo=" + titulo + ", espectadores=" + espectadores + ", salas=" + salas + ", gananciaBruta="
				+ gananciaBruta + "]";
	}
    
}




