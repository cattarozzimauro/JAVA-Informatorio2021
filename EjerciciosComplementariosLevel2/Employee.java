public class Employee {
    String nombre;
    Integer dni, horasTrabajadas, valorPorHora;

    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getDni() {
        return this.dni;
    }
    public void setDni(Integer dni) {
        this.dni = dni;
    }
    public Integer getHorasTrabajadas() {
        return this.horasTrabajadas;
    }
    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public Integer getValorPorHora() {
        return this.valorPorHora;
    }
    public void setValorPorHora(Integer valorPorHora) {
        this.valorPorHora = valorPorHora;
    }
}
