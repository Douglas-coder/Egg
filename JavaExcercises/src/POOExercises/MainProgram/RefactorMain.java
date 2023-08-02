package POOExercises.MainProgram;

import POOExercises.Menu.MenuPrincipal;

import java.util.Scanner;

public class RefactorMain {

    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        new MenuPrincipal().run();

    }
}