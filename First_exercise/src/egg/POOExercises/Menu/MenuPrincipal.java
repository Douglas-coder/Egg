package egg.POOExercises.Menu;

import egg.POOExercises.MainProgram.RefactorMain;

public class MenuPrincipal {

    private MenuPracticalExercises practical = new MenuPracticalExercises();
    private MenuBonusExercises bonus = new MenuBonusExercises();
    private MenuChallenge challenge = new MenuChallenge();

    public void run() {

        int opc;

        do {
            showMenuOptions();
            opc = selectOption();
            System.out.println();
            showOptions(opc);
        } while (opc != 4);

    }

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

    private void showOptions(int opc) {
        switch (opc) {
            case 1 -> practical.practicalMenu();
            case 2 -> bonus.bonusMenu();
            case 3 -> challenge.challengeMenu();
            case 4 -> System.out.println("👋🏼👋🏼Adios!👋🏼👋🏼");
            default -> System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}
