package Relaciones.PracticalExercices.BarajaCartas;

import Relaciones.Main;

import java.util.List;

public class MenuBaraja {

    Baraja baraja = new Baraja(12);
    List<Carta> mano;

    private static void showOptions() {
        System.out.println(
                "📋📋📋 BARAJA DE CARTAS 📋📋📋" + '\n' +
                        "1 ⇒ Barajar cartas" + " | 2 ⇒ Dar Carta" + '\n' +
                        "3 ⇒ Cartas en pozo" + " | 4 ⇒ Mostrar baraja" + '\n' +
                        "5 ⇒ Practical menu"
        );
    }

    private static int selectOption() {
        System.out.println("Por favor selecciones una opción 👆🏼");
        return Main.sc.nextInt();
    }

    public void runBaraja() {
        int opc;
        do {
            showOptions();
            opc = selectOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 5);
    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1 -> baraja.barajar();
            case 2 -> {
                mano = baraja.darCartas(5);
                System.out.println("Cartas en la mano");
                for (Carta carta : mano) {
                    System.out.println(carta);
                }
            }
            case 3 -> baraja.cartasMonton();
            case 4 -> baraja.mostrarBaraja();
            case 5 -> {
            }
            default -> System.out.printf("❌❌❌❌ Wrong option ❌❌❌❌");
        }
    }

}
