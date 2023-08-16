package Relaciones.Menu;

import Relaciones.Main;

public class ChallengeMenu {

    private static void showOptions() {
        System.out.println(
                "📋📋📋 RELATIONS CHALLENGE MENU 📋📋📋" + '\n' +
                        "1 ⇒ " + " | 2 ⇒ " + '\n' +
                        "3 ⇒ " + " | 4 ⇒ " + '\n' +
                        "5 ⇒ " + " | 6 ⇒ Main menu" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Por favor selecciones una opción 👆🏼");
        return Main.sc.nextInt();
    }

    public void runChallengeMenu() {
        int opc;
        do {
            showOptions();
            opc = selectOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 6);
    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1 -> {
            }
            case 2 -> {
            }
            case 3 -> {
            }
            case 4 -> {
            }
            case 5 -> {
            }
            case 6 -> {
            }
            default -> System.out.printf("❌❌❌❌ Wrong option ❌❌❌❌");
        }
    }

}
