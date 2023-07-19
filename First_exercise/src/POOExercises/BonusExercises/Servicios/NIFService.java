package POOExercises.BonusExercises.Servicios;

import POOExercises.BonusExercises.NIF;

import java.util.Scanner;

public class NIFService extends NIF {

    private final Scanner sc = new Scanner(System.in);

    public NIFService() {
        crearNif();
        System.out.println();
    }

    //?Metodo para crear e identificar la letra correspondiente al DNI
    public void crearNif() {

        System.out.println("Ingrese el DNI");
        setDNI(sc.nextInt());
        System.out.println();
        int Nif = (int) (getDNI() % 23);

        System.out.println(Nif);

        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
                "H", "L", "C", "K", "E"};

        setLetra((letras[Nif]));

    }

    //?Metodo para imprimir el resultado por pantalla
    @Override
    public String toString() {
        return getDNI() + " - " + getLetra();
    }
}
