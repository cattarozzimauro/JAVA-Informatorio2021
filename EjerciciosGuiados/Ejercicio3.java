import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        //creamos un objeto scanner que toma los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        //Creamos una variable del tipo entero.
        int nota;
        while (continuar == 1) {
            System.out.println("Ingrese la nota del Alumno por consola:");
            //Escaneamos el proximo entero que es ingresado
            nota = scan.nextInt();
            if (nota > 92) {
                System.out.println("Excelente");
            } else if (nota > 84) {
                System.out.println("Sobresaliente");
            } else if (nota > 74) {
                System.out.println("Distinguido");
            } else if (nota > 59) {
                System.out.println("Bueno");
            } else {
                System.out.println("Desaprobado");
            }
            System.out.println("Si desea continuar presione 1, sino cualquier otro número:");
            continuar = scan.nextInt();
        //cerramos el escaner si no lo usamos mas. Buena practica
        }
    scan.close();
    }
}