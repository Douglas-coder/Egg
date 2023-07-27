package Colecciones.PracticalExercices.Alumnos;

import Colecciones.Main;

import java.util.ArrayList;
import java.util.List;

public class Alumno {

    AlumnoServices alumnoServices = new AlumnoServices();

    List<Integer> notas = new ArrayList<>();
    private String nombre;

    public Alumno(List<Integer> notas, String nombre) {
        this.notas = notas;
        this.nombre = nombre;
    }

    public Alumno() {
        alumnoServices.fabricaAlumnos();
        System.out.println("Ingresa el nombre del alumno que quieres ver su promedio");
        String nombreAlumno = Main.sc.next();
        alumnoServices.notaFinal(nombreAlumno);
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' +
                "Notas: " + notas + '\n';
    }

    public List<Integer> getNotas() {
        return notas;
    }

    public void setNotas(List<Integer> notas) {
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
