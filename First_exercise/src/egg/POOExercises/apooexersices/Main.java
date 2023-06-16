package egg.POOExercises.apooexersices;

import egg.POOExercises.BonusExercises.Vehiculo;
import egg.POOExercises.PracticalExercises.*;
import egg.POOExercises.SEntidad.PersonasGuia;
import egg.POOExercises.Servicio.PersonaService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Variable para mantener en ejecución el menu.
        int continuar = 1;

        //Variable bandera para ciclos For
        int x = 0;

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
                            //Creacion ArrayList para guardar la info de cada objeto (Persona)
                            ArrayList<Persona> personas = new ArrayList<>();
                            int cont = 0;
                            int cont2 = 0;
                            int cont3 = 0;
                            int cont4 = 0;
                            int cont5 = 0;
                            for (x = 0; x < 4; x++) {
                                //Crear(Instanciar) el objeto dentro del for para crear 1 objeto cada ciclo for(iteracion)
                                Persona persona = new Persona();
                                System.out.println("Persona numero: " + (x + 1));
                                persona.crearPersona();
                                personas.add(persona);
                            }
                            for (x = 0; x < personas.size(); x++) {
                                System.out.println(personas.get(x).mostrarDatos());
                            }
                            for (x = 0; x < personas.size(); x++) {
                                if (personas.get(x).calcularIMC() < 0) {
                                    cont++;
                                } else if (personas.get(x).calcularIMC() == 0) {
                                    cont2++;
                                } else if (personas.get(x).calcularIMC() > 0) {
                                    cont3++;
                                }
                            }
                            for (x = 0; x < personas.size(); x++) {
                                if ((personas.get(x).esMayorDeEdad())) {
                                    cont4++;
                                } else {
                                    personas.get(x).esMayorDeEdad();
                                    cont5++;
                                }
                            }
                            System.out.println("--Personas con deficit de peso:-- " + cont);
                            System.out.println("--Personas con peso ideal:-- " + cont2);
                            System.out.println("--Personas con sobrepeso:-- " + cont3);
                            System.out.println("Personas mayores de edad: " + cont4);
                            System.out.println("Personas menores de edad: " + cont5);
                            break;
                        case 8://Cadena
                            Cadena cadena = new Cadena();
                            System.out.println("La palabra o frase contiene: " + cadena.mostrarVocales() + " vocales.");
                            System.out.println("Palabra o frase invertida: ");
                            System.out.println(cadena.invertirFrase());
                            System.out.println("La letra seleccionada esta: " + cadena.vecesRepetido() + " veces");
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
                    System.out.println("Indique un numero del 1 al 8");
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
                        case 7://?  *********** Vehiculos ***********
                            System.out.println("▩▩▩▩ Reto 1 ▩▩▩▩");
                            System.out.println("");
                            //Array list para guardar los 3 vehiculos
                            ArrayList<Vehiculo> vehiculos = new ArrayList<>();
                            //Variables para guardar los ultimos datos necesarios
                            int mayor = 0;
                            String tipo = "";

                            //Ciclo for para Crear los 3 vehiculos
                            for (x = 0; x < 3; x++) {
                                System.out.println("Vehiculo #" + (x + 1));
                                Vehiculo vehiculo = new Vehiculo();
                                //Se añade los valores al ArrayList
                                vehiculos.add(vehiculo);
                            }

                            //Mostramos por pantalla los datos de los vehiculos creados
                            for (x = 0; x < vehiculos.size(); x++) {
                                System.out.println(vehiculos.get(x).mostrarDatos());
                            }

                            //Ciclo for para hallar el vehiuculo que mas avanzo despues de frenar
                            for (x = 0; x < vehiculos.size(); x++) {
                                System.out.println("El vehiculo #" + (x + 1) + " Recorrio " + vehiculos.get(x).getFrenar() + " metros despues de ◶ 5 minutos");
                                if (vehiculos.get(x).getFrenar() > mayor) {
                                    mayor = vehiculos.get(x).getFrenar();
                                    tipo = vehiculos.get(x).getTipo();
                                }
                            }

                            System.out.println("");
                            System.out.println("El vehiculo (" + tipo + ") Fue el que mas recorrio con " + mayor + " metros en 5 minutos.");

                            break;
                        case 8:
                            System.out.println("Reto 2");
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
