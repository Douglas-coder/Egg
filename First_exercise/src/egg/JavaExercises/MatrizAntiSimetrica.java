package egg.JavaExercises;

/*Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).*/

public class MatrizAntiSimetrica {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
        int[][] matriz = {{0, -1, 4}, {2, 0, 2}, {-4, -2, 0}};
        boolean anti = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }

        System.out.println("");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println("");
        }

        for (int j = 0; j < matriz.length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                anti = matriz[i][j] == -matriz[j][i];
            }
        }

        System.out.println("La matriz es antisimetrica? " + anti);

    }

}
