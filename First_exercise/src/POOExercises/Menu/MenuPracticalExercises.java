package POOExercises.Menu;

import POOExercises.MainProgram.RefactorMain;
import POOExercises.PracticalExercises.*;
import POOExercises.PracticalExercises.Banco.CuentaBancaria;
import POOExercises.PracticalExercises.Cafetera.MenuCafetera;
import POOExercises.PracticalExercises.Celulares.MenuCelular;
import POOExercises.PracticalExercises.Servicios.PersonaService;
import POOExercises.PracticalExercises.*;
import POOExercises.PracticalExercises.Banco.MenuBanco;

public class MenuPracticalExercises {

    private static void showPracticalOptions() {
        System.out.println(
                "👌🏼👌🏼👌🏼 Practical Exercises 👌🏼👌🏼👌🏼" + '\n' +
                        "🟢1 ⇒ Libro          " + " | 🟡8 ⇒ Cadenna" + '\n' +
                        "🟢2 ⇒ Circunferencia " + " | 🟡9 ⇒ Matematica" + '\n' +
                        "🟢3 ⇒ Operaciones    " + " | 🟡10 ⇒ Arrays" + '\n' +
                        "🟢4 ⇒ Rectangulo     " + " | 🟡11 ⇒ Date / fecha" + '\n' +
                        "🟢5 ⇒ Cuenta bancaria" + " | 🟡12 ⇒ Union ejercicios 7 y 11" + '\n' +
                        "🟢6 ⇒ Cafetera       " + " | 🟡13 ⇒ Curso" + '\n' +
                        "🟡7 ⇒ Persona        " + " | 🟡14 ⇒ Tienda celulares" + '\n' +
                        "15 ⇒ Volver al menu principal" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Seleccione una opción");
        return RefactorMain.sc.nextInt();
    }

    public void practicalMenu() {

        int opc;

        do {
            showPracticalOptions();
            opc = selectOption();
            System.out.println();
            showOptions(opc);
        } while (opc != 15);

    }

    private void showOptions(int opc) {
        switch (opc) {
            case 1://Libro
                Libro libro = new Libro();
                System.out.println(libro.toString());
                break;
            case 2://Circunferencia
                Circunferencia circulo = new Circunferencia();
                System.out.println(circulo.toString());
                break;
            case 3://Operaciones
                Operacion operacion = new Operacion();
                System.out.println(operacion.toString());
                break;
            case 4://Rectangulo
                Rectangulo rectangulo = new Rectangulo();
                System.out.println(rectangulo.toString());
                break;
            case 5://Cuenta bancaria
                CuentaBancaria cuentaBancaria = new CuentaBancaria();
                MenuBanco menuBanco = new MenuBanco();
                menuBanco.bankMenu();
                break;
            case 6://Cafetera
                MenuCafetera menuCafetera = new MenuCafetera();
                menuCafetera.coffeeMenu();
                break;
            case 7:
                PersonaService persona = new PersonaService();
                System.out.println(persona.toString());
                break;
            case 8://Cadena
                Cadena cadena = new Cadena();
                System.out.println(cadena.toString());
                break;
            case 9://Matematica
                Matematica matematicas = new Matematica();
                System.out.println(matematicas.toString());
                break;
            case 10://Arrays
                ArraysAyB arraysAyB = new ArraysAyB();
                break;
            case 11://Date / Fecha
                Calendario calendario = new Calendario();
                break;
            case 12://? Union ejercicios 7 y 11
                break;
            case 13://Curso
                Curso curso = new Curso();
                System.out.println(curso.toString());
                break;
            case 14://Tienda celulares
                MenuCelular menuCelular = new MenuCelular();
                menuCelular.celularMenu();
                break;
            case 15:
                System.out.println("______________________________");
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}
