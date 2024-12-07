/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen3;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class EXAMEN3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);

        // Solicitar el número de estudiantes
        System.out.print("Ingrese el número de estudiantes: ");
        int numEstudiantes = scanner.nextInt();

        while (numEstudiantes <= 0) {
            System.out.println("El número de estudiantes debe ser mayor a 0.");
            System.out.print("Ingrese el número de estudiantes: ");
            numEstudiantes = scanner.nextInt();
        }

        // Crear un arreglo para almacenar las calificaciones
        int[] calificaciones = new int[numEstudiantes];

        // Leer las calificaciones
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
            calificaciones[i] = scanner.nextInt();

            while (calificaciones[i] < 0 || calificaciones[i] > 100) {
                System.out.println("La calificación debe estar entre 0 y 100.");
                System.out.print("Ingrese la calificación del estudiante " + (i + 1) + ": ");
                calificaciones[i] = scanner.nextInt();
            }
        }

        // Calcular el promedio
        double promedio = calcularPromedio(calificaciones);

        // Contar calificaciones mayores o iguales al promedio
        int numCalificacionesMayores = contarCalificacionesMayores(calificaciones, promedio);

        // Obtener la calificación más alta y más baja
        int calificacionMasAlta = obtenerCalificacionMasAlta(calificaciones);
        int calificacionMasBaja = obtenerCalificacionMasBaja(calificaciones);

        // Imprimir los resultados
        System.out.println("Promedio de calificaciones: " + promedio);
        System.out.println("Número de calificaciones mayores o iguales al promedio: " + numCalificacionesMayores);
        System.out.println("Calificación más alta: " + calificacionMasAlta);
        System.out.println("Calificación más baja: " + calificacionMasBaja);
    }

    // Método para calcular el promedio de las calificaciones
    public static double calcularPromedio(int[] calificaciones) {
        int suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return (double) suma / calificaciones.length;
    }

    // Método para contar las calificaciones mayores o iguales al promedio
    public static int contarCalificacionesMayores(int[] calificaciones, double promedio) {
        int contador = 0;
        for (int calificacion : calificaciones) {
            if (calificacion >= promedio) {
                contador++;
            }
        }
        return contador;
    }

    // Método para obtener la calificación más alta
    public static int obtenerCalificacionMasAlta(int[] calificaciones) {
        int max = calificaciones[0];
        for (int calificacion : calificaciones) {
            if (calificacion > max) {
                max = calificacion;
            }
        }
        return max;
    }

    // Método para obtener la calificación más baja
    public static int obtenerCalificacionMasBaja(int[] calificaciones) {
        int min = calificaciones[0];
        for (int calificacion : calificaciones) {
            if (calificacion < min) {
                min = calificacion;
            }
        }
        return min;
    }
}


    

