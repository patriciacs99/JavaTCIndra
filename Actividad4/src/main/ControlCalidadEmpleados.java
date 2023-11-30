package main;

import java.util.Scanner;

public class ControlCalidadEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 6; i++) {
            System.out.println("Empleado #" + i);
            System.out.print("Ingrese el nombre del empleado: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese la posición del empleado (CEO, Jefe, Ingeniero, Analista, Scrum Master, RRHH): ");
            String posicion = scanner.nextLine();

            System.out.print("Ingrese el sueldo del empleado: ");
            double sueldo = scanner.nextDouble();

            System.out.print("Ingrese la hora de ingreso del empleado. Ej: 18 para las 6pm): ");
            int horaIngreso = scanner.nextInt();

            
            double descuento = 0.0;
            if ((posicion.equals("CEO") && (horaIngreso < 7 || horaIngreso > 18))
                    || (posicion.equals("Jefe") && (horaIngreso < 8 || horaIngreso > 18))
                    || (posicion.equals("Ingeniero") && (horaIngreso < 9 || horaIngreso > 18))
                    || (posicion.equals("Analista") && (horaIngreso < 9 || horaIngreso > 17))
                    || (posicion.equals("Scrum Master") && (horaIngreso < 9 || horaIngreso > 18))
                    || (posicion.equals("RRHH") && (horaIngreso < 9 || horaIngreso > 18))) {
               
                switch (posicion) {
                    case "CEO":
                        descuento = 0.01;
                        break;
                    case "Jefe":
                        descuento = 0.05;
                        break;
                    case "Ingeniero":
                        descuento = 0.15;
                        break;
                    case "Analista":
                        descuento = 0.20;
                        break;
                    case "Scrum Master":
                        descuento = 0.10;
                        break;
                    case "RRHH":
                        descuento = 0.09;
                        break;
                }

                double descuentoMensual = sueldo * descuento;
                System.out.println("Infracción detectada:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Posición: " + posicion);
                System.out.println("Descuento Mensual: $" + descuentoMensual);
                System.out.println("------------------------");
            } else {
                System.out.println("Empleado #" + i + " no tiene infracciones.");
            }

          
            scanner.nextLine();
        }

        scanner.close();
    }
}

  


