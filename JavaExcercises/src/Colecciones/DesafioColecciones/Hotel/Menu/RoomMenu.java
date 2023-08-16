package Colecciones.DesafioColecciones.Hotel.Menu;

import Colecciones.DesafioColecciones.Hotel.Entities.Room;
import Colecciones.Main;

public class RoomMenu {

    private static void showOptions() {
        System.out.println(
                "🏨🛎🛌🏼 Habitacion 🛌🏼🛎🏨" + '\n' +
                        "1 ⇒ Habitación 1 (2 personas) " + "2 ⇒ | Habitación 2 (2 personas)" + '\n' +
                        "3 ⇒ Habitación 3 (2 personas) " + "4 ⇒ | Habitación 4 (2 personas)" + '\n' +
                        "5 ⇒ Habitación 5 (2 personas) " + "6 ⇒ | Habitación 6 (3 personas)" + '\n' +
                        "7 ⇒ Habitación 7 (3 personas) " + "8 ⇒ | Habitación 8 (3 personas)" + '\n' +
                        "9 ⇒ Habitación 9 (1 personas) " + "10 ⇒ | Habitación 10 (1 personas)" + '\n' +
                        "11 ⇒ Menu Hotel " + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuRoom() {

        int opc;

        showOptions();
        opc = selecOption();
        System.out.println();
        runOptions(opc);
    }

    private void runOptions(int opc) {
        Room habitacion = new Room();
        switch (opc) {
            case 1, 2, 3, 4, 5 -> {
                habitacion.setCantPersonas(2);
                habitacion.setNumHabitacion(opc);
            }
            case 6, 7, 8 -> {
                habitacion.setCantPersonas(3);
                habitacion.setNumHabitacion(opc);
            }
            case 9, 10 -> {
                habitacion.setCantPersonas(1);
                habitacion.setNumHabitacion(opc);
            }
            case 11 -> {
            }
            default -> System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }
}
