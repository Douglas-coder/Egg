package Colecciones.PracticalExercices.Paices;

import Colecciones.BonusExercises.Libreria.Libro;

import java.util.Objects;

public class Pais {

    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public Pais() {
        new PaisServices().fabricarPaises();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre pais: " + nombre + '\n';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pais pais = (Pais) o;
        return Objects.equals(nombre, pais.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
