package Clase_5;/*Calculadora de propinas:
Pídele al usuario que ingrese el total de la cuenta en un restaurante.
Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).
*/

import java.util.Scanner;

public class Ejercicio_4 {

    public static void main(String[] args) {

        double totalCuenta;
        double porcentajePropina;
        double propina;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese total de la cuenta: ");

        totalCuenta = teclado.nextDouble();

        System.out.println("Ingrese el descuento: ");

        porcentajePropina = teclado.nextDouble();

        propina = totalCuenta - (porcentajePropina / 100);

        System.out.println("El monto de la propina es: " + propina);

    }
}
