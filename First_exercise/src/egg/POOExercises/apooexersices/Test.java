package egg.POOExercises.apooexersices;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;
        String sexo;
        int peso;
        int altura;

        System.out.println("Por favor indique su sexo");
        System.out.println("H- Hombre");
        System.out.println("M- Mujer");
        System.out.println("O- Otro");
        sexo = sc.nextLine();
        sexo = sexo.toUpperCase();

        if (sexo.equals("H") || sexo.equals("M") || sexo.equals("O")) {
            System.out.println("Sexo confirmado");
        } else {
            System.out.println("La opcion seleccionada no es valida");
        }

    }

}

