package egg.JavaExample;

import java.util.Scanner;

public class Error {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();

        System.out.println("Ingresa tu nombre");
        String nombre = leer.next();

        System.out.println("Hola mi nombre es: " + nombre + " y tengo: " + edad);

    }
}
