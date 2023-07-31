package Colecciones.PracticalExercices.Paices;

import Colecciones.Main;

import java.util.HashSet;
import java.util.Iterator;

public class PaisServices {

    HashSet<String> listaPaises = new HashSet<String>();

    public Pais crearPais() {

        System.out.println("Ingrese el nombre del pais");
        String nombre = Main.sc.next();

        return new Pais(nombre);
    }

    public void agregarPais(Pais p) {
        listaPaises.add(String.valueOf(p));
    }

    public void mostrarPaises() {
        System.out.println(
                "-----------------------" + '\n' +
                        "Los paises son: " + '\n'
        );
        for (String aux : listaPaises) {
            System.out.println(aux.toString());
        }
    }

    public void fabricarPaises() {

        String salir;

        listaPaises.add(String.valueOf(new Pais("Colombia")));
        listaPaises.add(String.valueOf(new Pais("España")));
        listaPaises.add(String.valueOf(new Pais("Mexico")));
        listaPaises.add(String.valueOf(new Pais("Argentina")));
        listaPaises.add(String.valueOf(new Pais("Republica Dominicana")));

        do {
            for (int i = 0; i < 1; i++) {
                Pais crearpaises = crearPais();
                agregarPais(crearpaises);
            }
            System.out.println("Desea agregar otro pais? (S/N)");
            salir = Main.sc.next();
            System.out.println();
        } while (!salir.equalsIgnoreCase("N"));

        mostrarPaises();
        eliminarPais();
        mostrarPaises();

    }

    public void eliminarPais() {
        String nombre;
        int cont = 0;
        Iterator<String> it = listaPaises.iterator();

        System.out.println(
                "-----------------------" + '\n' +
                        "Indique el pais que desea eliminar"
        );
        nombre = Main.sc.next();

        String aux = it.next();
        if (aux.equals(String.valueOf(Pais.getNombre().equalsIgnoreCase(nombre)))) {
            it.remove();
            cont++;
        } else if (cont == 0) {
            System.out.println("El Pais no se encuentra en la lista" + '\n');
        }
    }

}
