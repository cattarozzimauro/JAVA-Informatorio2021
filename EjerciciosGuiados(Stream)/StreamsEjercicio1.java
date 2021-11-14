import java.util.stream.Stream;

/* Crear un Stream vacío. */

public class StreamsEjercicio1 {
    public static void main (String[] args) {
        Stream<String> streamVacio = Stream.empty();
        System.out.println(streamVacio);
    }
}
/* Devuelve el espacio de memoria donde se guarda el stream*/