package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/*Realizar un programa que solicite por consola 2 números enteros. Para luego
imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto
de la división) de ambos números.*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un número:");
        int a = scan.nextInt();
        System.out.println("Por favor ingrese otro número:");
        int b = scan.nextInt();
        scan.close();
        Suma(a, b);
        Resta(a, b);
        Multiplicacion(a, b);
        Division(a, b);
        Modulo(a, b);
    }
    public static void Suma(int a, int b) {
        int c;
        c = a + b;
        System.out.println("El resultado de: " + a + "+" + b + " = " + c);
    }
    public static void Resta(int a, int b) {
        int c;
        c = a - b;
        System.out.println("El resultado de: " + a + "-" + b + " = " + c);
    }
    public static void Multiplicacion(int a, int b) {
        int c;
        c = a * b;
        System.out.println("El resultado de: " + a + "*" + b + " = " + c);
    }
    public static void Division(int a, int b) {
        int c;
        c = a / b;
        System.out.println("El resultado de: " + a + "/" + b + " = " + c);
    }
    public static void Modulo(int a, int b) {
        int c;
        c = a % b;
        System.out.println("El resultado de: " + a + "%" + b + " = " + c);
    }
}
