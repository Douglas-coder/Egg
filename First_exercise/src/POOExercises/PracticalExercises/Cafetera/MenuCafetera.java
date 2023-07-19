package POOExercises.PracticalExercises.Cafetera;

import java.util.Scanner;

public class MenuCafetera extends Cafetera {

    private static Scanner sc = new Scanner(System.in);

    private static void showOptions() {
        System.out.println(
                "1 ⇒ Llenar cafetera " + " | 2 ⇒ Servir taza" + '\n' +
                        "3 ⇒ Vaciar cafetera " + " | 4 ⇒ Agregar cafe" + '\n' +
                        "5 ⇒ Menu ejercicios practicos " + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Seleccione una opción");
        return sc.nextInt();
    }

    public void coffeeMenu() {

        int opc;

        do {
            showOptions();
            opc = selectOption();
            System.out.println();
            options(opc);
        } while (opc != 5);

    }

    private void options(int opc) {
        switch (opc) {
            case 1:
                llenarCafetera();
                System.out.println("La cafetera contiene: " + getCantidadActual() + " ml de cafe");
                System.out.println();
                break;
            case 2:
                servirTaza();
                System.out.println("La cantidad de cafe actual es: " + getCantidadActual() + " ml de cafe");
                System.out.println();
                break;
            case 3:
                vaciarCafetera();
                System.out.println("La cafetera contiene: " + getCantidadActual() + " ml de cafe");
                System.out.println();
                break;
            case 4:
                agregarCafe();
                System.out.println();
                break;
            case 5:
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}
