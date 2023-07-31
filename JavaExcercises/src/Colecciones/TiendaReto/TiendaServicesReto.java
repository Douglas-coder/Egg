package Colecciones.TiendaReto;

import Colecciones.Main;

import java.util.ArrayList;
import java.util.List;

public class TiendaServicesReto extends ProductoReto {


    //Producto producto = new Producto();
    List<ProductoReto> listaProductoRetos = new ArrayList<>();

    //Metodo para crear productos
    public ProductoReto crearProducto() {

        System.out.println("Ingrese el nombre del producto");
        String nombre = Main.sc.next();
        System.out.println("Ingrese la categoria del producto");
        String categoria = Main.sc.next();
        System.out.println("Ingrese el precio del producto");
        int precio = Main.sc.nextInt();
        System.out.println("Ingrese la cantidad de stok");
        int inventario = Main.sc.nextInt();

        return new ProductoReto(nombre, categoria, precio, inventario);

    }

    //Metodo para agregar los datos a la lista
    public void agregarProductos(ProductoReto p) {
        listaProductoRetos.add(p);
    }

    public void mostrarProductos() {
        System.out.println("Los productos son: " + '\n');
        for (ProductoReto aux : listaProductoRetos) {
            System.out.println(aux.toString());
        }
    }

    //Metodo para generar un producto
    public void fabricaProductos() {
        String salir;

        listaProductoRetos.add(new ProductoReto("Leche", "Lacteos", 5000, 5));
        listaProductoRetos.add(new ProductoReto("Queso", "Lacteos", 3000, 7));
        listaProductoRetos.add(new ProductoReto("Manzana", "Frutas", 2000, 10));
        listaProductoRetos.add(new ProductoReto("Lechuga", "Verduras", 7000, 8));

        do {
            for (int i = 0; i < 1; i++) {
                ProductoReto crearProductos = crearProducto();
                agregarProductos(crearProductos);
            }
            System.out.println("Desea agregar mas productos? (S/N)");
            salir = Main.sc.next();
            System.out.println();
        } while (!salir.equalsIgnoreCase("N"));

    }

    //Metodo para venta de productos
    public boolean venta(String nombreProducto) {
        ProductoReto productoRetoVenta = null;
        for (ProductoReto productoReto : listaProductoRetos) {
            if (productoReto.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoRetoVenta = productoReto;
                break;
            }
        }

        if (productoRetoVenta == null) {
            System.out.println("El producto '" + nombreProducto + "' no se encuentra en la tienda." + '\n');
            return false;
        }

        if (productoRetoVenta.getCantInventario() <= 0) {
            System.out.println("El producto '" + nombreProducto + "' no tiene inventario disponible para vender." + '\n');
            return false;
        }

        System.out.println("Cuantos productos vas a vender");
        int cantidadVenta = Main.sc.nextInt();

        productoRetoVenta.setCantInventario(productoRetoVenta.getCantInventario() - cantidadVenta);
        System.out.println("Venta realizada con éxito. Quedan " + productoRetoVenta.getCantInventario() + " unidades del producto '" + nombreProducto + "'.");
        return true;
    }


    //Metodo para reposicion de productos
    public void reposicion(String nombreProducto) {
        ProductoReto productoRetoReposicion = null;
        for (ProductoReto productoReto : listaProductoRetos) {
            if (productoReto.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoRetoReposicion = productoReto;
                break;
            }
        }

        if (productoRetoReposicion == null) {
            System.out.println("El producto '" + nombreProducto + "' no se encuentra en la tienda.");
        } else {

            System.out.println("Cuantos productos vas a reponer");
            int cantidadRepo = Main.sc.nextInt();

            productoRetoReposicion.setCantInventario(productoRetoReposicion.getCantInventario() + cantidadRepo);
            System.out.println("Reposición realizada con éxito. Ahora hay " + productoRetoReposicion.getCantInventario() + " unidades del producto '" + nombreProducto + "'.");
        }
    }

    //Metodo para eliminar productos
    public void eliminarProducto(String nombreProducto) {
        ProductoReto productoRetoEliminar = null;
        for (ProductoReto productoReto : listaProductoRetos) {
            if (productoReto.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoRetoEliminar = productoReto;
                break;
            }
        }

        if (productoRetoEliminar == null) {
            System.out.println("El producto '" + nombreProducto + "' no se encuentra en la tienda.");
        } else {
            listaProductoRetos.remove(productoRetoEliminar);
            System.out.println("Eliminacion éxitosa." + '\n');
        }
    }

}
