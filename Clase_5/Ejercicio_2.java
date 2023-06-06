package Clase_5;/*Conversor de millas a kilómetros:
Pídele al usuario que ingrese una distancia en millas.
Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
Muestra la distancia en kilómetros al usuario.
*/

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {

        double kilometro;
        double millas;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese distancia en millas: ");

        millas = teclado.nextDouble();

        kilometro = millas * 1.60934;

        System.out.println("La velocidad: " + millas + " convertidas en kilometros es: " + kilometro);

    }
}
