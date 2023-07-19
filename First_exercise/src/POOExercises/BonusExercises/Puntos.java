package POOExercises.BonusExercises;

/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
calcular la distancia entre dos puntos consulte el siguiente link
*/

import java.util.Scanner;

public class Puntos {

    Scanner sc = new Scanner(System.in);
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Puntos(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public Puntos() {
        getCrearPuntos();
        System.out.println();
        getCalcularDistancia();
        System.out.println();
    }

    //?Metodo para crear los puntos
    public void getCrearPuntos() {
        System.out.println("Ingrese la coordenada en X del primer punto:");
        setX1(sc.nextInt());
        System.out.println("Ingrese la coordenada en Y del primer punto:");
        setY1(sc.nextInt());
        System.out.println("Ingrese la coordenada en X del segundo punto:");
        setX2(sc.nextInt());
        System.out.println("Ingrese la coordenada en Y del segundo punto:");
        setY2(sc.nextInt());
    }

    //?Metodo para calcular la distancia entre puntos
    public void getCalcularDistancia() {

        double distancia = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.print("La distancia entre puntos es: ");
        System.out.printf("[%.1f]", distancia);
        System.out.println("");

    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
}
