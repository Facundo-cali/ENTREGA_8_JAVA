import java.util.ArrayList;
import java.util.List;

public class Carrito {
    private List<ProductoDeAlmacen> productosAlmacen = new ArrayList<>();
    private int total = 0;

    public Carrito() {}

    public void agregarProducto(ProductoDeAlmacen producto) {
        this.productosAlmacen.add(producto);
        this.total += producto.getPrecioConIva();
    }

    public void eliminarProducto(ProductoDeAlmacen producto) {
        this.productosAlmacen.remove(producto);
    }

    public int cantidadProductos() {
        return this.productosAlmacen.size();
    }

    public void obtenerProductos(){
        this.productosAlmacen.forEach(producto -> System.out.println(producto.toString()));
    }

    public ProductoDeAlmacen obtenerProducto(String nombre) {
        ProductoDeAlmacen productoEncontrado = null;
        for (ProductoDeAlmacen producto : productosAlmacen) {
            if (producto.getNombre().equals(nombre)) {
                productoEncontrado = producto;
                break;
            }
        }
        if (productoEncontrado == null) {
            System.out.println("No se encontró el producto");
        }
        return productoEncontrado;
    }

    public int getTotal() {
        return this.total;
    }

}
