package Colecciones.Menu;

import Colecciones.Ejemplos.Ejemplo1;
import Colecciones.Ejemplos.Mascota.Mascota;
import Colecciones.Main;

public class ExampleMenu {

    private static void showOptions() {
        System.out.println(
                "📑📑📑 Example Menu 📑📑📑" + '\n' +
                        "1 ⇒ Mascotas" + '\n' +
                        "2 ⇒ Ejemplo 1" + '\n' +
                        "3 ⇒ Menu principal" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuExample() {

        int opc;

        do {
            showOptions();
            opc = selecOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 3);

    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1:
                new Mascota();
                break;
            case 2:
                new Ejemplo1();
                break;
            case 3:
                break;
            default:
                System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
