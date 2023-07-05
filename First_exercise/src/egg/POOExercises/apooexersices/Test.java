package egg.POOExercises.apooexersices;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String[] alumnosHard = {"A", "R", "C", "D", "E", "F", "G"};
        String[] alumnos = new String[5];

        for (int x = 0; x < 5; x++) {
            System.out.println("Alumno # " + (x + 1));
            setAlumnos(new String[]{alumnos[x] = sc.nextLine()});
        }

        for (int x = 0; x < 5; x++) {
            System.out.print("{" + alumnos[x] + "}");
            System.out.print("[" + alumnosHard[x] + "]");
        }


    }

    private static void setAlumnos(String[] strings) {
    }

}

