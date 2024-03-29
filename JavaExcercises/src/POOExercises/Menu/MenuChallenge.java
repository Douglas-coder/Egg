package POOExercises.Menu;

import POOExercises.MainProgram.RefactorMain;
import POOExercises.Retos.Figuras.FigurasGeometricas;
import POOExercises.Retos.Peliculas.CrearPeliculas;
import POOExercises.Retos.Vehiculos.Servicios.VehiculoService;

public class MenuChallenge {

    private static void showChallengeOptions() {
        System.out.println(
                "1 ⇒ Vehiculos " + " | 2 ⇒ Figuras geometricas" + '\n' +
                        "3 ⇒ Peliculas " + " | 4 ⇒ GYM" + '\n' +
                        "5 ⇒ Volver al menu principal" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Seleccione una opción");
        return RefactorMain.sc.nextInt();
    }

    public void challengeMenu() {

        int opc;

        do {
            showChallengeOptions();
            opc = selectOption();
            System.out.println();
            showOptions(opc);
        } while (opc != 5);

    }

    private void showOptions(int opc) {
        switch (opc) {
            case 1:// Vehiculos
                System.out.println("🚗🛵🚲 Vehiculos 🚲🛵🚗" + '\n');
                VehiculoService vehiculoService = new VehiculoService();
                break;
            case 2://Figuras geometricas
                System.out.println("🟡🟨🔶🔺 Figuras geometricas 🔺🔶🟨🟡");
                FigurasGeometricas.FigurasGeometricas();
                break;
            case 3://Peliculas
                System.out.println("🎥🎬📼 Peliculas 📼🎬🎥");
                CrearPeliculas.mostrarMenu();
                break;
            case 4:
                System.out.println("💪🏼💪🏼💪🏼 GYM 💪🏼💪🏼💪🏼");
                break;
            case 5:
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}
