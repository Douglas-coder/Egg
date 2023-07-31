package Colecciones.PracticalExercices.Tienda.Menu;

import Colecciones.Main;
import Colecciones.PracticalExercices.Tienda.TiendaServices;

public class MenuTienda {

    TiendaServices tienda = new TiendaServices();

    private static void showOptions() {
        System.out.println(
                "🛒🛒🛒 TIENDA 🛒🛒🛒" + '\n' +
                        "1 ⇒ Añadir producto" + '\n' +
                        "2 ⇒ Actualizar precio" + '\n' +
                        "3 ⇒ Eliminar producto" + '\n' +
                        "4 ⇒ Mostrar lista productos" + '\n' +
                        "5 ⇒ Menu principal" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void tiendaMenu() {

        int opc;

        do {
            showOptions();
            opc = selecOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 5);

    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1 -> tienda.fabricaProductos();
            case 2 -> {
                System.out.println("Ingrese el nombre del producto a actualizar");
                String nombre = Main.sc.next();
                tienda.actualizarPrecio(nombre);
            }
            case 3 -> {
                System.out.println("Ingrese el nombre del producto a eliminar");
                String nombre = Main.sc.next();
                tienda.eliminarProducto(nombre);
            }
            case 4 -> {
                tienda.mostrarProductos();
            }
            case 5 -> {
            }
            default -> System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
