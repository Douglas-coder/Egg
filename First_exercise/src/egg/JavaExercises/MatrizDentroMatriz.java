package egg.JavaExercises;

import java.util.Random;
import java.util.Scanner;

/*Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.*/

public class MatrizDentroMatriz {

    public static void main(String[] args) {

        //Se crean las Matrices que se van a necesitar para la Api
        int[][] M = new int[10][10];
        int[][] P = {{23, 24, 25},
                {33, 34, 35},
                {43, 44, 45}};
        //int[][] P = new int[3][3]; x = i && z = j
        int x = 0;
        int z = 0;

        //Se crea funcion para llenar las matrices
        llenarMatriz(M, x, z);
        //Se crea funcion para mostrar las matrices
        mostrarMatriz(M, P, x, z);
        //Se crea funcion para comprobrar si la matriz 'P' esta dentro de la matriz 'M'
        comprobrarMatriz(M, P, x, z);

    }

    //********** Se genera una subFunción para generar aleatoriamente los datos **********
    public static void llenarMatriz(int[][] matriz, int x, int z) {

        //*Se crea un scanner para ingresar numeros manualmente a la matriz
        //Scanner sc = new Scanner(System.in);
        //*Se importa el metodo Random para generar numeros aleatorios
        //Random random = new Random();
        //Math.random() = 0.0 - 1.0 || Math.random()*10 = 1 - 10
        int num = 1;
        //int num2 = random.nextInt(100);

        //Llenar matriz de 10X10
        for (x = 0; x < matriz.length; x++) {
            for (z = 0; z < matriz.length; z++) {
                //*Se implementa una variable num que va aumentando su valor cada que se ejecuta el for
                matriz[x][z] = num++;
                //*Se implementa el metodo Random y se le indica que genere numeros de hasta 2 digitos
                //matriz[x][z] = random.nextInt(10);
                //*Ingresar numeros manualmente
                /*System.out.println("Ingrese los numeros de [" + x + "," + z + "]");
                matriz[x][z] = sc.nextInt();*/
            }
        }

        /*//Llenar matriz de 3X3
        for (x = 0; x < matriz2.length; x++){
            for (z = 0; z < matriz2.length; z++) {
                matriz2[x][z] = num2++;
            }
        }*/

    }

    //********** Se genera subFuncion para mostrar las matrices **********
    public static void mostrarMatriz(int[][] matriz, int[][] matriz2, int x, int z) {

        //Mostrar matriz 10X10
        for (x = 0; x < matriz.length; x++) {
            for (z = 0; z < matriz.length; z++) {
                //Se genera una impresion con 'printf' para poder imprimir los datos con la cantidad de decimales requeridos.
                //En este caso '[%nd]' se le indican 'n' decimales
                //Y se le coloca dentro de corchetes para que imprima con los corchetes incluidos
                System.out.printf("[%3d]", matriz[x][z]);
            }
            System.out.println("");
        }

        System.out.println("");

        //Mostrar matriz 3X3
        for (x = 0; x < matriz2.length; x++) {
            for (z = 0; z < matriz2.length; z++) {
                System.out.printf("[%3d]", matriz2[x][z]);
            }
            System.out.println("");
        }

    }

    //********** Se genera subFuncion para comprobar si la matriz 'P' se encuentra dentro de la matriz 'M' **********
    public static void comprobrarMatriz(int[][] matriz, int[][] matriz2, int x, int z) {

        //Se generan las variables necesarias para comprobar las matrices 'P' & 'M'
        boolean found = false;
        int row = -1;
        int col = -1;

        //Se recorren las filas de matriz(M)
        for (x = 0; x < matriz.length - matriz2.length; x++) {
            //Se recorren las columnas de matriz(M)
            for (z = 0; z < matriz[0].length - matriz2[0].length; z++) {
                if (matriz[x][z] == matriz2[0][0] && contenidoIgual(matriz, matriz2, x, z)) {
                    found = true;
                    row = x;
                    col = z;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        System.out.println("");

        if (found) {
            System.out.println("La matriz 'P' eta en [" + row + "," + col + "]");
        } else {
            System.out.println("La matriz 'P' no esta dentro de la matriz 'M'");
        }
    }

    //Se crea subFuncion para comprobrar que la matriz 3X3 si coincidan con los datos de la matriz 10X10
    public static boolean contenidoIgual(int[][] matriz, int[][] matriz2, int row, int col) {

        for (int x = 0; x < matriz2.length; x++) {
            for (int z = 0; z < matriz2[0].length; z++) {
                if (matriz[row + x][col + z] != matriz2[x][z]) {
                    return false;
                }
            }
        }

        return true;

    }

}
