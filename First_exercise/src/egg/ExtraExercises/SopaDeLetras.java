package egg.ExtraExercises;

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

        //Se crea un vector donde guardaremos los datos de los usuarios
        String[] palabras = new String[5];
        //Vector de pruebas con datos ingresados
        //String[] palabras = {"Hola","Carro","Mundo","Perro","Dado"};

        //Se crea una subFuncion para llenar el vector
        crearArray(palabras);
        //Se crea una subFuncion para crear la SopaDeLetras
        crearSopaLetras(palabras);

    }

    //********** subFuncion para llenar el vector con los datos necesarios **********
    public static void crearArray(String[] palabras) {

        //Se crea un Scanner para poder ingresar los datos por pantalla
        Scanner sc = new Scanner(System.in);
        String palabra = "";

        //Se crea bloque de codigo para ingresar las palabras y validar que sean entre 3 a 5 caracteres
        for (int x = 0; x < palabras.length; x++) {
            System.out.println("Por favor ingrese la " + (x + 1) + " palabra:");
            palabra = sc.next();
            //Se ingresa metodo para colocar toda la palabra en minuscula
            palabra = palabra.toLowerCase();
            //Se valida que la longitud de la palabra este entre 3 a 5 caracteres
            int c = palabra.length();
            if (c < 3 || c > 5) {
                System.out.println("La palabra es incorrecta");
                x--;
            } else {
                palabras[x] = palabra;
            }
        }

        //Bloque de codigo para imprimir las palabras ingresadas por el usuario
        for (int x = 0; x < palabras.length; x++) {
            System.out.print("[" + palabras[x] + "]");
        }
        System.out.println("");

    }

    //********** Se crea subFuncion para generar la sopaDeLetras por pantalla
    public static void crearSopaLetras(String[] palabras) {

        //Se crea la matriz
        char[][] sopaLetras = new char[20][20];
        //Se crean las variables necesarias
        int row = 0;
        int col = 0;

        //Se genera un bloque de codigo para ir recorriendo la matriz e ingresar las palabras caracter a caracter.
        for (String palabra : palabras) {
            col = 0;
            for (int x = 0; x < palabra.length(); x++) {
                //Se genera variable para convertir la palabra en caracteres
                char letra = palabra.charAt(x);
                //Se crea variable de tipo boolean para poder ingresar cada uno de los caracteres en espacios vacios
                boolean posicionValidaEncontrada = false;
                while (!posicionValidaEncontrada) {
                    if (sopaLetras[row][col] == 0 || sopaLetras[row][col] == letra) {
                        sopaLetras[row][col] = letra;
                        posicionValidaEncontrada = true;
                    }
                }
                col++;
            }
            row++;
        }

        //Se crea bloque de codigo que genera caracteres alearorios gracias a los codigos ASCII
        for (int x = 0; x < sopaLetras.length; x++) {
            for (int z = 0; z < sopaLetras[x].length; z++) {
                if (sopaLetras[x][z] == 0) {
                    /*Se generan numeros aleatorios dentro del rango requerido para que
                    al convertirlos a caracter estos tomen el valor requerido*/
                    int letras = (int) (Math.random() * 26) + 97;
                    //Se pasan los numeros generados aleatoriamente a caracteres
                    sopaLetras[x][z] = (char) letras;
                }
            }
        }

        //Bloque de codigo necesario para imprimir toda la matriz
        for (int x = 0; x < sopaLetras.length; x++) {
            for (int z = 0; z < sopaLetras[x].length; z++) {
                System.out.print("[" + sopaLetras[x][z] + "]");
            }
            System.out.println();
        }
    }

}