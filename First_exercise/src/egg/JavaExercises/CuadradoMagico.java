package egg.JavaExercises;

import java.util.Scanner;

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.*/

public class CuadradoMagico {

    public static void main(String[] args) {

        /*System.out.println("Por favor ingrese la dimension de la matriz");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];*/
//        int[][] matriz = {{2,7,6},{9,5,1},{4,3,8}};
        int[][] matriz = new int[3][3];
        int x = 0;
        int z = 0;

        System.out.println("Por favor ingrese los numeros del 1 al 9");

        showMatriz(matriz, x, z);

    }

    public static int[][] showMatriz(int[][] matriz, int x, int z) {

        Scanner sc = new Scanner(System.in);
        int[][] print;
        int num;

        for (x = 0; x < matriz.length; x++) {
            for (z = 0; z < matriz.length; z++) {
                System.out.print("Ingrese los valores de la matriz [" + x + "," + z + "]: ");
//                num[x][z] = sc.nextInt();
            }
        }

        for (x = 0; x < matriz.length; x++) {
            for (z = 0; z < matriz.length; z++) {
                System.out.print("[" + matriz[x][z] + "]");
            }
            System.out.println("");
        }

        print = matriz;

        return print;
    }

    public static int suma(int a) {

        //Logica que queremos que se ejecute
        int resultado = a;

        return resultado;
    }

}
