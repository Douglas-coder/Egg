package egg.JavaExercises;

import java.util.Random;
import java.util.Scanner;

/*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).*/

public class ContadorNumVector {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vector = new int[1000];
        Random random = new Random();
        int cont = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;

        for (int i = 0; i < 1000; i++) {
            vector[i] = random.nextInt(100000) + 1;
        }

        for (int i = 0; i < 1000; i++) {
            System.out.print("[" + vector[i] + "]");
        }

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 9) {
                cont = cont + 1;
            } else if (vector[i] > 9 && vector[i] < 99) {
                cont2 = cont2 + 1;
            } else if (vector[i] > 99 && vector[i] < 999) {
                cont3 = cont3 + 1;
            } else if (vector[i] > 999 && vector[i] < 9999) {
                cont4 = cont4 + 1;
            } else if (vector[i] > 9999) {
                cont5 = cont5 + 1;
            }
        }

        System.out.println("\n");

        System.out.println("La cantidad de numeros con 1 solo digito son: " + cont);
        System.out.println("La cantidad de numeros con 2 solo digito son: " + cont2);
        System.out.println("La cantidad de numeros con 3 solo digito son: " + cont3);
        System.out.println("La cantidad de numeros con 4 solo digito son: " + cont4);
        System.out.println("La cantidad de numeros con 5 solo digito son: " + cont5);

    }

}
