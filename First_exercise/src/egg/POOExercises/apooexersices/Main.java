package egg.POOExercises.apooexersices;

import egg.POOExercises.PracticalExercises.*;
import egg.POOExercises.SEntidad.PersonasGuia;
import egg.POOExercises.Servicio.PersonaService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Variable para mantener en ejecución el menu.
        int continuar = 1;

        //Siclo while para poder ejecutar el menu.
        while (continuar == 1) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Seleccione el ejercicio a ejecutar:");
            System.out.println("1- Ejercicios practicos");
            System.out.println("2- Ejercicios extra");
            System.out.println("3- Ejercicios guia");
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
                            Libro libro = new Libro();
                            System.out.println("");
                            System.out.println("ISBN: " + libro.getISBN());
                            System.out.println("Titulo: " + libro.getTitulo());
                            System.out.println("Autor: " + libro.getAutor());
                            System.out.println("Numero de paginas: " + libro.getNumPaginas());
                            break;
                        case 2://Circunferencia
                            Circunferencia circulo = new Circunferencia();
                            System.out.println("");
                            System.out.println("El area es: " + circulo.area());
                            System.out.println("El Perimetro es: " + circulo.perimetro());
                            break;
                        case 3://Operaciones
                            Operacion operacion = new Operacion();
                            System.out.println("");
                            System.out.println("La suma de " + operacion.getNum1() + " + " + operacion.getNum2() + " = " + operacion.sumar());
                            System.out.println("La resta de " + operacion.getNum1() + " - " + operacion.getNum2() + " = " + operacion.restar());
                            System.out.println("La multiplicacion de " + operacion.getNum1() + " * " + operacion.getNum2() + " = " + operacion.multiplicar());
                            System.out.println("La division de " + operacion.getNum1() + " / " + operacion.getNum2() + " = " + operacion.dividir());
                            break;
                        case 4://Rectangulo
                            Rectangulo rectangulo = new Rectangulo();
                            System.out.println("");
                            System.out.println("La superficie del rectangulo con base: " + rectangulo.getBase() + " y altura: " + rectangulo.getAltura() + " es: " + rectangulo.superficie());
                            System.out.println("El perimetro del rectangulo con base: " + rectangulo.getBase() + " y altura: " + rectangulo.getAltura() + " es: " + rectangulo.perimetro());
                            break;
                        case 5://Cuenta bancaria
                            CuentaBancaria cuentaBancaria = new CuentaBancaria();
                            break;
                        case 6://Cafetera
                            Cafetera cafetera = new Cafetera();
                            break;
                        case 7://Persona
                            ArrayList<Persona> personas = new ArrayList<>();
                            for (int x = 0; x < 2; x++) {
                                //Crear(Instanciar) el objeto dentro del for para crear 1 objeto cada ciclo for(iteracion)
                                Persona persona = new Persona();
                                System.out.println("Persona numero: " + (x + 1));
                                persona.crearPersona();
                                personas.add(persona);
                            }
                            for (int x = 0; x < personas.size(); x++) {
                                System.out.println(personas.get(x).mostrarDatos());
                            }
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

                case 3://*Ejercicios guia
                    PersonaService primeraPersona = new PersonaService();
                    PersonasGuia personasGuia = primeraPersona.crearPersona();
                    System.out.println("Hola " + personasGuia.getName());
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
