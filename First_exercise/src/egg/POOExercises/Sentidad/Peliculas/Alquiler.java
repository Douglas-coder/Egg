package egg.POOExercises.Sentidad.Peliculas;

import java.time.LocalDate;
import java.util.Scanner;

public class Alquiler {

    Scanner sc = new Scanner(System.in);
    private String peliculaAlquilada;
    private LocalDate fechaInicio = LocalDate.now();
    private LocalDate fechaFin;
    private double precio;

    public Alquiler(String peliculaAlquilada, LocalDate fechaInicio, LocalDate fechaFin, double precio) {
        this.peliculaAlquilada = peliculaAlquilada;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.precio = precio;
    }

    public Alquiler() {
    }

    //?Metodo crear alquiler
    public void getCrearAlquiler(){
        System.out.println("Ingrese el nombre de la pelicula a alquilar:");
        setPeliculaAlquilada(sc.nextLine());

        System.out.println("Ingrese la fecha inicio del alquiler:");
        System.out.println("Dia:");
        int diaI = sc.nextInt();
        System.out.println("Mes:");
        int mesI = sc.nextInt();
        System.out.println("Año:");
        int anioI = sc.nextInt();
        setFechaInicio(LocalDate.of(anioI,mesI,diaI));

        System.out.println("Ingrese la fecha final del alquiler:");
        System.out.println("Dia:");
        int diaF = sc.nextInt();
        System.out.println("Mes:");
        int mesF = sc.nextInt();
        System.out.println("Año:");
        int anioF = sc.nextInt();
        setFechaFin(LocalDate.of(anioF,mesF,diaF));

    }

    public String getPeliculaAlquilada() {
        return peliculaAlquilada;
    }

    public void setPeliculaAlquilada(String peliculaAlquilada) {
        this.peliculaAlquilada = peliculaAlquilada;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
