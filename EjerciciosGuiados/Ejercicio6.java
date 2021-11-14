package EjerciciosGuiados;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        //creamos un objeto scanner que toma los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int nro;
        while (continuar == 1) {
            System.out.println("Por favor ingrese un número: ");
            //creamos una variable del tipo entero y escaneamos el proximo entero que es ingresado
            nro = scan.nextInt();
            System.out.println("El número ingresado es: " + nro);
            System.out.println("Si desea continuar presione 1, sino cualquier otro número:");
            continuar = scan.nextInt();
        }
        //cerramos el escaner si no lo usamos mas. Buena practica
        scan.close();
    }
}