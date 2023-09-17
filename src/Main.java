import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Carrito carrito = new Carrito();

        ProductoDeAlmacen producto1 = new ProductoDeAlmacen(100, "Leche", 1, 16);
        ProductoDeAlmacen producto2 = new ProductoDeAlmacen(200, "Pan", 2, 16);
        ProductoDeAlmacen producto3 = new ProductoDeAlmacen(300, "Huevo", 3, 16);
        ProductoDeAlmacen producto4 = new ProductoDeAlmacen(400, "Queso", 4, 16);
        ProductoDeAlmacen producto5 = new ProductoDeAlmacen(500, "Jamon", 5, 16);

        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        carrito.agregarProducto(producto3);
        carrito.agregarProducto(producto4);
        carrito.agregarProducto(producto5);

        boolean salir = false;

        while (!salir) {
            System.out.println("\n*** Supermercado ***");
            System.out.println("1. Agregar producto al carrito");
            System.out.println("2. Ver cantidad de productos en el carrito");
            System.out.println("3. Ver importe total del carrito");
            System.out.println("4. Ver contenido del carrito");
            System.out.println("5. Borrar producto del carrito");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion;
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Debe ingresar un número");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println("Creacion de producto");
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el precio del producto: ");
                    int precio;
                    try {
                        precio = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar un número");
                        break;
                    }

                    System.out.print("Ingrese el peso del producto: ");
                    int peso;
                    try {
                        peso = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar un número");
                        break;
                    }
                    System.out.print("Ingrese el IVA del producto: ");
                    int iva;
                    try {
                        iva = scanner.nextInt();
                        scanner.nextLine();
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar un número");
                        break;
                    }

                    ProductoDeAlmacen producto = new ProductoDeAlmacen(precio, nombre, peso, iva);
                    carrito.agregarProducto(producto);
                    System.out.println("Producto agregado al carrito!");
                    break;
                case 2:
                    System.out.println("Cantidad de productos en el carrito: " + carrito.cantidadProductos());
                    break;
                case 3:
                    System.out.println("Importe total del carrito: " + carrito.getTotal());
                    break;
                case 4:
                    carrito.obtenerProductos();
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del producto a borrar: ");
                    String nombreProducto = scanner.nextLine();
                    ProductoDeAlmacen productoEncontrado = carrito.obtenerProducto(nombreProducto);
                    if (productoEncontrado != null) {
                        carrito.eliminarProducto(productoEncontrado);
                        System.out.println("Producto eliminado del carrito!");
                    } else {
                        System.out.println("No se encontró el producto");
                    }
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
        scanner.close();
    }
}