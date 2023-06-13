package egg.JavaExample;

import java.util.Scanner;

public class VectorCompañeros {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        String[] team = new String[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el nombre del compañero #: " + i);
            team[i] = leer.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.print("[ " + i + " " + team[i] + " ]");
        }

    }

}
