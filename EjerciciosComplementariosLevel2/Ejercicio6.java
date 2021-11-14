package EjerciciosComplementariosLevel2;

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

/* Se dispone de una lista de Empleados, de cada empleado se conoce:
○ Nombre y Apellido
○ DNI
○ horasTrabajadas
○ valorPorHora
Todos los empleados están cargados en un Set (HashSet), se desea calcular el
sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
(value) es el sueldo calculado. */

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Map<Integer, Integer> sueldo = new HashMap<Integer, Integer>();
        Set<Employee> empleados = new HashSet<>();
        int confirmacion = 1;
            while (confirmacion == 1) {
                empleados.add(crearEmpleado(scan));
                System.out.println("Si desea agregar otro empleado, ingrese 1: ");
                confirmacion = scan.nextInt();
                scan.nextLine();
            }
        scan.close();
        for (Employee empleado: empleados) {
            sueldo.put(empleado.getDni(), (empleado.getHorasTrabajadas()*empleado.getValorPorHora()));
        }
        for (Map.Entry<Integer, Integer> empleado: sueldo.entrySet()) {
            System.out.println("DNI: " + empleado.getKey() + " ; Sueldo: $" + empleado.getValue());
        }
    }

    public static Employee crearEmpleado(Scanner scan) {
        Employee empleado1 = new Employee();
        System.out.println("Ingrese el Nombre y Apellido del empleado: ");
        empleado1.setNombre(scan.nextLine());
        System.out.println("Ingrese el DNI del empleado: ");
        empleado1.setDni(scan.nextInt());
        System.out.println("Ingrese las horas trabajadas del empleado: ");
        empleado1.setHorasTrabajadas(scan.nextInt());
        System.out.println("Ingrese el valor por hora del empleado: ");
        empleado1.setValorPorHora(scan.nextInt());
        return empleado1;
    }
}
