package egg.POOExercises.Retos.servicios;

import egg.POOExercises.Retos.Entidades.Peliculas.Peliculas;

import java.util.Scanner;

public class PeliculaService extends Peliculas {
    Scanner sc = new Scanner(System.in);

    //?Metodo para crear la palicula
    public void crearPelicula() {
        System.out.println("Ingrese el titulo de la pelicula:");
        setTitulo(sc.nextLine());
        System.out.println("Ingrese el genero de la pelicula:");
        setGenero(sc.nextLine());
        System.out.println("Ingrese el año de la pelicula:");
        setAnio(sc.nextInt());
        System.out.println("Ingrese el duracion de la pelicula en minutos:");
        setDuracion(sc.nextInt());
    }

    //?Metodo para mostrar los datos de las peliculas
    @Override
    public String toString() {
        return "Titulo: " + getTitulo() + '\n' +
                "Genero: " + getGenero() + '\n' +
                "Año: " + getAnio() + '\n' +
                "Diracion: " + getDuracion() + '\n';
    }

}
