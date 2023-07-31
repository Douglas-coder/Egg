package Colecciones.PracticalExercices.Paices;

public class Pais {

    private static String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public Pais() {
        new PaisServices().fabricarPaises();
    }

    public static String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Nombre pais: " + nombre + '\n';
    }
}
