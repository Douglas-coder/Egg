package egg.ExtraExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().*/

public class SopaDeLetras {

    public static void main(String[] args) {

        List<String> palabrasArrayList = new ArrayList<>();
        //String[] palabras = new String[5];
        String[] palabras = {"hola","carro","casa","doug","pera"};

        //crearArray(palabras);
        crearSopaLetras(palabras);
        //crearArray(palabrasArrayList);
        //crearSopaLetras(palabrasArrayList);

    }

    public static void crearArray(String[] palabras) {

        Scanner sc = new Scanner(System.in);
        String palabra = "";

        for (int x = 0; x < palabras.length; x++) {
            System.out.println("Por favor ingrese la " + (x + 1) + " palabra:");
            palabra = sc.next();
            int c = palabra.length();
            if (c < 3 || c > 5) {
                System.out.println("La palabra es incorrecta");
                x--;
            } else {
                palabras[x] = palabra;
            }
        }

        for (int x = 0; x < palabras.length; x++) {
            System.out.print("[" + palabras[x] + "]");
        }
        System.out.println("");

    }

    public static void crearSopaLetras(String[] palabras) {

        char[][] sopaLetras = new char[10][10];
        Random random = new Random();
        int row = -1;
        int col = 0;

        for (String palabra : palabras) {
            row++;
            col = 0;
            for (int x = 0; x < palabra.length(); x++) {
                char letra = palabra.charAt(x);
                boolean posicionValidaEncontrada = false;
                while (!posicionValidaEncontrada) {
                    if (sopaLetras[row][col] == 0 || sopaLetras[row][col] == letra){
                        sopaLetras[row][col] = letra;
                        posicionValidaEncontrada = true;
                    }
                }
                col++;
            }
        }

        for (int x = 0; x < sopaLetras.length; x++) {
            for (int z = 0; z < sopaLetras[x].length; z++) {
                if (sopaLetras[x][z] == 0) {
                    int letras = (int) (Math.random() * 26) + 97;
                    sopaLetras[x][z] = (char) letras;
                }
            }
        }

        for (int x = 0; x < sopaLetras.length; x++) {
            for (int z = 0; z < sopaLetras[x].length; z++) {
                System.out.print(sopaLetras[x][z] + " ");
            }
            System.out.println();
        }
    }

    /*public static void crearArray(List<String> palabrasArrayList){

        Scanner sc = new Scanner(System.in);
        String palabra = "";

        for (int x = 0; x < palabrasArrayList.size(); x++){
            System.out.println("Por favor ingrese la "+ (x+1) + " palabra:");
            palabra = sc.next();
            int c =  palabra.length();
            if (c < 3 || c > 5){
                System.out.println("La palabra es incorrecta");
                x--;
            }else {
                palabrasArrayList.add(palabra);
            }
        }

        System.out.println(palabrasArrayList);

    }*/

    /*public static void crearSopaLetras(List<String> palabrasArrayList){

        String[][] sopaLetras = new String[20][20];

        for (int x = 0; x < palabrasArrayList.size(); x++){
            for (int z = 0; z < palabrasArrayList.size(); z++){
               // sopaLetras[x][z] = palabrasArrayList;
            }
        }

    }

}*/

}
