package POOExercises.PracticalExercises.Cafetera;

/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual
(la cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
* Constructor predeterminado o vacío
* Constructor con la capacidad máxima y la cantidad actual
* Métodos getters y setters.
* Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
* Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
* Método vaciarCafetera(): pone la cantidad de café actual en cero.
* Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/

import java.util.Scanner;

public class Cafetera {

    Scanner sc = new Scanner(System.in);
    private double capacidadMaxima = 1260;
    private double cantidadActual = 0;

    public Cafetera(double capacidadMaxima, double cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public Cafetera() {


    }

    //*Metodo llenar cafetera
    public double llenarCafetera() {

        return cantidadActual = capacidadMaxima;

    }

    //!Metodo servir taza
    public int servirTaza() {

        int tamTaza;

        System.out.println("Por favor indique el tamaño de la taza en ml (Max 177ml)");
        tamTaza = sc.nextInt();
        System.out.println();


        if (cantidadActual == 0) {
            System.out.println("La cafetera no contiene cafe");
            System.out.println();
        } else if (tamTaza > 177) {
            System.out.println("El tamaño de la taza no puede superar los 177 ml");
            System.out.println();
        } else if (cantidadActual < tamTaza) {
            System.out.println("La taza no se alcanzo a llenar y quedo con: " + cantidadActual + " ml de cafe");
            System.out.println();
            setCantidadActual(0);
        } else if (cantidadActual == tamTaza) {
            System.out.println("Su taza se lleno con la cantidad justa de cafe");
            System.out.println();
            setCantidadActual(0);
        } else {
            System.out.println("Su taza se lleno con: " + tamTaza + " ml de cafe");
            System.out.println();
            setCantidadActual(cantidadActual - tamTaza);
        }

        return tamTaza;

    }

    //!Metodo vaciar cafetera
    public double vaciarCafetera() {

        return cantidadActual = 0;

    }

    //*Metodo agregar cafe
    public int agregarCafe() {

        int cantCafe;

        System.out.println("Por favor indique la cantidad de cafe a rellenar");
        cantCafe = sc.nextInt();
        System.out.println();

        if ((cantCafe + cantidadActual) > capacidadMaxima) {
            System.out.println("La cantidad ingresada supera la cantidad maxima que es: " + capacidadMaxima);
        } else {
            setCantidadActual(cantidadActual + cantCafe);
        }

        System.out.println("La cantidad de cafe actual es: " + cantidadActual);

        return cantCafe;

    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(double cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
