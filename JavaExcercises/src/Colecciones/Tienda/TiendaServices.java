package Colecciones.Tienda;

import Colecciones.Main;

import java.util.ArrayList;
import java.util.List;

public class TiendaServices extends Producto {


    //Producto producto = new Producto();
    List<Producto> listaProductos = new ArrayList<>();

    //Metodo para crear productos
    public Producto crearProducto(){

        System.out.println("Ingrese el nombre del producto");
        String nombre = Main.sc.next();
        System.out.println("Ingrese la categoria del producto");
        String categoria = Main.sc.next();
        System.out.println("Ingrese el precio del producto");
        int precio = Main.sc.nextInt();
        System.out.println("Ingrese la cantidad de stok");
        int inventario = Main.sc.nextInt();

        return new Producto(nombre, categoria,precio,inventario);

    }

    //Metodo para agregar los datos a la lista
    public void agregarProductos(Producto p){listaProductos.add(p);}

    public void mostrarProductos(){
        System.out.println("Los productos son: " + '\n');
        for (Producto aux : listaProductos) {
            System.out.println(aux.toString());
        }
    }

    //Metodo para generar un producto
    public void fabricaProductos(){
        String salir;

        listaProductos.add(new Producto("Leche","Lacteos",5000,5));
        listaProductos.add(new Producto("Queso","Lacteos",3000,7));
        listaProductos.add(new Producto("Manzana","Frutas",2000,10));
        listaProductos.add(new Producto("Lechuga","Verduras",7000,8));

        do {
            for (int i = 0; i < 1; i++) {
                Producto crearProductos = crearProducto();
                agregarProductos(crearProductos);
            }
            System.out.println("Desea agregar mas productos? (S/N)");
            salir = Main.sc.next();
            System.out.println();
        }while (!salir.equalsIgnoreCase("N") );

    }

    //Metodo para venta de productos
    public boolean venta(String nombreProducto) {
        Producto productoVenta = null;
        for (Producto producto : listaProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoVenta = producto;
                break;
            }
        }

        if (productoVenta == null) {
            System.out.println("El producto '" + nombreProducto + "' no se encuentra en la tienda." + '\n');
            return false;
        }

        if (productoVenta.getCantInventario() <= 0) {
            System.out.println("El producto '" + nombreProducto + "' no tiene inventario disponible para vender." + '\n');
            return false;
        }

        System.out.println("Cuantos productos vas a vender");
        int cantidadVenta = Main.sc.nextInt();

        productoVenta.setCantInventario(productoVenta.getCantInventario() - cantidadVenta);
        System.out.println("Venta realizada con éxito. Quedan " + productoVenta.getCantInventario() + " unidades del producto '" + nombreProducto + "'.");
        return true;
    }


    //Metodo para reposicion de productos
    public void reposicion(String nombreProducto) {
        Producto productoReposicion = null;
        for (Producto producto : listaProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoReposicion = producto;
                break;
            }
        }

        if (productoReposicion == null) {
            System.out.println("El producto '" + nombreProducto + "' no se encuentra en la tienda.");
        } else {

            System.out.println("Cuantos productos vas a reponer");
            int cantidadRepo = Main.sc.nextInt();

            productoReposicion.setCantInventario(productoReposicion.getCantInventario() + cantidadRepo);
            System.out.println("Reposición realizada con éxito. Ahora hay " + productoReposicion.getCantInventario() + " unidades del producto '" + nombreProducto + "'.");
        }
    }

    //Metodo para eliminar productos
    public void eliminarProducto(String nombreProducto) {
        Producto productoEliminar = null;
        for (Producto producto : listaProductos) {
            if (producto.getNombre().equalsIgnoreCase(nombreProducto)) {
                productoEliminar = producto;
                break;
            }
        }

        if (productoEliminar == null) {
            System.out.println("El producto '" + nombreProducto + "' no se encuentra en la tienda.");
        } else {
            listaProductos.remove(productoEliminar);
            System.out.println("Eliminacion éxitosa." + '\n');
        }
    }

}
