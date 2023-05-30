package egg.JavaExercises;

import java.util.Scanner;

/*Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €*/

public class ConversorMoneda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double euro;
        double dolar;
        double libras;
        double yenes;

        System.out.println("Por favor ingrese los euros a convertir");
        euro = sc.nextDouble();

        dolar = euro * 1.28611;
        libras = euro * 0.86;
        yenes = euro * 129.852;

        System.out.println("Los " + euro + "€ en dolares son: $" + dolar);
        System.out.println("Los " + euro + "€ en libras son: " + libras + "£");
        System.out.println("Los " + euro + "€ en yenes son: " + yenes + "¥");

    }

}
