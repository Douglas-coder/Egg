package egg.POOExercises.Servicio;

import egg.POOExercises.Sentidad.Peliculas.Alquiler;
import egg.POOExercises.Sentidad.Peliculas.Peliculas;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AlquilerService {

    PeliculaService peliculas = new PeliculaService();
    Alquiler alquiler = new Alquiler();
    Scanner sc = new Scanner(System.in);

    public void servicioAlquiler(){

        alquiler.getCrearAlquiler();
    }

    //?Metodo para comprobar los titulos de las peliculas a alquilar
    public boolean ComprobarPelicula(ArrayList<PeliculaService> peli){

        boolean esta = false;

        for (int x = 0; x < peli.size(); x++){
            if (Objects.equals(peli.get(x).pelicula.getTitulo(), alquiler.getPeliculaAlquilada())){
                esta = true;
            }
        }

        return esta;

    }

    public String mostrarPeliculasAlquiladas(){

        String mostrar = "";

        mostrar += "Titulo: " + alquiler.getPeliculaAlquilada() + '\n';
        mostrar += "Fecha inicio: " + alquiler.getFechaInicio() + '\n';
        mostrar += "Fecha final: " + alquiler.getFechaFin() + '\n';
        mostrar += "Precio: " + alquiler.getPrecio() + '\n';

        return mostrar;

    }

}
