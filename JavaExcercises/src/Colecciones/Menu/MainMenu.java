package Colecciones.Menu;

import Colecciones.Main;
import Colecciones.Tienda.Menu.MenuTienda;

public class MainMenu {

    private static void showOptions() {
        System.out.println(
                "📋📋📋 MENU 📋📋📋" + '\n' +
                        "1 ⇒ Ejercicios practicos" + '\n' +
                        "2 ⇒ Ejercicios extra" + '\n' +
                        "3 ⇒ Ejemplos" + '\n' +
                        "4 ⇒ Desafios" + '\n' +
                        "5 ⇒ Salir" + '\n'
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
        } while (opc != 5);

    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1 -> new PracticalMenu().menuPractical();
            case 2 -> new BonusMenu().menuBonus();
            case 3 -> new ExampleMenu().menuExample();
            case 4 -> new MenuTienda().menuTienda();
            case 5 -> System.out.println("👋🏼👋🏼 Adios! 👋🏼👋🏼");
            default -> System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
