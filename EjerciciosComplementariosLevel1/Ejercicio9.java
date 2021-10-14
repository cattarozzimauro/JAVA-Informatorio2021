import java.util.Scanner;

/* Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que
aparece una letra dada. */

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor, ingrese una palabra o fase: ");
        String word = scan.nextLine();
        char[] frase = word.toCharArray();
        System.out.print("Por favor, ingrese la letra a contar en la palabra o frase: ");
        String letter = scan.nextLine();
        char[] let = letter.toCharArray();
        char[] let2 = letter.toCharArray(); 
        let2[0] &= 0x5f;
        int count = 0;
        for (int i = 0; i < word.length(); i++){
            if (frase[i] == let[0] || frase[i] == let2[0]){
                count += 1;
            }
        }        
        System.out.println("El total de veces que aparece " + let[0] + " es: " + count);
        scan.close();
    }
}
