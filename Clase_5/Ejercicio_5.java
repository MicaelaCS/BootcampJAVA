package Clase_5;/* Juego de adivinar el número:
Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.
*/

import java.util.Scanner;

public class Ejercicio_5 {
    public static void main(String[] args) {

        double numero = Math.random()*100;
        int adivinar;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número aleatorio: ");
        adivinar = teclado.nextInt();

        if(adivinar != numero){
            System.out.println("Numero incorrecto");
        }
        else {
            System.out.println("Adivinaste");
        }

    }
}
