package egg.JavaExercises;

import java.util.Scanner;

/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido*/

public class BuscadorVector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int tamVector;
        int cont = 0;
        int num;
        int posi = 0;

        System.out.println("Por favor ingrese el tamaño del vector");
        tamVector = sc.nextInt();

        int[] vector = new int[tamVector];

        for (int i = 0; i < tamVector; i++) {
            vector[i] = (int) (Math.random() * 10 + 1);
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }

        System.out.println("");

        System.out.println("Por favor indique que numero quiere buscar");
        num = sc.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                cont = cont + 1;
                posi = i;
                System.out.println("El numero " + num + " se encuentra en la posición " + posi);
            }
        }

        System.out.print("Y se encuentra " + cont + " veces ");
    }

}
