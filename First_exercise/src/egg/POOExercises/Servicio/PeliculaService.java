package egg.POOExercises.Servicio;

import egg.POOExercises.Sentidad.Peliculas.Peliculas;

public class PeliculaService {
    Peliculas pelicula = new Peliculas();
    public void getServicioPeliculas(){

        pelicula.getCrearPelicula();

    }

    //?Metodo para mostrar los datos de las peliculas
    public String mostrarPeliculasCreadas(){

        String mostrar = "";

        mostrar += "Titulo: " + pelicula.getTitulo() + '\n';
        mostrar += "Genero: " + pelicula.getGenero() + '\n';
        mostrar += "Año: " + pelicula.getAnio() + '\n';
        mostrar += "Duración: " + pelicula.getDuracion() + '\n';

        return mostrar;

    }

}
