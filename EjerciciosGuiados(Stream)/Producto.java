import java.math.BigDecimal;

public class Producto {
    String nombre, tipo;
    BigDecimal val;

    public Producto(String string, String string2, BigDecimal bigDecimal) {
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public BigDecimal getVal() {
        return this.val;
    }
    public void setVal(BigDecimal val) {
        this.val = val;
    }
    public BigDecimal getPrecioUnitario() {
        return null;
    }
}
