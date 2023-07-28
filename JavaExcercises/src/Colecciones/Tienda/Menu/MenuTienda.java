package Colecciones.Tienda.Menu;

import Colecciones.Main;
import Colecciones.Tienda.Producto;
import Colecciones.Tienda.TiendaServices;

public class MenuTienda {

    TiendaServices tienda = new TiendaServices();
    Producto producto = new Producto();

    private static void showOptions() {
        System.out.println(
                "🛒🛒🛒 TIENDA 🛒🛒🛒" + '\n' +
                        "1 ⇒ Anadir producto" + '\n' +
                        "2 ⇒ Vender producto" + '\n' +
                        "3 ⇒ Reponer producto" + '\n' +
                        "4 ⇒ Mostrar lista productos" + '\n' +
                        "5 ⇒ Eliminar Productos" + '\n' +
                        "6 ⇒ Menu principal" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuTienda() {

        int opc;

        do {
            showOptions();
            opc = selecOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 6);

    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1 -> tienda.fabricaProductos();
            case 2 -> {
                System.out.println("Ingrese el nombre del producto a vender");
                String nombre = Main.sc.next();
                tienda.venta(nombre);
            }
            case 3 -> {
                System.out.println("Ingrese el nombre del producto a reponer");
                String nombre = Main.sc.next();
                tienda.reposicion(nombre);
            }
            case 4 -> tienda.mostrarProductos();
            case 5 -> {
                System.out.println("Ingrese el nombre del producto a eliminar");
                String nombre = Main.sc.next();
                tienda.eliminarProducto(nombre);
            }
            case 6 -> {}
            default -> System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
