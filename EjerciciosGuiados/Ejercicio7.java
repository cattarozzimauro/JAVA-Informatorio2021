package EjerciciosGuiados;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int continuar = 1;
        int opcion;
        
        while (continuar == 1){
            System.out.println("Opción 1: ingresar 3 números y mostrarlos por pantalla.");
            System.out.println("Opción 2: evaluar una nota.");
            System.out.println("Opción 3: conocer día de la semana.");
            opcion = scan.nextInt();
            switch (opcion){
                case 1: 
                    int a = scan.nextInt();
                    int b = scan.nextInt();
                    int c = scan.nextInt();
                    Ejercicio2(a, b, c);
                    break;
                case 2:
                    System.out.println("Ingrese la nota a evaluar: ");
                    int nota = scan.nextInt();
                    Ejercicio3(nota);
                    break;
                case 3:
                    System.out.print("Ingrese el día de la semana: ");
                    int nro = scan.nextInt();
                    Ejercicio4(nro);
                    break;
            }
            System.out.println("Si desea continuar ingresando un valor, presione 1. Sino, cualquier otro número: ");
            continuar = scan.nextInt();
        }
        scan.close();
    }
    public static void Ejercicio2(int a, int b, int c){
        System.out.println("El primer número ingresado es " + a);
        System.out.println("El segundo número ingresado es " + b);
        System.out.println("El tercer número ingresado es " + c);
    }
    public static void Ejercicio3(int nota){   
        if (nota > 92){
            System.out.println("Excelente");
        } else if (nota > 84){
            System.out.println("Sobresaliente");
        } else if (nota > 74){
            System.out.println("Distinguido");
        } else if (nota > 59){
            System.out.println("Bueno");
        } else{
            System.out.println("Desaprobado");
        }
    }
    public static void Ejercicio4(int nro){       
        switch (nro){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
    }
}


