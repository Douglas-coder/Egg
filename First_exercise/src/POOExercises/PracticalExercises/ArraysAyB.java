package POOExercises.PracticalExercises;

/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class ArraysAyB {

    //*Creacion ArrayList 1 y 2
    ArrayList<Double> lista1 = new ArrayList<Double>();
    //Uso metodo Collections para darle un valor maximo al Arraylist y llenarlo
    ArrayList<Double> lista2 = new ArrayList<Double>(Collections.nCopies(20, 0.5));
    //*Creacion Vectores para guardar los datos
    private double[] arregloA = new double[50];
    private double[] arregloB = new double[20];

    public ArraysAyB(double arregloA, double arregloB) {
        this.arregloA = new double[]{arregloA};
        this.arregloB = new double[]{arregloB};
    }

    public ArraysAyB() {

        System.out.println("◖►********** Primera forma **********◄◗");
        System.out.println();
        Listas();
        System.out.println();
        System.out.println("◖►********** Segunda forma **********◄◗");
        System.out.println();
        Vectores();
        System.out.println();

    }


    //?Metodo llenar ArrayList
    public void Listas() {

        //Creacion calse Ramdom para generar los numeros
        Random random = new Random();

        //Se llena el primer ArrayList con numeros random
        for (int x = 0; x < 50; x++) {
            lista1.add(random.nextDouble() * 100);
        }

        //Impresion del ArrayList desordenado
        System.out.println("Arreglo A sin ordenar:");
        //Creacion de for each para poder imprimir el ArrayList solo con un decimal
        for (double a : lista1) {
            System.out.printf("[%.1f]", a);
        }
        System.out.println("");

        //Uso de Collections.sort para ordenar los elementos del ArrayList de menor a mayore
        Collections.sort(lista1);

        //Se llena el segundo ArrayList solo con los 10 primeros datos del primer ArrayList
        for (int x = 0; x < 10; x++) {
            lista2.set(x, lista1.get(x));
        }

        //Impresion de ambos ArrayList usando for each para imprimir solo con el primer decimal
        System.out.println("Arreglo A ordenado:");
        for (double a : lista1) {
            System.out.printf("[%.1f]", a);
        }
        System.out.println("");
        System.out.println("Arreglo B ordenado:");
        for (double b : lista2) {
            System.out.printf("[%.1f]", b);
        }
        System.out.println("");

    }

    //?Metodo llenar vectores
    public void Vectores() {

        //Se llena el primeer vector usando Math.random
        for (int x = 0; x < arregloA.length; x++) {
            arregloA[x] = Math.random() * 100;
        }

        //Impresion del primer vector solo con los primeros dos decimales
        System.out.println("Arreglo A sin ordenar:");
        for (double a : arregloA) {
            System.out.print("[" + Math.round(a * 100d) / 100d + "]");
        }
        /*for (int x = 0 ; x < arregloA.length; x++){
            System.out.println("[" + arregloA[x] + "]");
        }*/

        System.out.println("");

        //Uso del Arrays.sort para ordenar de menor a mayor el vector
        Arrays.sort(arregloA);

        //Se llena el segundo vector con los primeros 10 datos del primer vector
        for (int x = 0; x < 10; x++) {
            arregloB[x] = arregloA[x];
        }

        //Se llena el resto del vector 2 con el valor definido
        Arrays.fill(arregloB, 10, 20, 0.5);

        //Impresion de ambos vectores
        System.out.println("Arreglo A ordenado:");
        for (double a : arregloA) {
            System.out.print("[" + Math.round(a * 100d) / 100d + "]");
        }
        System.out.println("");
        System.out.println("Arreglo B ordenado:");
        for (double b : arregloB) {
            System.out.print("[" + Math.round(b * 100d) / 100d + "]");
        }
        System.out.println("");

    }

    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }

}
