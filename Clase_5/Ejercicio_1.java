package Clase_5;
/*Calculadora de edad de perros:
Pídele al usuario que ingrese la edad de su perro.
Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).
*/

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        int edad, edadPerro;

            Scanner teclado = new Scanner(System.in);

            System.out.println("Ingrese su edad: ");

            edad = teclado.nextInt();

            edadPerro = edad * 7;

        System.out.println("La edad de su perro es: " + edadPerro);

    }
}
