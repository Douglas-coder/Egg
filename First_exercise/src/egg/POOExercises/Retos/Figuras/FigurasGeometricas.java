package egg.POOExercises.Retos.Figuras;

import egg.POOExercises.Retos.Figuras.Entidades.*;

import java.util.Scanner;

public class FigurasGeometricas {

    public FigurasGeometricas() {

        //Se crea un Scanner general para poder pedir por consola el valor requerido.
        Scanner sc = new Scanner(System.in);

        //Se crea una funcion para poder ejecutar el while.
        int seguir = 1;

        //Se crea una funcion while para poder repetir las opciones y provar otras figuras.
        while (seguir == 1) {

            //Se crean opciones para que el usuario seleccione
            System.out.println("Por favor indique que figura quiere seleccionar: ");
            System.out.println("1- Cuadrado: ");
            System.out.println("2- Rectangulo: ");
            System.out.println("3- Triangulo: ");
            System.out.println("4- Cubo: ");
            System.out.println("5- Cilindro: ");
            System.out.println("6- Hexagono: ");
            System.out.println("7- Pentagono: ");
            System.out.println("8- Rombo: ");

            //Se indica que el Scarner va a ser de tipo (int) Entero.
            int fig = sc.nextInt();
            System.out.println("");

            //Se crea un Switch para poder interactuar con cada una de las opciones.
            switch (fig) {
                //Cada opcion se crea con un caso y se le asigna un valor (case [valor]:).
                case 1://?Cuadrado

                    //Se agrega los datos correspondientes a la opcion.
                    System.out.println("Figura cuadrado");

                    //Se le pide al usuario que ingrese los datos correspondientes al caso.
                    System.out.println("Escriba el valor del lado: ");
                    double ladoCua = sc.nextDouble();
                    System.out.println("");

                    //Se llama la clase para poder imprimir los resultados correspondientes.
                    Cuadrado cuadrado = new Cuadrado(ladoCua);

                    //Se imprimen los resultados del caso.
                    System.out.println("este es el Area: " + cuadrado.getArea());
                    System.out.println("este es el perimetro " + cuadrado.getPerimetro());

                    //Se finaliza el caso para poder agregar mas si son necesarios.
                    break;

                case 2://?Rectangulo

                    System.out.println("Figura Rectangulo");

                    System.out.println("Escriba el valor de la altura: ");
                    double altura = sc.nextDouble();
                    System.out.println("Escriba el valor de la base: ");
                    double base = sc.nextDouble();
                    System.out.println("");

                    Rectangulo rectangulo = new Rectangulo(altura, base);

                    System.out.println("este es el perimetro " + rectangulo.getPerimetro());
                    System.out.println("este es el area " + rectangulo.getArea());

                    break;

                case 3://?Triangulo

                    System.out.println("Figura Triangulo");

                    System.out.println("Escriba el valor del lado 1: ");
                    double ladotri1 = sc.nextDouble();
                    System.out.println("Escriba el valor del lado 2: ");
                    double ladotri2 = sc.nextDouble();
                    System.out.println("Escriba el valor del lado 3: ");
                    double ladotri3 = sc.nextDouble();
                    System.out.println("");

                    Triangulo triangulo = new Triangulo(ladotri1, ladotri2, ladotri3);

                    System.out.println("El triangulo es de tipo: " + triangulo.getTipo());
                    System.out.println("Esta es el Area: " + triangulo.getArea());
                    System.out.println("Este es el Perimetro: " + triangulo.getPerimetro());

                    break;

                case 4:

                    System.out.println("Figura Cubo");

                    System.out.println("Escriba el valor de uno de los lados: ");
                    double ladoCub = sc.nextDouble();
                    System.out.println("");

                    Cubo cubo = new Cubo(ladoCub);

                    System.out.println("este es el volumen " + cubo.getVolumen());
                    System.out.print("este es el area " + cubo.getArea());
                    System.out.println("este es el perimetro " + cubo.getPerimetro());

                    break;

                case 5:

                    System.out.println("Figura cilindro");

                    System.out.println("Escriba el valor del radio: ");
                    double radioCil = sc.nextDouble();
                    System.out.println("Escriba el valor de la altura: ");
                    double alturaCil = sc.nextDouble();
                    System.out.println("");

                    Cilindro cilindro = new Cilindro(radioCil, alturaCil);

                    System.out.println("Esta es el Area: " + cilindro.getArea());
                    System.out.println("Este es el Perimetro: " + cilindro.getPerimetro());
                    System.out.println("Esta es el Volumen: " + cilindro.getVolumen());

                    break;

                //Figura Extra de practica
                case 6:

                    System.out.println("Figura Hexagono");

                    System.out.println("Escriba el valor de uno de los lados: ");
                    double ladoHex = sc.nextDouble();
                    System.out.println("");

                    Hexagono hexagono = new Hexagono(ladoHex);

                    System.out.println("este es el perimetro " + hexagono.getPerimetro());
                    System.out.println("este es el area " + hexagono.getArea());

                    break;

                case 7:

                    System.out.println("Figura Pentagono");

                    System.out.println("Escriba el valor de los lados: ");
                    double ladoPent = sc.nextDouble();
                    System.out.println("");

                    Pentagono pentagono = new Pentagono(ladoPent);

                    System.out.println("El perimetro del pentagono es: " + pentagono.getPerimetro());
                    System.out.println("El area del pentagono es: " + pentagono.getArea());

                    break;

                case 8:

                    System.out.println("Figura Rombo");
                    System.out.println("Escriba el valor de los lado: ");
                    double ladoRom = sc.nextDouble();
                    System.out.println("Escriba el valor de la diagonal 1: ");
                    double diagonalRom1 = sc.nextDouble();
                    System.out.println("Escriba el valor de la diagonal 2: ");
                    double diagonalRom2 = sc.nextDouble();

                    Rombo rombo = new Rombo(ladoRom, diagonalRom1, diagonalRom2);

                    System.out.println("El perimetro del rombo es: " + rombo.getPerimetro());
                    System.out.println("El area del rombo es: " + rombo.getArea());

                    break;

            }

            //Se añade al final las opciones para repetir o finalizar.
            System.out.println("");
            System.out.println("Escribe 1 para repetir");
            System.out.println("Escribe 0 para salir");
            seguir = sc.nextInt();
        }


    }

}
