package egg.JavaExercises;

import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma*/

public class Suma {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        int sum;

        System.out.println("Por favor ingrese el primer numero");
        num1 = leer.nextInt();
        System.out.println("Por favor ingrese el segundo numero");
        num2 = leer.nextInt();

        sum = num1 + num2;

        System.out.println("El resultado de la suma de los numeros [" + num1 + "] + [" + num2 + "] es: " + sum);

    }

}
