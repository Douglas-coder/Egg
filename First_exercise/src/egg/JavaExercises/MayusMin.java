package egg.JavaExercises;

import java.util.Scanner;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java.*/

public class MayusMin {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String phrase;

        System.out.println("Por favor ingrese una frase");
        phrase = leer.nextLine();

        System.out.println(phrase.toUpperCase());
        System.out.println(phrase.toLowerCase());

    }

}
