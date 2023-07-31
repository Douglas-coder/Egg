package Colecciones.PracticalExercices.Tienda;

import Colecciones.Main;

import java.util.HashMap;
import java.util.Map;

public class TiendaServices {

    HashMap<String, Integer> listaTienda = new HashMap<>();

    public Integer insertProduct() {

        System.out.println("Ingrese el producto");
        String nombre = Main.sc.next();
        System.out.println("Ingresa el precio");
        int valor = Main.sc.nextInt();

        return listaTienda.put(nombre, valor);

    }

    public void mostrarProductos() {
        System.out.println(
                "--------------------" + '\n' +
                        "Los productos son: " + '\n'
        );
        for (Map.Entry<String, Integer> entry : listaTienda.entrySet()) {
            System.out.println(
                    "Producto: " + entry.getKey() + ", Precio: " + entry.getValue()
            );
        }
        System.out.println("--------------------" + '\n');
    }

    public void fabricaProductos() {
        String salir;

        listaTienda.put("Leche", 5000);
        listaTienda.put("Queso", 3000);
        listaTienda.put("Manzana", 2000);
        listaTienda.put("Lechuga", 1500);

        do {

            insertProduct();

            System.out.println("Desea agregar mas productos? (S/N)");
            salir = Main.sc.next();
            System.out.println();
        } while (!salir.equalsIgnoreCase("N"));

    }

    public void actualizarPrecio(String nombre) {
        if (listaTienda.containsKey(nombre)) {
            System.out.println("Ingrese el nuevo precio del producto: '" + nombre + "'");
            Integer nuevoValor = Main.sc.nextInt();

            listaTienda.put(nombre, nuevoValor);
            System.out.println("El precio del producto '" + nombre + "' se actualizo correctamente" + '\n');
        } else {
            System.out.println("El producto '" + nombre + "' no se encuentra en la tienda." + '\n');
        }
    }

    public void eliminarProducto(String nombreProducto) {
        if (listaTienda.containsKey(nombreProducto)) {
            listaTienda.remove(nombreProducto);

            System.out.println("Eliminacion exitosa" + '\n');
        } else {
            System.out.println("El producto '" + nombreProducto + "' no se encuentra en la tienda.");
        }
    }

}
