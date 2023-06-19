package Clase_7;

import java.util.Scanner;

public class Ejercicios {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int numeros[] = new int[5];

        for(int i = 0; i<numeros.length;i++){
            System.out.println("Ingrese un numero: ");
            numeros[i] = teclado.nextInt();
        }

        System.out.println("----------------------");

        for(int i = 0; i<numeros.length;i++){
            System.out.println(numeros[i]);
        }

        int mayor = 0;
        int menor=0;

        for(int i=0; i<numeros.length;i++){
            int num = numeros[i];

            if (num >= mayor || i == 0){
                mayor=num;
            }
            if (num <= menor || i == 0){
                menor=num;
            }
        }

        System.out.println("El mayor es: " + mayor);
        System.out.println("El menor es: " + menor);

        int sum=0;
        float prom = 0;

        for(int i = 0; i<numeros.length;i++){
            sum += numeros[i];
            prom = (float)sum / numeros.length;

        }

        System.out.println("El promedio es: " + prom);

    }
}
