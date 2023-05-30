package egg.JavaExercises;

import java.util.Scanner;

/*Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.*/

public class SubstringA {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String phrase;

        System.out.println("Por favor ingresa una palabra que comience por A");
        phrase = leer.nextLine();

        try {
            if (phrase.charAt(0) == 'a' || phrase.charAt(0) == 'A' || phrase.charAt(0) == 'á' || phrase.charAt(0) == 'Á') {
                System.out.println("Correcto");
            } else {
                System.out.println("Incorrecrto");
            }

            if (phrase.substring(0, 1).equalsIgnoreCase("a") || phrase.substring(0, 1).equalsIgnoreCase("á")) {
                System.out.println("Correcto 2");
            } else {
                System.out.println("Incorrecto 2");
            }
        } catch (StringIndexOutOfBoundsException ex) {
            System.out.println("No se ingreso ningun valor");
        }

    }

}
