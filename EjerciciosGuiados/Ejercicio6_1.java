import java.util.Scanner;

public class Ejercicio6_1 {
    public static void main(String[] args) {
        //creamos un objeto scanner que toma los valores de entrada por consola
        Scanner scan = new Scanner(System.in);
        int continuar;
        int nro;
        do {
            System.out.println("Por favor ingrese un número: ");
            nro = scan.nextInt();
            System.out.println("El número ingresado es: " + nro);
            System.out.println("Si desea continuar presione 1, sino cualquier otro número:");
            continuar = scan.nextInt();
        } while (continuar == 1);
        scan.close();
    }
}