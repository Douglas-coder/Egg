package Colecciones.PracticalExercices.Alumnos;

import Colecciones.Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlumnoServices{

    List<Alumno> listaAlumno = new ArrayList<>();

    public Alumno crearAlumnos(){
        System.out.println("Ingrese el nombre del alumno");
        String nombre = Main.sc.next();
        List<Integer> listaNotas = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa la nota #" + (i + 1));
            int notas = Integer.parseInt(Main.sc.next());
            listaNotas.add(notas);
        }

        return new Alumno(listaNotas,nombre);
    }

    public void agregarAlumnos(Alumno a){ listaAlumno.add(a); }

    public void mostrarAlumnos(){
        System.out.println("Los alumnos son:" + '\n');
        for (Alumno aux : listaAlumno) {
            System.out.println(aux.toString());
        }
    }

    public void fabricaAlumnos(){
        String salir;

        do {
            for (int i = 0; i < 1; i++) {
                Alumno crearAlumno = crearAlumnos();
                agregarAlumnos(crearAlumno);
            }
            System.out.println("Desea agregar otro alumno? (S/N)");
            salir = Main.sc.next();
            System.out.println();

            if (salir.equalsIgnoreCase("N")){
                mostrarAlumnos();
            }

        }while (!salir.equalsIgnoreCase("N"));
    }

    public void notaFinal(String nombre){
        Alumno notaAlumno = null;
        int promedio = 0;
        int index = 0;

        //Validar que el alumno se encuentre
        for (Alumno aux : listaAlumno) {
            if (aux.getNombre().equalsIgnoreCase(nombre)){
                notaAlumno = aux;
                break;
            }
            index++;
        }

        if (notaAlumno == null){
            System.out.println("El alumno '" + nombre + "' no se encuentra registrado" + '\n');
        }else {
            int suma = 0;
            List<Integer> notasAlumnoIngresado = listaAlumno.get(index).getNotas();
            for (int i = 0; i < notasAlumnoIngresado.size(); i++) {
                suma += notasAlumnoIngresado.get(i);
            }
            promedio = suma / notasAlumnoIngresado.size();
            System.out.println("El promedio del alumno '" + nombre + "' es: " + promedio + '\n');
        }
    }

}
