package Colecciones.Menu;

import Colecciones.BonusExercises.ArrayNumeros.ArrayNumeros;
import Colecciones.BonusExercises.CantanteFamoso.Menu.MenuFamosos;
import Colecciones.BonusExercises.CodigosPostales.Menu.MenuCodigoPostal;
import Colecciones.BonusExercises.Libreria.Menu.MenuLibreria;
import Colecciones.Main;

public class BonusMenu {

    private static void showOptions() {
        System.out.println(
                "🎁🎁🎁 Bonus Menu 🎁🎁🎁" + '\n' +
                        "🟡1 ⇒ Array numeros " + " | 🟡2 ⇒ Famosos" + '\n' +
                        "🟡3 ⇒ Libreria      " + " | 🟡4 ⇒ Codigos postales" + '\n' +
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
                System.out.println("🧾🧾🧾 Array de numeros 🧾🧾🧾");
                new ArrayNumeros();
                break;
            case 2:
                new MenuFamosos().menuFamosos();
                break;
            case 3:
                new MenuLibreria().menuLibreria();
                break;
            case 4:
                new MenuCodigoPostal().menuCodigoPostal();
                break;
            case 5:
                break;
            default:
                System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
