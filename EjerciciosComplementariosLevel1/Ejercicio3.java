import java.util.Scanner;

/* Confeccionar un programa que dado un número entero como dato de
entrada imprima la secuencia de números (incrementos de 1) de la siguiente
forma: */

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un número:");
        int nro = scan.nextInt();
        scan.close();
        System.out.println("A continuación se imprimirá la secuencia correspondiente:");
        //inicia un ciclo for.
        for (int i=1; i <= nro; i++ ) {
            //inicia un cilco for anidado que se encarga de encadenar la secuencia de nros en una misma linea.
            for (int j=1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }    
}
