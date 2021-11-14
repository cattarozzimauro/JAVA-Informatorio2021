package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 */

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("Por favor ingrese dos valores: ");
        Scanner scan = new Scanner(System.in);
        Integer a = scan.nextInt();
        Integer b = scan.nextInt();
        scan.close();
        List<String> secuencia = funcionBuzz(a, b);
        System.out.println(secuencia);
    }

    public static List<String> funcionBuzz(Integer a, Integer b) {
        List<String> rango = new ArrayList<>();
        for (int i = a; i < b; i++) {
            if (i%2 == 0 && i%3 == 0) {
                rango.add("FizzBuzz");
            }
            else if (i%2 == 0) {
                rango.add("Fizz");
            }
            else if (i%3 == 0) {
                rango.add("Buzz");
            }
            else {
                rango.add(String.valueOf(i));
            }
        }
        return rango;
    }
}

