package egg.JavaExercises;

import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).*/

public class GradosCaF {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double degrees;
        double converse;

        System.out.println("Por favor ingrese los grados a convertir");
        degrees = leer.nextDouble();

        converse = 32 + (9 * degrees / 5);

        System.out.println("Los " + degrees + "℃ equivalen a " + converse + "℉");

    }
}
