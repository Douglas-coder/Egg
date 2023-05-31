package egg.JavaExercises;

import java.util.Scanner;

public class MagicSquare {
    // Constantes que definen el tamaño mínimo y máximo del cuadrado mágico
    private static final int MIN_FILAS = 1;
    private static final int MAX_FILAS = 19;

    public static void main(String[] args) {
        // Crear el array
        int[][] M = crearArray();
        // Generar cuadrado mágico
        cuadradoMagico(M);
        // Mostrar el array
        mostrarMatriz(M);
    }

    public static int[][] crearArray() {
        Scanner sc = new Scanner(System.in);
        int filas = -1;
        // Pedir al usuario que ingrese el número de filas
        while (filas % 2 == 0 || filas < MIN_FILAS || filas > MAX_FILAS) {
            try {
                System.out.print("Número de filas (impar, de 1 a 19): ");
                filas = sc.nextInt();
            } catch (Exception e) {
                sc.next();
            }
        }
        // Crear la matriz cuadrada
        int[][] A = new int[filas][filas];
        sc.close();
        return A;
    }

    public static void cuadradoMagico(int[][] matriz) {
        int N = matriz.length;
        int i = 0, j = N / 2, cont = 1;
        boolean multiplo = false;
        // Asignar el primer número en la posición central superior
        matriz[i][j] = cont;
        // Calcular los números restantes del cuadrado mágico
        for (cont = 2; cont <= N * N; cont++) {
            int oldI = i;
            int oldJ = j;
            // Calcular la siguiente posición de la matriz
            if (!multiplo) {        //si el anterior número no es múltiplo de N
                i--;
                if (i < 0) {
                    i = N - 1;
                }
                j++;
                if (j >= N) {
                    j = 0;
                }
            } else {                //si el anterior número es múltiplo de N
                i++;
                if (i >= N) {
                    i = 0;
                }
            }
            // Asignar el número en la matriz
            matriz[i][j] = cont;
            // Chequear si el número es múltiplo de N
            if (cont % N == 0) {
                multiplo = true;
            } else {
                multiplo = false;
            }
        }
    }

    // Método para mostrar el cuadrado mágico por pantalla
    public static void mostrarMatriz(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.printf("[%1d]", A[i][j]);
            }
            System.out.println();
        }
    }
}
