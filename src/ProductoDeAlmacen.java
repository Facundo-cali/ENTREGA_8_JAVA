public class ProductoDeAlmacen extends Producto implements IVA {
    int peso;
    int iva;
    int precioConIva = 0;

    ProductoDeAlmacen() {}
    ProductoDeAlmacen(int precio, String nombre, int peso, int iva) {
        super(precio, nombre);
        this.peso = peso;
        this.iva = iva;
        calcularIva();
    }

    public int getIva() {
        return this.iva;
    }
    public int getPeso() {
        return this.peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }
    public void setIva(int iva) {
        this.iva = iva;
    }

    public void calcularIva() {
        this.precioConIva = this.precio + (this.precio * this.iva / 100);
    }

    public int getPrecioConIva() {
        return this.precioConIva;
    }

    public String toString() {
        String infoProducto = super.toString();
        return infoProducto + " Peso: " + this.peso + " IVA: " + this.iva + " Precio con IVA: " + this.precioConIva;
    }
}
