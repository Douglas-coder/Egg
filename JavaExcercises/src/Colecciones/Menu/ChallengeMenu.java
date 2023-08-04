package Colecciones.Menu;

import Colecciones.DesafioColecciones.Hotel.Menu.MenuHotel;
import Colecciones.Main;
import Colecciones.DesafioColecciones.TiendaReto.Menu.MenuTiendaReto;

public class ChallengeMenu {

    private static void showOptions() {
        System.out.println(
                "😎😎😎 Challenge Menu 😎😎😎" + '\n' +
                        "1 ⇒ Tienda" + '\n' +
                        "2 ⇒ Hotel" + '\n' +
                        "3 ⇒ Menu principal" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuChallenge() {

        int opc;

        do {
            showOptions();
            opc = selecOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 3);

    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1 -> new MenuTiendaReto().menuTiendaReto();
            case 2 -> new MenuHotel().hotelMenu();
            case 3 -> {
            }
            default -> System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
