package Colecciones.Menu;

import Colecciones.Main;
import Colecciones.PracticalExercices.Cine.PeliculaServices;

public class CineMenu {

    PeliculaServices peliculaServices = new PeliculaServices();

    private static void showOptions() {
        System.out.println(
                "🎥🎬📼 Cine 📼🎬🎥" + '\n' +
                        "1 ⇒ Ingresar pelicula               " + " | 2 ⇒ Mostrar peliculas" + '\n' +
                        "3 ⇒ Organizar (+1 hora de duración) " + " | 4 ⇒ Organizar (mayor a menor)" + '\n' +
                        "5 ⇒ Organizar (menor a mayor)       " + " | 6 ⇒ Organizar (titulo)" + '\n' +
                        "7 ⇒ Organizar (director)            " + " | 8 ⇒ Menu principal" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuCine() {

        int opc;

        do {
            showOptions();
            opc = selecOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 8);

    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1:
                peliculaServices.fabricarPeliculas();
                break;
            case 2:
                peliculaServices.mostrarPeliculas();
                break;
            case 3:
                peliculaServices.mostrar1HoraEnAdelante();
                break;
            case 4:
                peliculaServices.mostrarMayorAMenor();
                break;
            case 5:
                peliculaServices.mostrarMenorAMayor();
                break;
            case 6:
                peliculaServices.mostrarPorTitulo();
                break;
            case 7:
                peliculaServices.mostrarPorDirector();
                break;
            case 8:
                break;
            default:
                System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
