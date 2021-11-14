package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos. */

public class Ejercicio4 {
    public static void main(String[] args) {
        List<String> alumnos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el nombre de los 12 Alumnos: ");
        for (int i = 1; i <= 12; i++) {
            alumnos.add(scan.nextLine());
        }
        scan.close();
        List<String> curso1 = new ArrayList<String>(alumnos.subList(0, 4));
        List<String> curso2 = new ArrayList<String>(alumnos.subList(4, 8));
        List<String> curso3 = new ArrayList<String>(alumnos.subList(8, 12));
        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);
    }
}
