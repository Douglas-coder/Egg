package Colecciones.DesafioColecciones.TiendaReto.Menu;

import Colecciones.DesafioColecciones.TiendaReto.TiendaServicesReto;
import Colecciones.Main;
import Colecciones.DesafioColecciones.TiendaReto.ProductoReto;

public class MenuTiendaReto {

    TiendaServicesReto tienda = new TiendaServicesReto();
    ProductoReto productoReto = new ProductoReto();

    private static void showOptions() {
        System.out.println(
                "🛒🛒🛒 TIENDA RETO 🛒🛒🛒" + '\n' +
                        "1 ⇒ Añadir producto     " + " | 2 ⇒ Vender producto" + '\n' +
                        "3 ⇒ Reponer producto  " + " | 4 ⇒ Mostrar lista productos" + '\n' +
                        "5 ⇒ Eliminar Productos " + " | 6 ⇒ Menu challenge" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuTiendaReto() {

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
            case 6 -> {
            }
            default -> System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
