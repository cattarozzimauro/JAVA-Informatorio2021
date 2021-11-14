package EjerciciosComplementariosLevel2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/* Crear una lista que contenga como elementos la numeración de cartas de una
baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList (en
orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el
arrayList y volver a imprimir. */

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> baraja = new ArrayList<>();
        for (int i = 1; i<=10; i++) {
            baraja.add(i + "♥");
        }
        for (int i = 1; i<=10; i++) {
            baraja.add(i + "♦");
        }
        for (int i = 1; i<=10; i++) {
            baraja.add(i + "♣");
        }
        for (int i = 1; i<=10; i++) {
            baraja.add(i + "♠");
        }
        System.out.println("La baraja es: ");
        System.out.println(baraja);
        Collections.reverse(baraja);
        System.out.println("La baraja invertida es: ");
        System.out.println(baraja);
        Collections.shuffle(baraja);
        System.out.println("La baraja desordenada es: ");
        System.out.println(baraja);
    }
}
