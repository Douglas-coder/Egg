package POOExercises.Menu;

import POOExercises.MainProgram.RefactorMain;

public class MenuPrincipal {

    private static void showMenuOptions() {
        System.out.println(
                "📋📋📋 MENU 📋📋📋" + '\n' +
                        "1 ⇒ Ejercicios practicos" + '\n' +
                        "2 ⇒ Ejercicios extra" + '\n' +
                        "3 ⇒ Desafíos" + '\n' +
                        "4 ⇒ Salir" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Seleccione una opción");
        return RefactorMain.sc.nextInt();
    }

    public void run() {

        int opc;

        do {
            showMenuOptions();
            opc = selectOption();
            System.out.println();
            showOptions(opc);
        } while (opc != 4);

    }

    private void showOptions(int opc) {
        switch (opc) {
            case 1 -> new MenuPracticalExercises().practicalMenu();
            case 2 -> new MenuBonusExercises().bonusMenu();
            case 3 -> new MenuChallenge().challengeMenu();
            case 4 -> System.out.println("👋🏼👋🏼 Adios! 👋🏼👋🏼");
            default -> System.out.println("❌❌ ಠ_ಠ Opción invalida ಠ_ಠ  ❌❌" + '\n');
        }
    }

}
