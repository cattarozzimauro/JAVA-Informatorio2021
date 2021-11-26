import java.util.List;
import java.util.Map;
import java.time.LocalDate;
import java.time.Period;
import java.util.stream.*;
/*
Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea
generar un Map<String, Integer> donde la clave de Map será el apellido
concatenado con el nombre (con separador de espacio en blanco) y el value la
edad del alumno.
●   La lista de entrada debe estar cargada con varios alumnos (al menos 5)
    para subir el ejemplo y demostrar su funcionamiento.
●   En ejemplo se muestra solo con 1 Alumno a modo de abreviar
●   En el ejemplo también se usa LocalDate.now().minusYears(30), en el
    ejercicio a presentar se deberá usar otra tecnica de construcción para la
    fecha (no usar .now(). Pueden ver métodos .parse(), etc)
*/
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Alumno> alumnos = setAlumnos();
        Map<String, Integer> mapAlumnos = alumnos.stream()
            .collect(Collectors.toMap(alumno -> alumno.getNombre() + " " + alumno.getApellido(),
            alumno -> Period.between(alumno.getFechaDeNacimiento(), LocalDate.now())
            .getYears()));
        System.out.println(mapAlumnos);
    
    }

    public static List<Alumno> setAlumnos(){
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno();
        Alumno alumno3 = new Alumno();
        Alumno alumno4 = new Alumno();
        Alumno alumno5 = new Alumno();
        alumno1.setNombre("Lucas");
        alumno1.setApellido("Romero");
        alumno1.setFechaDeNacimiento("1994-03-24");
        alumno2.setNombre("Maria");
        alumno2.setApellido("Gomez");
        alumno2.setFechaDeNacimiento("1995-10-30");
        alumno3.setNombre("Romina");
        alumno3.setApellido("Toledo");
        alumno3.setFechaDeNacimiento("1995-02-14");
        alumno4.setNombre("Nicolas");
        alumno4.setApellido("Aguero");
        alumno4.setFechaDeNacimiento("1994-08-25");
        alumno5.setNombre("Juan");
        alumno5.setApellido("Ramirez");
        alumno5.setFechaDeNacimiento("1993-06-09");
        List<Alumno> alumnos = List.of(alumno1,alumno2,alumno3,alumno4,alumno5);
        return alumnos;
    } 
}
