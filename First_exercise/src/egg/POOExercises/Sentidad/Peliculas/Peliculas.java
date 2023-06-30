package egg.POOExercises.Sentidad.Peliculas;

import java.util.ArrayList;
import java.util.Scanner;

public class Peliculas {

    Scanner sc = new Scanner(System.in);
    private String titulo;
    private String genero;
    private int anio;
    private int duracion;

    public Peliculas(String titulo, String genero, int anio, int duracion) {
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.duracion = duracion;
    }

    public Peliculas() {
    }

    //?Metodo para crear la palicula
    public void getCrearPelicula(){
        System.out.println("Ingrese el titulo de la pelicula:");
        setTitulo(sc.nextLine());
        System.out.println("Ingrese el genero de la pelicula:");
        setGenero(sc.nextLine());
        System.out.println("Ingrese el año de la pelicula:");
        setAnio(sc.nextInt());
        System.out.println("Ingrese el duracion de la pelicula en minutos:");
        setDuracion(sc.nextInt());
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
