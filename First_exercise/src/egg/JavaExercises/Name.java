package egg.JavaExercises;

import java.util.Scanner;

/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.*/

public class Name {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String name;

        System.out.println("Por favor ingrese su nombre");
        name = leer.nextLine();

        System.out.println("Su nombre es: " + name);

    }

}
