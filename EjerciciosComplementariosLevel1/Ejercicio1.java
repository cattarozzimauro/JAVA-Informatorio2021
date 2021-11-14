package EjerciciosComplementariosLevel1;

import java.util.Scanner;

/* Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente
mensaje “HOLA {USUARIO}!!!” */

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        String nombre = scan.nextLine();
        Saludar(nombre);
        scan.close();
    }
    public static void Saludar(String texto) {
        System.out.println("HOLA " + texto + "!!!!");
    }
}