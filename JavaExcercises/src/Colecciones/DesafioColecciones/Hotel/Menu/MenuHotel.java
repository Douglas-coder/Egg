package Colecciones.DesafioColecciones.Hotel.Menu;

import Colecciones.Main;

public class MenuHotel {

    private static void showOptions() {
        System.out.println(
                "🏨🛎🛌🏼 HOTEL 🛌🏼🛎🏨" + '\n' +
                        "1 ⇒ Reservar               " + " | 2 ⇒ Mostrar reserva" + '\n' +
                        "3 ⇒ Actualizar reserva " + " | 4 ⇒ Eliminar reserva" + '\n' +
                        "5 ⇒ Menu challenge" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void hotelMenu() {

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
            case 1 -> {}
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            default -> System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
