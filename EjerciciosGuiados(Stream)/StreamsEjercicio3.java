import java.util.stream.Stream;

/* Cargar un stream que contenga N números. Y que comience con el
número 40: */

public class StreamsEjercicio3 {
    public static void main(String[] args) {
        /* Creamos un Stream de enteros con una iteración de números, que comienza en "40", se autoincrementa
        en "2", hasta un límite de 20 números. */ 
        Stream<Integer> numeros = Stream.iterate(40, n -> n + 2).limit(20);

        /* Imprimimos cada elemento del Stream */
        numeros.forEach(n -> System.out.println(n));

        /* Imprimimos el Stream */
        System.out.println(numeros);
    }
}
/* La consola imprime los números del 40 al 78 con intervalos de "2".
Además, devuelve el espacio de memoria donde se guardó el Stream. */
