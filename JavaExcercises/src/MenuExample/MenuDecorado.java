package MenuExample;

import java.util.Scanner;

/*
*
* ❗❗❗❗❗❗❗❗❗ IMPORTANTE ❗❗❗❗❗❗❗❗❗
*
* Para generar los emojis que estan en este menu
* solo es que preciones las teclas
*
*       win + .
*
* en tu teclado para poder desplegar una ventana emergente
* con emojis, caras y simbolos del sistema.
*
* Se puede hacer uso de esta funcion en windows en cualquier
* editor de texto.
*
* */

public class MenuDecorado {

    //Se crea un escaner [public static] para poder usar en otras clases
    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    /*
     *
     * Ejemplo:
     *
     * Cuando se este en otra clase en lugar de crear un nuevo escaner para
     * poder pasar valores por teclado se instancia de la siguiente manera
     *
     * TipoVariable nombreVariable = instanciamosMenu + nombreScanner + funcionScanner;
     *
     * String nombre = Menu.sc.next();
     *
     * */

    //Metodo utilizado para correr el menu.
    public void run(){

        int opc;

        //Ciclo do/while para ejecutar el menu hasta cumplir la condición del while
        do {

            showOptions();
            opc = selecOption();
            System.out.println();
            runOptions(opc);

            //Valor que cambia (4) segun la opcion salir del menu.
        }while (opc != 4);

    }

    //Metodo para mostrar todas las opciones del menu
    private static void showOptions(){

        /*
         *
         * Se usa un solo System.out.println con esa estructura para poder
         * concatenar varios datos en uno solo; se utilizan {'\n'}
         * para generar el salto de linea.
         *
         * */

        System.out.println(
                "📋📋📋 Titulo del menu mostrado 📋📋📋" + '\n' +
                        "🟢1 ⇒ Opción #1 " + " | 🟡2 ⇒ Opción #2" + '\n' +
                        "🟠3 ⇒ Opción #3 " + " | 4 ⇒ Salir" + '\n'
        );

    }

    //Metodo para seleccionar la opcion del menu
    private static int selecOption(){

        System.out.println("Por favor seleccione una opción 👆🏼");
        return sc.nextInt();

    }

    //Metodo para ejecutar la opcion seleccionada.
    private void runOptions(int opc){

        switch (opc){

            /*
             *
             * Otra forma de ejecutar los casos en versiones mas actualizadas
             * de java seria:
             *
             * case 0 -> System.out.println("Opción extra");
             *
             * para sacar la flecha es con: [-] y [>]
             *
             * de esta manera no es necesario colocar el break despues de
             * cada caso.
             *
             * */

            case 1:
                System.out.println("Opción #1 seleccionada" + '\n');
                break;
            case 2:
                System.out.println("Opción #2 seleccionada");
                System.out.println();
                break;
            case 3:
                System.out.println("Opción #3 seleccionada");
                System.out.println();
                break;
            case 4:
                System.out.println("👋🏼👋🏼👋🏼 Adios! 👋🏼👋🏼👋🏼");
                break;
            default:
                System.out.println("❌❌❌ Opción invalida ❌❌❌" + '\n');
        }

    }

}
