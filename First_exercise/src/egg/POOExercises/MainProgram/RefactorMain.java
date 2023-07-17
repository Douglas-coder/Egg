package egg.POOExercises.MainProgram;

import egg.POOExercises.Menu.MenuPrincipal;

import java.util.Scanner;

public class RefactorMain {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        MenuPrincipal menu = new MenuPrincipal();
        menu.run();

    }
}
