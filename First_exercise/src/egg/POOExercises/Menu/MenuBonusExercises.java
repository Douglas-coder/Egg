package egg.POOExercises.Menu;

import egg.POOExercises.BonusExercises.Cancion;
import egg.POOExercises.BonusExercises.Puntos;
import egg.POOExercises.BonusExercises.Raices;
import egg.POOExercises.BonusExercises.Servicios.AhorcadoService;
import egg.POOExercises.BonusExercises.Servicios.MesesService;
import egg.POOExercises.BonusExercises.Servicios.NIFService;

import java.util.Scanner;

public class MenuBonusExercises {

    private static Scanner sc = new Scanner(System.in);

    private static void showBonusOptions() {
        System.out.println(
                "1 ⇒ Cancion     " + " | 2 ⇒ Puntos" + '\n' +
                        "3 ⇒ Raices      " + " | 4 ⇒ NIF" + '\n' +
                        "5 ⇒ Mes secreto " + " | 6 ⇒ Ahorcado" + '\n' +
                        "7 ⇒ Volver al menu principal" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Seleccione una opción");
        return sc.nextInt();
    }

    public void bonusMenu() {

        int opc;

        do {
            showBonusOptions();
            opc = selectOption();
            System.out.println();
            options(opc);
        } while (opc != 7);
    }

    private void options(int opc) {
        switch (opc) {
            case 1://Cancion
                Cancion cancion = new Cancion();
                System.out.println(cancion.toString());
                break;
            case 2://Puntos
                Puntos puntos = new Puntos();
                break;
            case 3://Raices
                Raices raices = new Raices();
                break;
            case 4://NIF
                NIFService nifService = new NIFService();
                break;
            case 5://Mes secreto
                MesesService mesesService = new MesesService();
                break;
            case 6://Ahorcado
                AhorcadoService ahorcadoService = new AhorcadoService();
                break;
            case 7:
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}
