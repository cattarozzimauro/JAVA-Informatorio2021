import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar. */

public class Ejercicio5 {
    public static void main(String[] args) {
        List<Integer> horas = new ArrayList<>();
        List<Integer> valor = new ArrayList<>();
        List<Integer> totales = new ArrayList<>();
        int total = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese las horas trabajadas en la semana (L,M,M,J,V): ");
        for (int i = 1; i <= 5; i++) {
            horas.add(scan.nextInt());
        }
        System.out.println("Muchas Gracias!");
        System.out.println("Por favor ingrese el valor de las horas trabajadas en cada dia: ");
        for (int i = 1; i <= 5; i++) {
            valor.add(scan.nextInt());
        }
        System.out.println("Muchas Gracias!");
        scan.close();
        for (int i = 0; i < 5; i++) {
            totales.add(horas.get(i)*valor.get(i));
            total = total + (horas.get(i)*valor.get(i));
        }
        System.out.println("El total a cobrar de cada dia es: $" + totales);
        System.out.println("El total a cobrar es de : $" + total);
    }
}
