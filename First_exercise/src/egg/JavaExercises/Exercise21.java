package egg.JavaExercises;

import java.util.Scanner;

public class Exercise21 {

    public static void main(String[] args) {
        new Scanner(System.in);
        /*int t = true;
        int n = true;*/
        boolean encontrado = false;
        int[][] m = new int[][]{{1, 26, 36, 47, 5, 6, 72, 81, 95, 10},
                {11, 12, 13, 21, 41, 22, 67, 20, 10, 61},
                {56, 78, 87, 90, 9, 90, 17, 12, 87, 67},
                {41, 87, 24, 56, 97, 74, 87, 42, 64, 35},
                {32, 76, 79, 1, 36, 5, 67, 96, 12, 11},
                {99, 13, 54, 88, 89, 90, 75, 12, 41, 76},
                {67, 78, 87, 45, 14, 22, 26, 42, 56, 78},
                {98, 45, 34, 23, 32, 56, 74, 16, 19, 18},
                {24, 67, 97, 46, 87, 13, 67, 89, 93, 24},
                {21, 68, 78, 98, 90, 67, 12, 41, 65, 12}};
        int[][] mb = new int[][]{{36, 5, 67},
                {89, 90, 75},
                {14, 22, 26}};
        int filaInicio = -1;
        int columnaInicio = -1;

        for (int i = 0; i <= m.length - mb.length; ++i) {
            for (int j = 0; j <= m[0].length - mb[0].length; ++j) {
                if (m[i][j] == mb[0][0] && mIguales(m, mb, i, j)) {
                    encontrado = true;
                    filaInicio = i;
                    columnaInicio = j;
                    break;
                }
            }

            if (encontrado) {
                break;
            }
        }

        if (encontrado) {
            System.out.println("La submatriz P se encuentra en la matriz M.");
            System.out.println("Fila de inicio: " + filaInicio);
            System.out.println("Columna de inicio: " + columnaInicio);
        } else {
            System.out.println("La submatriz P no se encuentra en la matriz M.");
        }

    }

    public static boolean mIguales(int[][] m, int[][] mb, int filaInicio, int columnaInicio) {
        for (int i = 0; i < mb.length; ++i) {
            for (int j = 0; j < mb[0].length; ++j) {
                if (m[filaInicio + i][columnaInicio + j] != mb[i][j]) {
                    return false;
                }
            }
        }

        return true;
    }
}