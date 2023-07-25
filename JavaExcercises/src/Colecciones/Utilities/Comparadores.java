package Colecciones.Utilities;

import Colecciones.Ejemplos.Mascota.Mascota;
import Colecciones.PracticalExercices.Perros;

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


}
