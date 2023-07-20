package Colecciones.Ejemplos;

import java.util.ArrayList;

public class Ejemplo1 {

    public static void main(String[] args) {

        //Arrays
        String[] nombresArray = new String[5];

        for (int i = 0; i < nombresArray.length; i++) {
            nombresArray[i] = "Chiquito " + (i + 1);
        }

        for (String var : nombresArray) {
            System.out.println(var);
        }

        System.out.println();

        //Collections
        ArrayList<String> nombreArrayList = new ArrayList<>();

        nombreArrayList.add("Chiquito");
        nombreArrayList.add("Chiquito");
        nombreArrayList.add("Chiquito");

        System.out.println(nombreArrayList.size());

        nombreArrayList.remove("Chiquito");

        System.out.println(nombreArrayList.size());


        System.out.println(Integer.MAX_VALUE);

    }

}
