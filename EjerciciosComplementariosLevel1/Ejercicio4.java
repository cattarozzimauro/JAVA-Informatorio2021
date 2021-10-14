import java.util.Scanner;

/* Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
Sin hacer uso de librerías. */

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un número:");
        int nro = scan.nextInt();
        scan.close();
        System.out.println("A continuación se imprimirá la factorización del nro ingresado:");
        int acumulador = 1;
        // iniciamos un ciclo for//
        for (int i = 1; i <= nro; i++) {
            acumulador = acumulador * i;
        }
        System.out.println("El factorial de " + "!" + nro + " es: " + acumulador);
    }
}