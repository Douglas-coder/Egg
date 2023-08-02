package Colecciones.BonusExercises.CantanteFamoso;

import Colecciones.Main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CantanteFamosoServices {

    List<CantanteFamoso> listaFamosos = new ArrayList<>();

    public CantanteFamoso crearFamoso() {
        System.out.println("Ingrese el nombre del cantante:");
        String cantante = Main.sc.next();
        System.out.println("Ingrese el disco mas vendido");
        String disco = Main.sc.next();

        return new CantanteFamoso(cantante, disco);
    }

    public void agregarCantante(CantanteFamoso cf) {
        listaFamosos.add(cf);
    }

    public void mostrarFamosos() {
        System.out.println(
                "--------------------" + '\n' +
                        "Los famosos son:" + '\n'
        );
        for (CantanteFamoso aux : listaFamosos) {
            System.out.println(aux.toString());
        }
        System.out.println("--------------------" + '\n');
    }

    public void fabricarFamosos() {

        String salir;

        listaFamosos.add(new CantanteFamoso("Michael Jackson", "Thriller"));
        listaFamosos.add(new CantanteFamoso("Elton John", "Goodbye Yellow Brick Road"));
        listaFamosos.add(new CantanteFamoso("Madonna", "True Blue"));
        listaFamosos.add(new CantanteFamoso("Eminem", "The Marshall Mathers LP"));
        listaFamosos.add(new CantanteFamoso("Taylor Swift", "Midnights"));

        do {
            for (int i = 0; i < 1; i++) {
                CantanteFamoso creaFamoso = crearFamoso();
                agregarCantante(creaFamoso);
            }

            System.out.println("Desea agregar otro famoso? (S/N)");
            salir = Main.sc.next();

        } while (salir.equals("N"));
        System.out.println();

    }

    public void eliminarFamoso() {
        String nombre;
        Iterator<CantanteFamoso> it = listaFamosos.iterator();

        System.out.println("Indique el nombre del famoso a eliminar");
        nombre = Main.sc.next();

        while (it.hasNext()) {
            CantanteFamoso aux = it.next();
            if (aux.getNombre().equalsIgnoreCase(nombre)) {
                it.remove();
                System.out.println("Eliminación exitosa" + '\n');
            } else {
                System.out.println("El famoso '" + nombre + "' no se encuentra en la lista" + '\n');
            }
        }

    }

}
