package POOExercises.BonusExercises.Servicios;

import POOExercises.BonusExercises.Meses;

import java.util.Scanner;

public class MesesService extends Meses {

    private final Scanner sc = new Scanner(System.in);

    public MesesService() {
        crearMeses();
        adivinar();
        System.out.println();
    }

    public Meses crearMeses() {
        return new Meses();
    }

    public void adivinar() {

        String adivinarMes;
        int contador = 0;
        System.out.println("Ingrese un mes:");

        do {

            contador++;
            adivinarMes = sc.next();
            System.out.println();

            if (!adivinarMes.toLowerCase().equals(getMesSecreto())) {
                System.out.println("No era el mes, intenta nuevamente.");
            }

        } while (!adivinarMes.toLowerCase().equals(getMesSecreto()));


        System.out.println("Es el mes correcto");
        System.out.println("Numeros de intentos: " + contador);

    }

}
