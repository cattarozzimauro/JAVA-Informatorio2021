package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número
entero al principio de la lista y otro al final. Por último, iterar e imprimir los
elementos de la lista y el tamaño de la misma (antes y después de agregar a
en la primera y última posición).*/

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        System.out.println("Ingrese 5 numeros: ");
        for (int i = 1; i<=5; i++) {
            lista.add(scan.nextInt());
        }
        iterar(lista);
        System.out.println("La longitud de la lista es: " + lista.size());
        System.out.println("Ingrese un numero:");
        lista.add(0, scan.nextInt());
        System.out.println("Ingrese un numero:");
        lista.add(scan.nextInt());
        iterar(lista);
        System.out.println("La longitud de la lista ahora es: " + lista.size());
        scan.close();
    }

    public static void iterar(List<Integer> lista) {
        System.out.println("La lista es: ");
        for (Integer elemento: lista) {
            System.out.println(elemento);
        }
    }
}
