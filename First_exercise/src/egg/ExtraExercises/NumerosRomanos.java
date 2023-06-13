package egg.ExtraExercises;

import java.util.Scanner;

/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.*/

public class NumerosRomanos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Por favor ingrese un numero y te dire su equivalente en romano");
        num = sc.nextInt();

        cambiarNumeroARomano(num);

        System.out.println("El numero " + num + " en romano seria: " + cambiarNumeroARomano(num));

    }

    public static String cambiarNumeroARomano(int num) {

        String numRomano = "";

        switch (num) {
            case 1:
                numRomano += ("I");
                break;
            case 2:
                numRomano += ("II");
                break;
            case 3:
                numRomano += ("III");
                break;
            case 4:
                numRomano += ("IV");
                break;
            case 5:
                numRomano += ("V");
                break;
            case 6:
                numRomano += ("VI");
                break;
            case 7:
                numRomano += ("VII");
                break;
            case 8:
                numRomano += ("VIII");
                break;
            case 9:
                numRomano += ("IX");
                break;
            case 10:
                numRomano += ("X");
                break;
        }

        return numRomano;
    }

}
