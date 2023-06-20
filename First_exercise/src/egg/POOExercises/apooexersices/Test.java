package egg.POOExercises.apooexersices;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test {

    public static void main(String[] args) {

        ArrayList<Float> lista1 = new ArrayList<Float>();
        ArrayList<Float> lista2 = new ArrayList<Float>(Collections.<Float>nCopies(20, 0.5F));
        DecimalFormat df = new DecimalFormat("#.##");
        Random random = new Random();

        for (int x = 0; x < 50; x++) {
            lista1.add((float) (random.nextDouble() * 100));
        }

        System.out.println("Arreglo A sin ordenar:");
        for (double a : lista1) {
            System.out.printf("[%.1f]", a);
        }
        System.out.println("");

        Collections.sort(lista1);

        for (int x = 0; x < 10; x++) {
            lista2.set(x, lista1.get(x));
        }

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

}

