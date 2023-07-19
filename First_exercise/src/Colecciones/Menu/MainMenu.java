package Colecciones.Menu;

import Colecciones.Main;

public class MainMenu {

    private ExampleMenu example = new ExampleMenu();

    private static void showOptions() {
        System.out.println(
                "📋📋📋 MENU 📋📋📋" + '\n' +
                        "3 ⇒ Ejemplos" + '\n' +
                        "4 ⇒ Salir" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void run() {

        int opc;

        do {
            showOptions();
            opc = selecOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 4);

    }

    private void runOptions(int opc) {
        switch (opc) {
            case 3 -> example.menuExample();
            case 4 -> System.out.println("👋🏼👋🏼 Adios! 👋🏼👋🏼");
            default -> System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
