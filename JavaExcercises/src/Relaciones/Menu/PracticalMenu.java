package Relaciones.Menu;

import Relaciones.Main;
import Relaciones.PracticalExercices.Adopcion.Adopcion;
import Relaciones.PracticalExercices.BarajaCartas.MenuBaraja;
import Relaciones.PracticalExercices.RuletaDeAgua.EmpezarJuego;

public class PracticalMenu {

    private static void showOptions() {
        System.out.println(
                "📋📋📋 RELATIONS PRACTICAL MENU 📋📋📋" + '\n' +
                        "1 ⇒ Adopta un perro" + " | 2 ⇒ Ruleta de agua" + '\n' +
                        "3 ⇒ Baraja de cartas " + " | 4 ⇒ Main menu" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Por favor selecciones una opción 👆🏼");
        return Main.sc.nextInt();
    }

    public void runPracticalMenu() {
        int opc;
        do {
            showOptions();
            opc = selectOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 4);
    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1 -> new Adopcion().datosAdopcion();
            case 2 -> new EmpezarJuego().run();
            case 3 -> new MenuBaraja().runBaraja();
            case 4 -> {
            }
            default -> System.out.printf("❌❌❌❌ Wrong option ❌❌❌❌");
        }
    }

}
