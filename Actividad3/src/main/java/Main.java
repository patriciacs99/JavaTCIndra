import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 	Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el nombre:");
	        String nombre = scanner.nextLine();

	        System.out.println("Ingrese el apellido:");
	        String apellido = scanner.nextLine();

	        System.out.println("Ingrese la ciudad:");
	        String ciudad = scanner.nextLine();

	        System.out.println("Ingrese la edad:");
	        int edad = scanner.nextInt();

	        System.out.println("Información del Usuario:");
	        System.out.println("Nombre: " + nombre);
	        System.out.println("Apellido: " + apellido);
	        System.out.println("Ciudad: " + ciudad);
	        System.out.println("Edad: " + edad);
	    

	}

}
