package Colecciones.BonusExercises.Libreria.Menu;

import Colecciones.BonusExercises.Libreria.Libreria;
import Colecciones.Main;

public class MenuLibreria {

    Libreria libreria = new Libreria();

    private static void showOptions() {
        System.out.println(
                "📔📕📗📚 Libreria 📚📗📕📔" + '\n' +
                        "1 ⇒ Ingresar Libro " + " | 2 ⇒ Mostrar libros" + '\n' +
                        "3 ⇒ Prestar Libro   " + " | 4 ⇒ Devolver libro" + '\n' +
                        "5 ⇒ Bonus menu " + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuLibreria() {

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
                libreria.fabricaLibros();
                break;
            case 2:
                libreria.mostrarLibros();
                break;
            case 3:
                libreria.prestamo();
                break;
            case 4:
                libreria.devolucion();
                break;
            case 5:
                break;
            default:
                System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
