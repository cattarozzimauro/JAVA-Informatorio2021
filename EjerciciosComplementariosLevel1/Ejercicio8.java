import java.util.Scanner;

/* Crear una aplicación que solicite de entrada los datos de una persona en este
orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido} */

public class Ejercicio8 {
    public static void main (String[] args){
        String name, city, dir;
        int age;
        Person person = new Person();
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor, ingrese su nombre: ");
        name = scan.nextLine();
        System.out.print("Por favor, ingrese su ciudad: ");
        city = scan.nextLine();
        System.out.print("Por favor, ingrese su dirección: ");
        dir = scan.nextLine();
        System.out.print("Por favor, ingrese su edad: ");
        age = scan.nextInt();
        person.setName(name);
        person.setCity(city);
        person.setDir(dir);
        person.setAge(age);
        System.out.println(
            person.getCity() + " - " + 
            person.getDir() + " - " + 
            person.getAge() + " - " + 
            person.getName());
        scan.close();
    }

}

