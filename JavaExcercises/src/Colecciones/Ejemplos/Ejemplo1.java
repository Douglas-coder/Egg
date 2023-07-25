package Colecciones.Ejemplos;

import Colecciones.Main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ejemplo1 {

    ArrayList<Integer> numerosA = new ArrayList<>();
    HashSet<Integer> numerosB = new HashSet<>();
    HashMap<Integer, String> alumnos = new HashMap<>();

    public Ejemplo1() {
        //llenarCollections();
        llenarDatosAuto();
        mostrarDatos();
        eliminarDatos();
        mostrarDatos();
    }

    public void llenarCollections() {
        System.out.println("**** ArrayList ****" + '\n');
        int x;
        for (int i = 0; i < 5; i++) {
            System.out.println("Por favor ingrese el " + (i + 1) + " dato:");
            x = Main.sc.nextInt();
            numerosA.add(x);
        }
        System.out.println();

        System.out.println("**** HasSet ****" + '\n');
        Integer y = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Por favor ingrese el " + (i + 1) + " dato:");
            y = Main.sc.nextInt();
            numerosB.add(y);
        }
        System.out.println();

        System.out.println("**** HasMap ****" + '\n');
        int dni;
        String nombreAlumno;
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    "Por favor ingrese el " + (i + 1) + " dato: " + '\n' +
                            "DNI: ");
            dni = Main.sc.nextInt();
            System.out.println("Nombre: ");
            nombreAlumno = Main.sc.next();
            alumnos.put(dni, nombreAlumno);
        }
        System.out.println();

    }

    public void llenarDatosAuto() {
        int x;
        for (int i = 0; i < 5; i++) {
            x = (int) (Math.random() * 11);
            numerosA.add(x);
        }

        Integer y;
        for (int i = 0; i < 5; i++) {
            y = (int) (Math.random() * 11);
            numerosB.add(y);
        }

        int dni;
        String nombreAlumno;
        for (int i = 0; i < 5; i++) {
            dni = (int) (Math.random() * 11);
            nombreAlumno = "Dou";
            alumnos.put(dni, nombreAlumno);
        }

    }

    public void eliminarDatos() {

        System.out.println("**** ArrayList ****" + '\n');
        int x;
        System.out.println("Indique la posición que desea eliminar");
        x = Main.sc.nextInt();
        numerosA.remove(x);
        System.out.println();

        System.out.println("**** HasSet ****" + '\n');
        Integer y;
        System.out.println("Indique el elemento que desea eliminar");
        y = Main.sc.nextInt();
        numerosB.remove(y);
        System.out.println();

        /*System.out.println("**** HasMap ****" + '\n');
        alumnos.remove(123);*/

    }

    public void mostrarDatos() {

        System.out.println("**** ArrayList ****" + '\n' + numerosA);
        for (Integer show : numerosA) {
            System.out.println(show);
        }
        System.out.println();

        System.out.println("**** HasSet ****" + '\n' + numerosB);
        for (Integer show : numerosB) {
            System.out.println(show);
        }
        System.out.println();

        System.out.println("**** HasMap ****" + '\n' + alumnos + '\n');
        for (Map.Entry<Integer, String> listaAlumnos : alumnos.entrySet()) {
            System.out.println(
                    "Documento: " + listaAlumnos.getKey() + " Nombre: " + listaAlumnos.getValue() + '\n'
            );
        }
        //Otra forma de imprimir los datos sin el Map.Entry
        /*for (Integer dni : alumnos.keySet()) {
            System.out.println("Documento: " + dni);
        }
        for (String nombres : alumnos.values()) {
            System.out.println("Nombre: " + nombres);
        }*/
        System.out.println();
    }
}
