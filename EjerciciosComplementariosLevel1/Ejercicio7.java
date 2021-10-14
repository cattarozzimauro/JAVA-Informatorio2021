import java.util.Scanner;

/* Realizar un programa que dado un String de entrada en minúsculas lo
convierta por completo a mayúsculas. Sin uso de métodos o librerías que
realicen toUppercase(). */

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor, ingrese una palabra en minúsculas: ");
        String word = scan.nextLine();
        char[] charArray = word.toCharArray();
        for (int i = 0; i < word.length(); i++){
            charArray[i] &= 0x5f;
        }
        word = String.valueOf(charArray);    
        System.out.println(word);
        scan.close();
    }
}