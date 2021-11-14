import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

/* Supongamos que tenemos una lista con objetos de tipo Producto, que
poseen atributos nombre, tipo, precio unitario (String, String,
BigDecimal), encontrar y devolver el primer producto que su precio
unitario sea menor a 200000.00. Caso contrario mostrar mensaje de No
encontrado (ver formato del mensaje en la imagen debajo). */

public class StreamsEjercicio4 {
    private static final BigDecimal PRECIO_BUSQUEDA = new BigDecimal(val:"200000.00");
    public static void main(String[] args) {
        List<Producto> catalogoProducto = List.of(
            new Producto(nombre:"Iphone 13 Pro", tipo:"Celulares", new BigDecimal(val:"400000.00")),
            new Producto(nombre:"Samsung Galaxy S21 Ultra", tipo:"Celulares", new BigDecimal(val:"200000.00")),
            new Producto(nombre:"Motorola Edge Special Edition", tipo:"Celulares", new BigDecimal(val:"159899.00"))
        );
        Optional<Producto> productoBarato = catalogoProducto.stream()
            .filter(producto -> PRECIO_BUSQUEDA.compareTo(producto.getPrecioUnitario()) > 0)
            .findFirst();
        if (productoBarato.isPresent()) {
            System.out.println("El primero producto que se encontro menor a $" + PRECIO_BUSQUEDA + "es " + productoBarato.get());
        } else {
            System.out.println("No se encontro producto menor a $" + PRECIO_BUSQUEDA);
        }
    }
}

