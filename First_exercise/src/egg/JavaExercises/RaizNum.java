package egg.JavaExercises;

import java.util.Scanner;

/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().*/

public class RaizNum {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num;

        System.out.println("Por favor ingrese un numero");
        num = leer.nextInt();

        System.out.println("El numero: " + num + "² = " + Math.pow(num, 2));
        System.out.println("El numero: " + num + "³ = " + Math.pow(num, 3));
        System.out.println("La √" + num + " = " + Math.sqrt(num));

    }

}
