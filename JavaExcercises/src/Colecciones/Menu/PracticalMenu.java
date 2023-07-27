package Colecciones.Menu;

import Colecciones.Main;
import Colecciones.PracticalExercices.Alumnos.Alumno;
import Colecciones.PracticalExercices.Cine.Pelicula;
import Colecciones.PracticalExercices.Perros.Perros;

public class PracticalMenu {

    private static void showOptions() {
        System.out.println(
                "💪💪💪 Practical Menu 💪💪💪" + '\n' +
                        "🟡1 & 2 ⇒ Razas de perros " + " | 🟡3 ⇒ Nota alumnos" + '\n' +
                        "🟡4 ⇒ Cine                " + " | 🟡5 ⇒ Opc 5" + '\n' +
                        "🟡6 ⇒ Opc 6               " + " 🔙7 ⇒ Menu principal" + '\n'
        );
    }

    private static int selecOption() {
        System.out.println("Por favor seleccione una opción");
        return Main.sc.nextInt();
    }

    public void menuPractical() {

        int opc;

        do {
            showOptions();
            opc = selecOption();
            System.out.println();
            runOptions(opc);
        } while (opc != 7);

    }

    private void runOptions(int opc) {
        switch (opc) {
            case 1:
                System.out.println("🦮🐕‍🦺🐩🐕 Ejercicios 1 y 2 (Raza de perros) 🦮🐕‍🦺🐩🐕" + '\n');
                new Perros();
                break;
            case 3:
                System.out.println("👨🏼‍🎓👩🏼‍🎓👨🏼‍🎓👩🏼‍🎓 Notas alumnos 👩🏼‍🎓👨🏼‍🎓👩🏼‍🎓👨🏼‍🎓" + '\n');
                new Alumno();
                break;
            case 4:
                new CineMenu().menuCine();
                break;
            case 5:
                System.out.println("Opc 5" + '\n');
                break;
            case 6:
                System.out.println("Opc 6" + '\n');
                break;
            case 7:
                break;
            default:
                System.out.println("❌❌ Opción invalida ❌❌" + '\n');
        }
    }

}
