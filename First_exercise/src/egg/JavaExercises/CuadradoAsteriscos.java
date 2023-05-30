package egg.JavaExercises;

import java.util.Scanner;

public class CuadradoAsteriscos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        int i;
        int j;

        System.out.println("Por favor ingrese el tamaño del cuadrado");
        num = sc.nextInt();

        for (i = 1; i <= num; i++) {
            for (j = 1; j <= num; j++) {
                if (i == 1 || i == num) {
                    System.out.print("[*]");
                } else if (j == 1 || j == num) {
                    System.out.print("[*]");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println("");

        }

    }

}
