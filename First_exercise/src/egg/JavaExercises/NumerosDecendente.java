package egg.JavaExercises;

import java.util.Scanner;

/*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.*/

public class NumerosDecendente {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[100];

        for (int i = 0; i < 99; i++){
            num[i] = i + 1;
        }

        for (int i = num.length - 2; i >= 0; i--){
            System.out.print("[" + num[i] + "]");
        }

    }

}
