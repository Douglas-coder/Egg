package egg.POOExercises.apooexersices;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {

        //Variable para mantener en ejecución el menu.
        int continuar = 1;

        //Siclo while para poder ejecutar el menu.
        while (continuar == 1) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Seleccione el ejercicio a ejecutar:");
            System.out.println("1- Ejercicios practicos");
            System.out.println("2- Ejercicios extra");
            int menu = sc.nextInt();
            System.out.println("");

            switch (menu) {//*Menu principal

                case 1://*Ejercicios practicos

                    System.out.println("Ejercicios Practicos");
                    System.out.println("Indique un numero del 1 al 14");
                    int submenu = sc.nextInt();
                    System.out.println("");

                    switch (submenu) {//*SubMenu1
                        case 1://Libro
                            System.out.println("Opcion 1 ejercicios practicos");
                            break;
                        case 2://Circunferencia
                            System.out.println("Opcion 2 ejercicios practicos");
                            break;
                        case 3://Operaciones
                            System.out.println("Opcion 3 ejercicios practicos");
                            break;
                        case 4://Rectangulo
                            System.out.println("Opcion 4 ejercicios practicos");
                            break;
                        case 5://Cuenta bancaria
                            System.out.println("Opcion 5 ejercicios practicos");
                            break;
                        case 6://Cafetera
                            System.out.println("Opcion 6 ejercicios practicos");
                            break;
                        case 7://Persona
                            System.out.println("Opcion 7 ejercicios practicos");
                            break;
                        case 8://Cadena
                            System.out.println("Opcion 8 ejercicios practicos");
                            break;
                        case 9://Matematica
                            System.out.println("Opcion 9 ejercicios practicos");
                            break;
                        case 10:
                            System.out.println("Opcion 10 ejercicios practicos");
                            break;
                        case 11:
                            System.out.println("Opcion 11 ejercicios practicos");
                            break;
                        case 12:
                            System.out.println("Opcion 12 ejercicios practicos");
                            break;
                        case 13:
                            System.out.println("Opcion 13 ejercicios practicos");
                            break;
                        case 14:
                            System.out.println("Opcion 14 ejercicios practicos");
                            break;
                        default:
                            System.out.println("Opcion erronea");
                    }

                    break;

                case 2://*Ejercicios extra

                    System.out.println("Ejercicios Extra");
                    System.out.println("Indique un numero del 1 al 6");
                    int submenu2 = sc.nextInt();
                    System.out.println("");

                    switch (submenu2) {//*SubMenu2
                        case 1:
                            System.out.println("Opcion 1 ejercicios extra");
                            break;
                        case 2:
                            System.out.println("Opcion 2 ejercicios extra");
                            break;
                        case 3:
                            System.out.println("Opcion 3 ejercicios extra");
                            break;
                        case 4:
                            System.out.println("Opcion 4 ejercicios extra");
                            break;
                        case 5:
                            System.out.println("Opcion 5 ejercicios extra");
                            break;
                        case 6:
                            System.out.println("Opcion 6 ejercicios extra");
                            break;
                        default:
                            System.out.println("Opcion erronea");
                    }

                    break;

                default:
                    System.out.println("Opcion erronea");

            }

            System.out.println("");
            System.out.println("Para volver al menú principal escribe (1)");
            System.out.println("Para salir escribe (0)");
            continuar = sc.nextInt();
            System.out.println("");

        }

    }

}
