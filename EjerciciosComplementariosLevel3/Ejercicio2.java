import java.util.stream.*;
import java.util.List;
/*
Dada una lista que contiene números enteros, se deberá generar otra lista que
contendrá el resultado de aplicar la operación de potencia a 2.
*/
public class Ejercicio2 {
    public static void main(String[] args) {
        List<Integer> enteros = List.of(1,2,3,4,5);
        List<Integer> potencia = enteros.stream()
        .map(n -> n*n)
        .collect(Collectors.toList());
        System.out.println(potencia);
    }
}
