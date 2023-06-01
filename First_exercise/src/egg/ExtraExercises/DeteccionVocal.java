package egg.ExtraExercises;

import java.util.Scanner;

/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.*/

public class DeteccionVocal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String vocal;

        System.out.println("Por favor ingrese una letra");
        vocal = sc.next();

        while (vocal.length() != 1) {
            System.out.println("Por favor ingrese solo una letra");
            vocal = sc.next();
        }
        while (vocal.length() == 1) {
            if (vocal.equalsIgnoreCase("a") || vocal.equalsIgnoreCase("e") || vocal.equalsIgnoreCase("i") || vocal.equalsIgnoreCase("o") || vocal.equalsIgnoreCase("u")) {
                System.out.println("La letra ingresada es la vocal: " + vocal);
                break;
            } else {
                System.out.println("La leta ingresada no es una vocal");
                vocal = sc.next();
            }
        }
        sc.close();
    }
}