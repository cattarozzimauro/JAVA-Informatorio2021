package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking */

public class Ejercicio1 {
    public static void main(String[] args) {
        List<String> CiudadesFavoritas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        while (continuar == 1) {
            System.out.println("A continuación agregue sus Ciudades Favoritas de la Argentina:");
            CiudadesFavoritas.add(scan.nextLine());
            System.out.println("Si desea ingresar otra ciudad, presione 1. Sino, cualquier otro número: ");
            continuar = scan.nextInt();
            scan.nextLine();
        }
        scan.close();
        int nro = CiudadesFavoritas.size();
        for (int i=0; i < nro; i++) {
            System.out.println("Ciudad #" + (i+1) + ": " + CiudadesFavoritas.get(i));
        }
    }
}