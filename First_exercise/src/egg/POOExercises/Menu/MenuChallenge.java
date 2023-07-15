package egg.POOExercises.Menu;

import egg.POOExercises.Retos.servicios.VehiculoService;

import java.util.Scanner;

public class MenuChallenge {

    private static Scanner sc = new Scanner(System.in);

    private static void showChallengeOptions() {
        System.out.println(
                "1 ⇒ Vehiculos " + " | 2 ⇒ Figuras geometricas" + '\n' +
                        "3 ⇒ Peliculas " + " | 4 ⇒ GYM" + '\n' +
                        "5 ⇒ Volver al menu principal" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Seleccione una opción");
        return sc.nextInt();
    }

    public void challengeMenu() {

        int opc;

        do {
            showChallengeOptions();
            opc = selectOption();
            System.out.println();
            options(opc);
        } while (opc != 5);

    }

    private void options(int opc) {
        switch (opc) {
            case 1:// Vehiculos
                System.out.println("🚗🛵🚲 Vehiculos 🚗🛵🚲" + '\n');
                VehiculoService vehiculoService = new VehiculoService();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}
