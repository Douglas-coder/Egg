package Colecciones.BonusExercises.CodigosPostales.Menu;

import Colecciones.BonusExercises.CodigosPostales.PaisesServices;
import Colecciones.Main;

public class MenuCodigoPostal {

    PaisesServices paisesServices = new PaisesServices();

    private static void showOptions() {
        System.out.println(
                "🌎🌏🌍 Codigo postal paises 🌎🌏🌍" + '\n' +
                        "1 ⇒ Ingresar pais                   " + " | 2 ⇒ Mostrar paises" + '\n' +
                        "3 ⇒ Mostrar pais por codigo  " + " | 4 ⇒ Eliminar paises" + '\n' +
                        "5 ⇒ Bonus menu " + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuCodigoPostal() {

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
                paisesServices.fabricaPaises();
                break;
            case 2:
                paisesServices.mostrarPaises();
                break;
            case 3:
                paisesServices.mostrarPorCodigo();
                break;
            case 4:
                paisesServices.eliminarPaises();
                break;
            case 5:
                break;
            default:
                System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
