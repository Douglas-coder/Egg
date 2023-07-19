package POOExercises.Retos.Peliculas.Servicios;

import POOExercises.MainProgram.RefactorMain;
import POOExercises.Retos.Peliculas.Entidades.Peliculas;

public class PeliculaService extends Peliculas {


    //?Metodo para crear la palicula
    public void crearPelicula() {
        System.out.println("Ingrese el titulo de la pelicula:");
        setTitulo(RefactorMain.sc.next());
        System.out.println("Ingrese el genero de la pelicula:");
        setGenero(RefactorMain.sc.next());
        System.out.println("Ingrese el año de la pelicula:");
        setAnio(RefactorMain.sc.nextInt());
        System.out.println("Ingrese el duracion de la pelicula en minutos:");
        setDuracion(RefactorMain.sc.nextInt());
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
