package egg.ExtraExercises;

import java.util.ArrayList;
import java.util.Scanner;

/*Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.*/

public class PromedioEstaturas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Double> alturas = new ArrayList<Double>();
        double altura;
        double promedioGeneral = 0;
        double promedioDebajo160 = 0;
        int cont = 0;
        int numPersona = 1;

        System.out.println("Por favor ingrese la altura de las personas ('0' para finalizar)");

        do {
            System.out.print("Persona #" + numPersona++ + ":");
            altura = sc.nextDouble();
            if (altura != 0){
                alturas.add(altura);
            }
        }while (altura != 0);

        System.out.println("Ha introducido " + alturas.size() + " personas");
        System.out.println("");

        for (double alt : alturas) {
            promedioGeneral += altura;
        }
        promedioGeneral /= alturas.size();

        /*for (double altura : alturas) {
            if (altura < 1.60){

            }
        }*/
        
    }

}
