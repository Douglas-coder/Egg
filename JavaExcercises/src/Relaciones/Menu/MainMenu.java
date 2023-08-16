package Relaciones.Menu;

import Relaciones.Main;

public class MainMenu {

    private static void showOptions() {
        System.out.println(
                "📋📋📋 RELATIONS MAIN MENU 📋📋📋" + '\n' +
                        "1 ⇒ Practical exercices" + " | 2 ⇒ Bonus excercises" + '\n' +
                        "3 ⇒ Challenges          " + " | 4 ⇒ Salir" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Por favor selecciones una opción 👆🏼");
        return Main.sc.nextInt();
    }

    public void run() {
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
            case 1 -> new PracticalMenu().runPracticalMenu();
            case 2 -> new BonusMenu().runBonusMenu();
            case 3 -> new ChallengeMenu().runChallengeMenu();
            case 4 -> System.out.println("👋🏼👋🏼👋🏼👋🏼 Good bye! 👋🏼👋🏼👋🏼👋🏼");
            default -> System.out.printf("❌❌❌❌ Wrong option ❌❌❌❌");
        }
    }
}
