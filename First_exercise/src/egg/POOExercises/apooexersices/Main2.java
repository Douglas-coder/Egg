package egg.POOExercises.apooexersices;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {

        int continuar = 1;

        while (continuar == 1) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Por favor indique que desea realizar");
            System.out.println("1- Ingresar monto");
            System.out.println("2- Retirar monto");
            System.out.println("3- Extracion rapida");
            System.out.println("4- Consultar saldo");
            System.out.println("5- Consultar datos");
            int menu = sc.nextInt();
            System.out.println("");

            switch (menu) {
                case 1:
                    System.out.println("Opc 1");
                    break;
                case 2:
                    System.out.println("Opc 2");
                    break;
                case 3:
                    System.out.println("Opc 3");
                    break;
                case 4:
                    System.out.println("Opc 4");
                    break;
                case 5:
                    System.out.println("Opc 5");
                    break;
            }

            System.out.println("");
            System.out.println("Desea consultar o realizar otra accion? (1)");
            System.out.println("Salir (0)");
            continuar = sc.nextInt();
            System.out.println("");

        }


    }

}
