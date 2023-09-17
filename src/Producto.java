public class Producto {
    int precio;
    String nombre;

    Producto() {}

    Producto(int precio, String nombre) {
        this.precio = precio;
        this.nombre = nombre;
    }

    public int getPrecio() {
        return this.precio;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return "Producto: " + this.nombre + " Precio: " + this.precio;
    }

}
