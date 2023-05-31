package egg.JavaExercises;

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).*/
public class MatrizTranspuestaAleatoria {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] matrizTranspuesta = new int[4][4];
        // Rellenar matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        // Imprimir matriz original
        imprimirMatriz(matriz);
        // Trasponer matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizTranspuesta[j][i] = matriz[i][j];
            }
        }
        // Imprimir matriz transpuesta
        imprimirMatriz(matrizTranspuesta);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}