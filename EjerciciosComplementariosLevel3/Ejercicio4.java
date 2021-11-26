import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;
/*
Se dispone de una lista de Integer, de la cual queremos obtener otra lista
aplicando la operación de factorial pero no se desean valores repetidos.
*/
public class Ejercicio4 {
    public static void main(String[] args) {
        List<Integer> enteros = List.of(1,2,4,4,4);
        ArrayList<Integer> factorial = new ArrayList<>();
        for (int n = 0; n < enteros.size(); n++) {
            int nro = enteros.get(n);
            factorial.add(Factorial(nro));
        }
        ArrayList<Integer> factoriaList = factorial.stream()
        .distinct()
        .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(factoriaList);
    }
    private static Integer Factorial(int nro) {
        int acumulador = 1;
        for (int i = 1; i <= nro; i++) {
            acumulador = acumulador * i;
        }
        return acumulador;
    }
}