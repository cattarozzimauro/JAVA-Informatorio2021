//creo una clase "Person" con los métodos get y set para los atributos Name, City, Dir y Age.
//la misma se usa en el ejercicio 8.
public class Person {
    String name, city, dir;
    int age;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public String getDir(){
        return dir;
    }
    public void setDir(String dir){
        this.dir = dir;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
}

