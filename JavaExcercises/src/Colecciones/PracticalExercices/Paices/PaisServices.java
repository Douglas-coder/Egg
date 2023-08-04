package Colecciones.PracticalExercices.Paices;

import Colecciones.Main;

import java.util.HashSet;
import java.util.Iterator;

public class PaisServices {

    HashSet<Pais> listaPaises = new HashSet();

    public Pais crearPais() {

        System.out.println("Ingrese el nombre del pais");
        String nombre = Main.sc.next();

        return new Pais(nombre);
    }

    public void agregarPais(Pais p) {
        listaPaises.add(p);
    }

    public void mostrarPaises() {
        System.out.println(
                "-----------------------" + '\n' +
                        "Los paises son: " + '\n'
        );
        for (Pais aux : listaPaises) {
            System.out.println(aux.toString());
        }
    }

    public void fabricarPaises() {

        String salir;

        listaPaises.add(new Pais("Colombia"));
        listaPaises.add(new Pais("España"));
        listaPaises.add(new Pais("Mexico"));
        listaPaises.add(new Pais("Argentina"));
        listaPaises.add(new Pais("Republica Dominicana"));

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
        int cont = 0;
        Iterator<Pais> it = listaPaises.iterator();

        System.out.println(
                "-----------------------" + '\n' +
                        "Indique el pais que desea eliminar"
        );
        String nombre = Main.sc.next();

        while (it.hasNext()) {
            cont++;
            if (it.next().getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
            }else if (cont == listaPaises.size()) {
                System.out.println("El pais no se encuentra en la lista");
            }
        }
    }

}
