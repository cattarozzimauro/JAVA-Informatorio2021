import java.util.Scanner;

/* Se desea una aplicación que solicite 2 números enteros y realice la operación
de multiplicación por sumas sucesivas (sin uso de librerías). */

public class Ejercicio5 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese dos números:");
        int nro1 = scan.nextInt();
        int nro2 = scan.nextInt();
        scan.close();
        int total = 0;
        for (int i = 1; i <= nro2; i++) {
            total = total + nro1;
        }
        System.out.println(nro1 + " x " + nro2 + " = " + total);
    }
    
}
