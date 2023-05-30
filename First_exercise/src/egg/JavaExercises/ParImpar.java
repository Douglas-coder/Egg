package egg.JavaExercises;

import java.util.Scanner;

/*Crear un programa que dado un numero determine si es par o impar.*/

public class ParImpar {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Por favor ingrese un numero");
        num = leer.nextInt();

        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par");
        } else {
            System.out.println("El numero " + num + " es impar");
        }

    }

}
