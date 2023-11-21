package ministerioGeografia;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Sistema> sistemas = new LinkedList<>();
		
		for(int i = 0; i<3;i++) {
			
			System.out.println("Introduce el nombre de la ciudad:");
			String nombre  = sc.next();
			System.out.println("Introduce el número de habitantes de la ciudad:");
			int habitantes  = sc.nextInt();
			System.out.println("Introduce la superficie de la ciudad: ");
			double superficie  = sc.nextDouble();
			System.out.println();
			
			Ciudad c = new Ciudad(nombre,habitantes,superficie);
			Sistema s = new Sistema(c);
			
			sistemas.add(s);
		}
		sc.close();
		
		
		for (Sistema s : sistemas) {
			Thread hiloPrincipal = new Thread(() -> {
	            System.out.println("Hilo principal "+s.getCiudad().getNombre()+" : Generando información del sistema...");
	            s.generarInformacion();
	            System.out.println("Hilo principal "+ s.getCiudad().getNombre()+ " : Información generada.");
	        });

	        Thread hiloSecundario1 = new Thread(new GeneradorDirectorio(s));
	        Thread hiloSecundario2 = new Thread(new ImprimeArchivo(s));

	        hiloPrincipal.start();
	        try {
	            hiloPrincipal.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        hiloSecundario1.start();
	        hiloSecundario2.start();
		}
        

	}

}
