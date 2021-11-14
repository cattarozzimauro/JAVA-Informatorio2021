import java.util.stream.Stream;
import java.util.Collection;
import java.util.Arrays;

/* Crear un Stream a partir de una colección. Crear una lista con todas las
vocales y pasarla a stream. */

public class StreamsEjercicio2 {
    public static void main(String[] args) {
        /* Creamos una coleccion con las vocales */
        Collection<String> vocales = Arrays.asList("a", "e", "i", "o", "u");
        
        /* Convertimos la coleccion en Stream */
        Stream<String> vocalesStream = vocales.stream();
        
        /* Imprimimos el Stream */
        System.out.println(vocalesStream);
    }
}
/* Devuelve el espacio de memoria donde se guarda el stream*/
