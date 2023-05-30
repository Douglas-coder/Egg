package egg.JavaExercises;

import java.util.Scanner;

/*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.*/

public class Eureka {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String phrase;

        System.out.println("Por favor ingrese una palabra");
        phrase = leer.nextLine();

        if (phrase.equalsIgnoreCase("eureka")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }

    }

}
