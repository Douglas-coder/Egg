package egg.JavaExercises;

import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
límite inicial.*/

public class BuclePositivo {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int max;
        int num;
        int suma = 0;
        int aux = 0;

        System.out.println("Por favor ingrese el valor maximo");
        max = leer.nextInt();

        for (int i = 0; i < max; i++) {
            System.out.println("Por favor ingrese un numero para sumar");
            num = leer.nextInt();

            suma = num + aux;
            aux = suma;
            if (aux > max) {
                System.out.println("Numero maximo: " + max);
                System.out.println("Resultado suma: " + suma);
                System.out.println("La suma de los numeros ingresados supero el numero maximo");
                break;
            }
        }

    }

}
