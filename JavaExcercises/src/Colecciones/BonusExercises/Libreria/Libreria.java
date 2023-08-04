package Colecciones.BonusExercises.Libreria;

import Colecciones.Main;

import java.util.HashSet;

public class Libreria {

    HashSet<Libro> listaLibros = new HashSet<>();

    public Libro crearLibros() {
        System.out.println("Ingrese el titulo del libro");
        String titulo = Main.sc.next();
        System.out.println("Ingresa el nombre del autor");
        String autor = Main.sc.next();
        System.out.println("Ingrese el numero de ejemplares");
        int ejemplares = Main.sc.nextInt();
        int ejemPrestados = 0;

        return new Libro(titulo, autor, ejemplares, ejemPrestados);
    }

    public void agregarLibros(Libro l) {
        listaLibros.add(l);
    }

    public void mostrarLibros() {
        System.out.println(
                "--------------------" + '\n' +
                        "Los libros son: " + '\n'
        );
        for (Libro aux : listaLibros) {
            System.out.println(aux.toString());
        }
        System.out.println("--------------------" + '\n');
    }

    public void fabricaLibros() {
        String salir;

        listaLibros.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 10, 0));
        listaLibros.add(new Libro("El señor de los anillos (Trilogía)", "J. R. R. Tolkien", 12, 0));
        listaLibros.add(new Libro("Crimen y castigo", "Fiódor Dostoyevski", 5, 0));
        listaLibros.add(new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 20, 0));
        listaLibros.add(new Libro("El Principito", "Antoine de Saint-Exupéry", 15, 0));

        do {
            for (int i = 0; i < 1; i++) {
                Libro crearlibro = crearLibros();
                agregarLibros(crearlibro);
            }
            System.out.println("Desea agregar otro libro? (S/N)");
            salir = Main.sc.next();
            System.out.println();
        } while (!salir.equalsIgnoreCase("N"));

    }

    public boolean prestamo() {

        System.out.println("Ingrese el titulo del libro que desea prestar");
        String nombre = Main.sc.next();

        Libro libroPrestado = null;
        for (Libro aux : listaLibros) {
            if (aux.getTitulo().equalsIgnoreCase(nombre)) {
                libroPrestado = aux;
                break;
            }
        }

        if (libroPrestado == null) {
            System.out.println("El libro '" + nombre + "' No se encuentra en la libreria" + '\n');
            return false;
        }

        if (libroPrestado.getEjemplares() <= 0) {
            System.out.println("El libro '" + nombre + "' no tiene ejemplares disponibles" + '\n');
            return false;
        }

        libroPrestado.setEjemplares(libroPrestado.getEjemplares() - 1);
        libroPrestado.setEjemplaresPrestados(libroPrestado.getEjemplaresPrestados() + 1);
        System.out.println("El libro '" + nombre + "' fue prestado." + '\n');
        return true;

    }

    public boolean devolucion() {

        System.out.println("Ingrese el titulo del libro que desea devolver");
        String nombre = Main.sc.next();

        Libro libroDevuelto = null;
        for (Libro aux : listaLibros) {
            if (aux.getTitulo().equalsIgnoreCase(nombre)) {
                libroDevuelto = aux;
                break;
            }
        }

        if (libroDevuelto == null) {
            System.out.println("El libro '" + nombre + "' No se encuentra en la libreria" + '\n');
            return false;
        }

        if (libroDevuelto.getEjemplaresPrestados() > 0) {
            libroDevuelto.setEjemplares(libroDevuelto.getEjemplares() + 1);
            libroDevuelto.setEjemplaresPrestados(libroDevuelto.getEjemplaresPrestados() - 1);
            System.out.println("El libro '" + nombre + "' fue devuelto." + '\n');
            return true;
        } else {
            System.out.println("El libro '" + nombre + "' no tiene ejemplares prestados" + '\n');
            return false;
        }
    }

}
