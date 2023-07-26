package Colecciones.PracticalExercices;

import Colecciones.Main;
import Colecciones.Utilities.Comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PerrosServices {

    private List<Perros> dogList;

    public PerrosServices() {
        this.dogList = new ArrayList<>();
    }

    public Perros crearPerros() {
        System.out.println("Introduce el nombre");
        String nombre = Main.sc.next();
        System.out.println("Introduce la raza");
        String raza = Main.sc.next();
        System.out.println();

        return new Perros(nombre, raza);
    }

    public void agregarPerro(Perros p) {
        dogList.add(p);
    }

    public void mostrarPerros() {
        System.out.println("La lista de perros es: " + '\n');
        for (Perros aux : dogList) {
            System.out.println(aux.toString());
        }
        System.out.println("Perros ingresados: " + dogList.size() + '\n');
    }

    public void fabricaPerros() {
        int salir;

        do {
            for (int i = 0; i < 1; i++) {
                Perros crearPerro = crearPerros();
                agregarPerro(crearPerro);
            }
            System.out.println(
                    "Desea agregar otro perro" + '\n' +
                            "(1 ⇒ Si)" + "(0 ⇒ No)" + '\n'
            );
            salir = Main.sc.nextInt();

            if (salir == 0) {
                mostrarListaOrdenada();
            }

        } while (salir != 0);

    }

    public void mostrarListaOrdenada() {
        Collections.sort(dogList, Comparadores.ordenarPorRaza);
        mostrarPerros();
    }

    public void eliminarPerro() {
        String nombre;
        Iterator<Perros> it = dogList.iterator();

        System.out.println("Indique el nombre del perro que desea eliminar" + '\n');
        nombre = Main.sc.next();

        while (it.hasNext()) {
            Perros aux = it.next();
            if (aux.getNombre().equals(nombre)) {
                it.remove();
            } else {
                System.out.println("El perro no se encuntra en la lista" + '\n');
            }
        }

        mostrarListaOrdenada();

/*        for (int i = 0; i < dogList.size(); i++) {
            Perros p = dogList.get(i);
            if (p.getNombre().equals(nombre)){
                dogList.remove(i);
            }
        }*/
    }

}
