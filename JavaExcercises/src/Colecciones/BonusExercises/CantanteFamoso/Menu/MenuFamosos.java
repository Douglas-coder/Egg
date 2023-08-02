package Colecciones.BonusExercises.CantanteFamoso.Menu;

import Colecciones.BonusExercises.CantanteFamoso.CantanteFamosoServices;
import Colecciones.Main;

public class MenuFamosos {

    CantanteFamosoServices famosoServices = new CantanteFamosoServices();

    private static void showOptions() {
        System.out.println(
                "🎙🎤🎶🎼 Cantantes Famosos 🎙🎤🎶🎼" + '\n' +
                        "1 ⇒ Ingresar famoso " + " | 2 ⇒ Mostrar famosos" + '\n' +
                        "3 ⇒ Eliminar famoso " + " | 4 ⇒ Menu principal" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuFamosos() {

        int opc;

        do {
            showOptions();
            opc = selecOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 4);

    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1:
                famosoServices.fabricarFamosos();
                break;
            case 2:
                famosoServices.mostrarFamosos();
                break;
            case 3:
                famosoServices.eliminarFamoso();
                break;
            case 4:
                break;
            default:
                System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
