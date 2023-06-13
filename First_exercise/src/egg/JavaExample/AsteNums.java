package egg.JavaExample;

import java.util.Scanner;

public class AsteNums {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[4];

        for (int x = 0; x < num.length; x++) {

            System.out.println("Por favor ingrese el numero " + (x + 1) + ":");
            num[x] = sc.nextInt();

        }

        System.out.println("");

        for (int x = 0; x < num.length; x++) {

            int resul = num[x];

            if (resul >= 0 && resul <= 20) {
                System.out.print(resul + " ");
                for (int z = 0; z < resul; z++) {
                    System.out.print("*");
                }
                System.out.println("");
            }

        }

    }

}
