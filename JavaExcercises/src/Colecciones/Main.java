package Colecciones;

import Colecciones.Menu.MainMenu;
import MenuExample.Menu;

import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        /*MainMenu menu = new MainMenu();
        menu.run();*/

        Menu m = new Menu();
        m.run();

    }

}
