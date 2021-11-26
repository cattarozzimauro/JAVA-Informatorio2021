import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;
/*
Dada una lista que contiene valores de tipo String, se deberá filtrar todos los
valores que NO sean null o vacío ("").
*/
public class Ejercicio1 {
    public static void main(String[] args) {
        Collection<String> palabras = Arrays.asList("Hola", null, "Informatorio", "");
        ArrayList<String> palabraStream = palabras.stream().filter(palabra -> palabra != null && palabra != "").collect(Collectors.toCollection(ArrayList::new));
        System.out.println(palabraStream);
    }
    
}
