package Colecciones.PracticalExercices.Cine;

import Colecciones.Main;
import Colecciones.Utilities.Comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PeliculaServices {

    List<Pelicula> listaPeliculas = new ArrayList<>();

    public Pelicula crearPeliculas() {
        System.out.println("Ingresa el titulo de la pelicula");
        String titulo = Main.sc.next();
        System.out.println("Ingrese el director");
        String director = Main.sc.next();
        System.out.println("Ingrese la duración (En horas)");
        double duracion = Main.sc.nextDouble();

        return new Pelicula(titulo, director, duracion);
    }

    public void agregarPeliculas(Pelicula p) {
        listaPeliculas.add(p);
    }

    public void mostrarPeliculas() {
        System.out.println("Las peliculas son: " + '\n');
        for (Pelicula aux : listaPeliculas) {
            System.out.println(aux.toString());
        }
    }

    public void fabricarPeliculas() {
        String salir;

        listaPeliculas.add(new Pelicula("Titanic", "Cameron", 3));
        listaPeliculas.add(new Pelicula("Rambo1", "Cotcher", 1.5));
        listaPeliculas.add(new Pelicula("Roky", "Silvester Stalon", 2));
        listaPeliculas.add(new Pelicula("Harry Potter", "JK Rowling", 0.5));

        do {
            for (int i = 0; i < 1; i++) {
                Pelicula crearPelicula = crearPeliculas();
                agregarPeliculas(crearPelicula);
            }
            System.out.println("Desea agregar otra pelicula? (S/N)");
            salir = Main.sc.next();
            System.out.println();

        } while (!salir.equalsIgnoreCase("N"));

    }

    public void mostrarMenorAMayor() {
        Collections.sort(listaPeliculas, Comparadores.ordenarMenorAMayor);
        mostrarPeliculas();
    }

    public void mostrarMayorAMenor() {
        Collections.sort(listaPeliculas, Comparadores.ordenarMayorAMenor);
        mostrarPeliculas();
    }

    public void mostrarPorTitulo() {
        Collections.sort(listaPeliculas, Comparadores.ordenarPorTitulo);
        mostrarPeliculas();
    }

    public void mostrarPorDirector() {
        Collections.sort(listaPeliculas, Comparadores.ordenarPorDirector);
        mostrarPeliculas();
    }

    public void mostrar1HoraEnAdelante() {

        for (Pelicula aux : listaPeliculas) {
            if (aux.getDuracion() >= 1) {
                //Collections.sort(listaPeliculas, Comparadores.ordenarMenorAMayor);
                System.out.println(aux.toString());
            }
        }
    }

}
