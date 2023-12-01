package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import controlador.Controlador;
import modelo.Pelicula;
import vista.Vista;

public class Main {
	
	    public static void main(String[] args) {
	    	
	    	List<Pelicula> peliculas = new LinkedList<>();
	    	
	        Pelicula pelicula1 = new Pelicula("Avatar", 100000, 10000, 1000000000);
	        Pelicula pelicula2 = new Pelicula("Avengers: Endgame",  90000, 9000,  810000000);
	        Pelicula pelicula3 = new Pelicula("Avatar: The Way of Water", 80000, 8000, 640000000  );
	        Pelicula pelicula4 = new Pelicula("Titanic", 700000, 7000, 490000000);
	        Pelicula pelicula5 = new Pelicula("Star Wars: Episode VII - The Force Awakens", 600000, 6000, 360000000 );
	        Pelicula pelicula6 = new Pelicula("Avengers: Infinity War", 500000, 5000, 250000000);
	        Pelicula pelicula7 = new Pelicula("Spider-Man: No Way Home", 400000, 4000, 160000000);
	        Pelicula pelicula8 = new Pelicula("Jurassic World", 300000, 3000, 90000000);
	        Pelicula pelicula9 = new Pelicula("The Lion King", 200000, 2000, 40000000 );
	        Pelicula pelicula10 = new Pelicula("The Avengers", 100000, 1000, 10000000 );
	       
	        
	        peliculas.add(pelicula1);
	        peliculas.add(pelicula2);
	        peliculas.add(pelicula3);
	        peliculas.add(pelicula4);
	        peliculas.add(pelicula5);
	        peliculas.add(pelicula6);
	        peliculas.add(pelicula7);
	        peliculas.add(pelicula8);
	        peliculas.add(pelicula9);
	        peliculas.add(pelicula10);
	        
	        Vista peliculaView = new Vista();
	        try {
		        final var bw = new BufferedWriter(new FileWriter("Jenkinsfile"));
		        StringBuilder sb = new StringBuilder();
		        sb.append( "pipeline {");
		        sb.append("\nagent any");
		        sb.append("\nstages {");
		        sb.append("\nstage('Muestro informacion') {" );
		        sb.append("\nsteps {");
		        
		        for (Pelicula p : peliculas) {
		        	Controlador peliculaController = new Controlador(p, peliculaView);

			        System.out.println("Datos de 2022:");
			        peliculaController.actualizarVista();
	
			        System.out.println("Datos de 2023:");
			        peliculaController.setDatosPelicula();
			        peliculaController.actualizarVista();
		        
			       
			        sb.append("\necho 'La informacion de la pelicula es:'\n "+ peliculaController.actualizarVista());
			        
		        }
		        sb.append("\n}");
		        sb.append("\n}");
		        sb.append("\n}");
		        sb.append("\n}");
		        
		        String formato_jenkinsfile = sb.toString();
		
		        bw.write(formato_jenkinsfile);
		        System.out.println("Se genero el jenkinsfile");
		    }catch(IOException e){
		        e.printStackTrace();
		    }
			
	        
	        
	    }
	

}
