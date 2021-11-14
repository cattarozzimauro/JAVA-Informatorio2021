package EjerciciosGuiados;

import java.util.Scanner;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        //creamos un objeto scanner que toma los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        //creamos una variable del tipo entero y escaneamos el proximo entero que es ingresado
        int nro = scan.nextInt();
        //cerramos el escaner si no lo usamos mas. Buena practica
        scan.close();

        for (int i=1; i <= 10; i++) {
            System.out.println(nro + " * " + i + " = " + nro*i);
        }
    }
}
