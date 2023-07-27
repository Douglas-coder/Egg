package Colecciones.Utilities;

import Colecciones.Ejemplos.Mascota.Mascota;
import Colecciones.PracticalExercices.Cine.Pelicula;
import Colecciones.PracticalExercices.Perros.Perros;

import java.util.Comparator;

public class Comparadores {

    //* Comparador para ordenar por nombre decendente a la clase Mascotas
    public static Comparator<Mascota> ordenarPorNombreDesc = new Comparator<Mascota>() {
        @Override
        public int compare(Mascota o1, Mascota o2) {

            return o2.getNombre().compareTo(o1.getNombre());

        }
    };

    //* Comparador para ordenar por raza a la calse Perro
    public static Comparator<Perros> ordenarPorRaza = new Comparator<Perros>() {
        @Override
        public int compare(Perros o1, Perros o2) {
            return o1.getRaza().compareTo(o2.getRaza());
        }
    };


    // __________________ Cine ________________________

 /*   //*Comparador para ordenar peliculas +1 Hora
    public static Comparator<Pelicula> oredenar1Hora = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Double.compare((o1.getDuracion(), o2.getDuracion()));
        }
    };*/

    //*Comparador para ordenar peliculas de menor a mayor
    public static Comparator<Pelicula> ordenarMenorAMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Double.compare(o1.getDuracion(), o2.getDuracion());
        }
    };

    //*Comparador para ordenar peliculas de mayor a menor
    public static Comparator<Pelicula> ordenarMayorAMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return Double.compare(o2.getDuracion(), o1.getDuracion());
        }
    };

    //*Comparador para ordenar por titulo
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };

    //*Comparador para ordenar por director
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };


}
