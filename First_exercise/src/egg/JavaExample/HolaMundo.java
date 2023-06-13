package egg.JavaExample;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String nombre;
        int edad;
        int num1;
        int num2;

        System.out.println("Ingresa tu nombre:");

        nombre = leer.nextLine();

        System.out.println("Ingresa tu edad:");

        edad = leer.nextInt();

        System.out.println("Hola Mundo! Soy " + nombre + " y estoy programando en Java!");
        System.out.println("Mi nombre " + nombre + " mi edad " + edad);

        System.out.println("");
        System.out.println("Por favor ingrese dos numeros");

        num1 = leer.nextInt();
        num2 = leer.nextInt();

        if (num1 > 25 || num2 > 25) {
            System.out.println("Uno de los numeros es mayor a 25");
        } else {
            System.out.println("Ninguno de los numeros es mayor a 25");
        }

        int suma = num1 + num2;

        double division = num2 / num1;

        boolean bandera = num2 < num1;

        num1++;

        System.out.println("Este es el resultado de la suma: " + suma);
        System.out.println("Este es el resultado de la division: " + division);
        System.out.println("Este es el resultado de la bandera: " + bandera);

    }

}