package Colecciones.Menu;

import Colecciones.Main;

public class MainMenu {

    private static void showOptions() {
        System.out.println(
                "📋📋📋 MENU 📋📋📋" + '\n' +
                        "1 ⇒ Ejercicios practicos" + '\n' +
                        "2 ⇒ Ejercicios extra" + '\n' +
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
            case 1 -> new PracticalMenu().menuPractical();
            case 2 -> new BonusMenu().menuBonus();
            case 3 -> new ExampleMenu().menuExample();
            case 4 -> System.out.println("👋🏼👋🏼 Adios! 👋🏼👋🏼");
            default -> System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
