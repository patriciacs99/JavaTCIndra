package main;

import java.util.Scanner;

public class ControlCalidadEmpleados {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del empleado:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la posición del empleado (CEO, Jefe, Ingeniero, Analista, Scrum Master, RRHH):");
        String posicion = scanner.nextLine();

        System.out.println("Ingrese el sueldo del empleado:");
        double sueldo = scanner.nextDouble();

        System.out.println("Ingrese el horario de ingreso del empleado (en formato militar, por ejemplo, 9 para las 9am):");
        int horarioIngreso = scanner.nextInt();

        evaluarInfraccion(nombre, posicion, sueldo, horarioIngreso);
    }

    private static void evaluarInfraccion(String nombre, String posicion, double sueldo, int horarioIngreso) {
        int horarioEgreso = 18; 

        switch (posicion) {
            case "CEO":
                evaluarHorario(nombre, posicion, sueldo, horarioIngreso, horarioEgreso, 7, 0.01);
                break;
            case "Jefe":
                evaluarHorario(nombre, posicion, sueldo, horarioIngreso, horarioEgreso, 8, 0.05);
                break;
            case "Ingeniero":
                evaluarHorario(nombre, posicion, sueldo, horarioIngreso, horarioEgreso, 9, 0.15);
                break;
            case "Analista":
                evaluarHorario(nombre, posicion, sueldo, horarioIngreso, 17, 9, 0.20);
                break;
            case "Scrum Master":
                evaluarHorario(nombre, posicion, sueldo, horarioIngreso, horarioEgreso, 9, 0.10);
                break;
            case "RRHH":
                evaluarHorario(nombre, posicion, sueldo, horarioIngreso, horarioEgreso, 9, 0.09);
                break;
            default:
                System.out.println("Posición no válida.");
        }
    }

    private static void evaluarHorario(String nombre, String posicion, double sueldo, int horarioIngreso, int horarioEgreso, int horarioEstipulado, double porcentajeDescuento) {
        if (horarioIngreso > horarioEstipulado) {
            double descuento = sueldo * porcentajeDescuento;
            System.out.println("Empleado " + nombre + " (Posición: " + posicion + ") tiene una infracción. Se le descuenta $" + descuento + " del sueldo anual.");
        } else {
            System.out.println("Empleado " + nombre + " (Posición: " + posicion + ") no tiene infracciones.");
        }
    }
}

