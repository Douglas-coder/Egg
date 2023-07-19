package POOExercises.Retos.Figuras.Menu;

import POOExercises.MainProgram.RefactorMain;
import POOExercises.Retos.Figuras.Entidades.*;
import POOExercises.Retos.Figuras.Entidades.*;

public class MenuFiguras {

    private static void showBankOptions() {
        System.out.println(
                "1 ⇒ Cuadrado  " + " | 2 ⇒ Rectangulo" + '\n' +
                        "3 ⇒ Triangulo " + " | 4 ⇒ Cubo" + '\n' +
                        "5 ⇒ Cilindro  " + " | 6 ⇒ Hexagono" + '\n' +
                        "7 ⇒ Pentagono " + " | 8 ⇒ Rombo" + '\n' +
                        "9 ⇒ Menu retos" + '\n'
        );
    }

    private static int selectOption() {
        System.out.println("Seleccione una opción");
        return RefactorMain.sc.nextInt();
    }

    public void figurasMenu() {

        int opc;

        do {
            showBankOptions();
            opc = selectOption();
            System.out.println();
            showOptions(opc);
        } while (opc != 9);

    }

    private void showOptions(int opc) {
        switch (opc) {
            case 1:
                //Se agrega los datos correspondientes a la opcion.
                System.out.println("Figura cuadrado");

                //Se le pide al usuario que ingrese los datos correspondientes al caso.
                System.out.println("Escriba el valor del lado: ");
                double ladoCua = RefactorMain.sc.nextDouble();
                System.out.println();

                //Se llama la clase para poder imprimir los resultados correspondientes.
                Cuadrado cuadrado = new Cuadrado(ladoCua);

                //Se imprimen los resultados del caso.
                System.out.println(
                        "Este es el area: " + cuadrado.getArea() + '\n' +
                                "Este es el perimetro: " + cuadrado.getPerimetro() + '\n'
                );

                //Se finaliza el caso para poder agregar mas si son necesarios.
                break;
            case 2:
                System.out.println("Figura Rectangulo");

                System.out.println("Escriba el valor de la altura: ");
                double altura = RefactorMain.sc.nextDouble();
                System.out.println("Escriba el valor de la base: ");
                double base = RefactorMain.sc.nextDouble();
                System.out.println();

                Rectangulo rectangulo = new Rectangulo(altura, base);

                System.out.println(
                        "Este es el area: " + rectangulo.getArea() + '\n' +
                                "Este el el perimetro: " + rectangulo.getPerimetro() + '\n'
                );
                break;
            case 3:
                System.out.println("Figura Triangulo");

                System.out.println("Escriba el valor del lado 1: ");
                double ladotri1 = RefactorMain.sc.nextDouble();
                System.out.println("Escriba el valor del lado 2: ");
                double ladotri2 = RefactorMain.sc.nextDouble();
                System.out.println("Escriba el valor del lado 3: ");
                double ladotri3 = RefactorMain.sc.nextDouble();
                System.out.println();

                Triangulo triangulo = new Triangulo(ladotri1, ladotri2, ladotri3);

                System.out.println(
                        "El triangulo es de tipo: " + triangulo.getTipo() + '\n' +
                                "Este es el area: " + triangulo.getArea() + '\n' +
                                "Este es el perimetro: " + triangulo.getPerimetro() + '\n'
                );
                break;
            case 4:
                System.out.println("Figura Cubo");

                System.out.println("Escriba el valor de uno de los lados: ");
                double ladoCub = RefactorMain.sc.nextDouble();
                System.out.println();

                Cubo cubo = new Cubo(ladoCub);

                System.out.println(
                        "Este es el volumen: " + cubo.getVolumen() + '\n' +
                                "Este es el area: " + cubo.getArea() + '\n' +
                                "Este es el perimetro: " + cubo.getPerimetro() + '\n'
                );
                break;
            case 5:
                System.out.println("Figura cilindro");

                System.out.println("Escriba el valor del radio: ");
                double radioCil = RefactorMain.sc.nextDouble();
                System.out.println("Escriba el valor de la altura: ");
                double alturaCil = RefactorMain.sc.nextDouble();
                System.out.println();

                Cilindro cilindro = new Cilindro(radioCil, alturaCil);

                System.out.println(
                        "Este es el volumen: " + cilindro.getVolumen() + '\n' +
                                "Este es el area: " + cilindro.getArea() + '\n' +
                                "Este es el perimetro: " + cilindro.getPerimetro() + '\n'
                );
                break;
            case 6:
                System.out.println("Figura Hexagono");

                System.out.println("Escriba el valor de uno de los lados: ");
                double ladoHex = RefactorMain.sc.nextDouble();
                System.out.println();

                Hexagono hexagono = new Hexagono(ladoHex);

                System.out.println(
                        "Este es el area: " + hexagono.getArea() + '\n' +
                                "Este es el perimetro: " + hexagono.getPerimetro() + '\n'
                );
                break;
            case 7:
                System.out.println("Figura Pentagono");

                System.out.println("Escriba el valor de los lados: ");
                double ladoPent = RefactorMain.sc.nextDouble();
                System.out.println();

                Pentagono pentagono = new Pentagono(ladoPent);

                System.out.println(
                        "Este es el area: " + pentagono.getArea() + '\n' +
                                "Este es el perimetro: " + pentagono.getPerimetro() + '\n'
                );
                break;
            case 8:
                System.out.println("Figura Rombo");
                System.out.println("Escriba el valor de los lado: ");
                double ladoRom = RefactorMain.sc.nextDouble();
                System.out.println("Escriba el valor de la diagonal 1: ");
                double diagonalRom1 = RefactorMain.sc.nextDouble();
                System.out.println("Escriba el valor de la diagonal 2: ");
                double diagonalRom2 = RefactorMain.sc.nextDouble();
                System.out.println();

                Rombo rombo = new Rombo(ladoRom, diagonalRom1, diagonalRom2);

                System.out.println(
                        "Este es el area: " + rombo.getArea() + '\n' +
                                "Este es el perimetro: " + rombo.getPerimetro() + '\n'
                );
                break;
            case 9:
                break;
            default:
                System.out.println("❌❌Opción invalida❌❌" + '\n');
        }
    }

}
