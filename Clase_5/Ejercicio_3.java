package Clase_5;/*Pídele al usuario que ingrese el precio original de un producto.
Pídele al usuario que ingrese el porcentaje de descuento.
Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
Muestra el precio final al usuario.
*/

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {

        //pedir datos al usuario

        double precioOriginal;
        double descuento;
        double precioFinal;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese precio original del producto: ");
        precioOriginal = teclado.nextDouble();

        System.out.println("Ingrese porcentaje de descuento: ");
        descuento = teclado.nextDouble();

        precioFinal = precioOriginal - (precioOriginal * descuento / 100);

        System.out.println("El precio final es: " + precioFinal);
    }
}
