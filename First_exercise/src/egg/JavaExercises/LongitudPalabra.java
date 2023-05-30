package egg.JavaExercises;

import java.util.Scanner;

/*Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Lenght() en Java.*/

public class LongitudPalabra {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String phrase;

        System.out.println("Por favor ingrese una palabra de 8 caracteres");
        phrase = leer.nextLine();

        if (phrase.length() != 8) {
            System.out.println("Incorrecto");
        } else {
            System.out.println("Correcto");
        }

    }

}
