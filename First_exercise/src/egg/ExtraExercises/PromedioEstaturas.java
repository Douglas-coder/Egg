package egg.ExtraExercises;

import java.util.ArrayList;
import java.util.Scanner;

/*
* Better comments
! Alert
? Cuestion
TODO: @Hola
*/

public class PromedioEstaturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> alturas = new ArrayList<Double>();

        /**
         * * Agregamos las alturas de las N personas
         alturas.add(1.70);
         alturas.add(1.55);
         alturas.add(1.80);
         alturas.add(1.62);
         alturas.add(1.50);
         */

        double altura;
        double promedioGeneral = 0;
        double promedioDebajo160 = 0;
        int cont = 0;
        int numPersona = 1;

        System.out.println("Por favor ingrese la altura de las personas ('0' para finalizar)");

        do {
            System.out.print("Persona #" + numPersona++ + ":");
            altura = sc.nextDouble();
            if (altura != 0) {
                alturas.add(altura);
            }
        } while (altura != 0);

        System.out.println("Ha introducido " + alturas.size() + " personas");
        System.out.println("");

        // Calculamos el promedio de estaturas en general
        for (double alt : alturas) {
            promedioGeneral += alt; // Acumulamos las alturas
        }
        promedioGeneral /= alturas.size(); // Dividimos entre la cantidad de personas

        // Calculamos el promedio de estaturas por debajo de 1.60 mts
        for (double alt : alturas) {
            if (alt < 160) {
                promedioDebajo160 += alt; // Acumulamos las alturas por debajo de 1.60 mts
                cont++; // Contamos la cantidad de personas por debajo de 1.60 mts
            }
        }
        if (cont > 0) { // Si hay personas por debajo de 1.60 mts, calculamos el promedio
            promedioDebajo160 /= cont; // Dividimos entre la cantidad de personas por debajo de 1.60 mts
        }

        // Imprimimos los resultados
        System.out.println("Promedio de estaturas en general: " + promedioGeneral);
        if (cont > 0) { // Si hay personas por debajo de 1.60 mts, imprimimos el promedio
            System.out.println("Promedio de estaturas por debajo de 1.60 mts: " + promedioDebajo160);
        } else { // Si no hay personas por debajo de 1.60 mts, imprimimos un mensaje
            System.out.println("No hay personas por debajo de 1.60 mts");
        }
    }
}