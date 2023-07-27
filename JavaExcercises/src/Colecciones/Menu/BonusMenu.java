package Colecciones.Menu;

import Colecciones.Main;

public class BonusMenu {

    private static void showOptions() {
        System.out.println(
                "🎁🎁🎁 Bonus Menu 🎁🎁🎁" + '\n' +
                        "🟡1 ⇒ Opc 1" + " | 🟡2 ⇒ Opc 2" + '\n' +
                        "🟡3 ⇒ Opc 3" + " | 🟡4 ⇒ Opc 4" + '\n' +
                        "🔙5 ⇒ Menu principal" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuBonus() {

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
            case 1:
                System.out.println("Opc 1" + '\n');
                break;
            case 2:
                System.out.println("Opc 2" + '\n');
                break;
            case 3:
                System.out.println("Opc 3" + '\n');
                break;
            case 4:
                System.out.println("Opc 4" + '\n');
                break;
            case 5:
                break;
            default:
                System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
