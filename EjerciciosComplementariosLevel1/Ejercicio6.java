import java.util.Scanner;

/* Se desea una aplicación que solicite 2 números enteros y realice la operación
de potencia (sin uso de librerías). */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese dos números:");
        int nro1 = scan.nextInt();
        int nro2 = scan.nextInt();
        scan.close();
        int total = 1;
        for (int i = 1; i <= nro2; i++) {
            total = total * nro1;
        }
        System.out.println(nro1 + " ^ " + nro2 + " = " + total);
    }
    
}
