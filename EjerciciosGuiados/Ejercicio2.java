import java.util.*;

public class Ejercicio2 {

    public static void main(String[] args) {
        //creamos un método scanner que tomará los valores de entrada por consola.
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int a, b, c;
        
        while (continuar == 1) {
            System.out.println("Ingrese el primer número por la consola:");
            a = scan.nextInt();
            System.out.println("Ingrese el segundo número por la consola:");
            b = scan.nextInt();
            System.out.println("Ingrese el tercero número por la consola:");
            c = scan.nextInt();
            System.out.println("El primer número ingresado es: " + a);
            System.out.println("El segundo número ingresado es: " + b);
            System.out.println("El tercer número ingresado es: " + c);
            continuar = scan.nextInt();
        }
        scan.close();
    }
}