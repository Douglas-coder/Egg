package egg.JavaExcersices;

import java.util.Random;
import java.util.Scanner;

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).*/

public class MatrizTranspuesta {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int[][] matrizTrans = new int[4][4];
        Random random = new Random();

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matriz[i][j] = random.nextInt(10);
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i =0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                matrizTrans[j][i] = matriz[i][j];
            }
        }

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }

    }

}
