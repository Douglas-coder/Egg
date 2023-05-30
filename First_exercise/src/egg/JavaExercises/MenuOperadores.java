package egg.JavaExercises;

import java.util.Scanner;

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.*/

public class MenuOperadores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double num1;
        double num2;
        String seguir = "n";

        System.out.println("Por favor ingrese el primer numero");
        num1 = sc.nextDouble();
        System.out.println("Por favor ingrese el segundo numero");
        num2 = sc.nextDouble();

        while (seguir.equalsIgnoreCase("n")) {

            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int opci = sc.nextInt();

            if (opci >= 1 && opci <= 5) {

                switch (opci) {
                    case 1:
                        System.out.println("Opción Sumar");
                        double suma = num1 + num2;
                        System.out.println("El resultado de [" + num1 + "] + [" + num2 + "] = " + suma);
                        System.out.println("");
                        continue;
                    case 2:
                        System.out.println("Opción Restar");
                        double resta = num1 - num2;
                        System.out.println("El resultado de [" + num1 + "] - [" + num2 + "] = " + resta);
                        System.out.println("");
                        continue;
                    case 3:
                        System.out.println("Opción Multiplicar");
                        double multi = num1 * num2;
                        System.out.println("El resultado de [" + num1 + "] * [" + num2 + "] = " + multi);
                        System.out.println("");
                        continue;
                    case 4:
                        System.out.println("Opción División");
                        double div = num1 / num2;
                        System.out.println("El resultado de [" + num1 + "] / [" + num2 + "] = " + div);
                        System.out.println("");
                        continue;
                }

                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                seguir = sc.next();
                break;

            } else {
                System.out.println("Por favor ingrese una opcion valida");
                System.out.println("");
            }
        }

    }

}
